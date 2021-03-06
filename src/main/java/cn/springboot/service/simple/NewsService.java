package cn.springboot.service.simple;

import cn.springboot.model.simple.News;
import com.github.pagehelper.PageInfo;

import java.util.List;

/** 
 * @Description 新闻接口类
 * @author 王鑫 
 * @date Mar 16, 2017 5:19:14 PM  
 */
public interface NewsService {

    public boolean addNews(News news);

    public boolean editNews(News news);

    public News findNewsById(String newsId);

    public List<News> findNewsByKeywords(String keywords);

    public PageInfo<News> findNewsByPage(Integer pageNum, String keywords);

    public PageInfo<News> findNewsByPage1(Integer pageNum, String keywords);

    public PageInfo<News> findNewsByPage2(Integer pageNum, String keywords);

}