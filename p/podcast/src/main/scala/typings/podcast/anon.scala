package typings.podcast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FeedUrl_ extends StObject {
    
    var feedUrl: String
  }
  object FeedUrl_ {
    
    inline def apply(feedUrl: String): FeedUrl_ = {
      val __obj = js.Dynamic.literal(feedUrl = feedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedUrl_]
    }
    
    extension [Self <: FeedUrl_](x: Self) {
      
      inline def setFeedUrl(value: String): Self = StObject.set(x, "feedUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Feedurl extends StObject {
    
    var feed_url: String
  }
  object Feedurl {
    
    inline def apply(feed_url: String): Feedurl = {
      val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feedurl]
    }
    
    extension [Self <: Feedurl](x: Self) {
      
      inline def setFeed_url(value: String): Self = StObject.set(x, "feed_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageUrl_ extends StObject {
    
    var imageUrl: js.UndefOr[String] = js.undefined
  }
  object ImageUrl_ {
    
    inline def apply(): ImageUrl_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageUrl_]
    }
    
    extension [Self <: ImageUrl_](x: Self) {
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    }
  }
  
  trait Imageurl extends StObject {
    
    var image_url: js.UndefOr[String] = js.undefined
  }
  object Imageurl {
    
    inline def apply(): Imageurl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imageurl]
    }
    
    extension [Self <: Imageurl](x: Self) {
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
    }
  }
  
  trait SiteUrl_ extends StObject {
    
    var siteUrl: String
  }
  object SiteUrl_ {
    
    inline def apply(siteUrl: String): SiteUrl_ = {
      val __obj = js.Dynamic.literal(siteUrl = siteUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiteUrl_]
    }
    
    extension [Self <: SiteUrl_](x: Self) {
      
      inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Siteurl extends StObject {
    
    var site_url: String
  }
  object Siteurl {
    
    inline def apply(site_url: String): Siteurl = {
      val __obj = js.Dynamic.literal(site_url = site_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Siteurl]
    }
    
    extension [Self <: Siteurl](x: Self) {
      
      inline def setSite_url(value: String): Self = StObject.set(x, "site_url", value.asInstanceOf[js.Any])
    }
  }
}
