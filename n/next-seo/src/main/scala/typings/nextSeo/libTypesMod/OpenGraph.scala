package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraph extends StObject {
  
  var article: js.UndefOr[OpenGraphArticle] = js.undefined
  
  var audio: js.UndefOr[js.Array[OpenGraphMedia]] = js.undefined
  
  var book: js.UndefOr[OpenGraphBook] = js.undefined
  
  var defaultImageHeight: js.UndefOr[Double] = js.undefined
  
  var defaultImageWidth: js.UndefOr[Double] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var images: js.UndefOr[js.Array[OpenGraphMedia]] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var profile: js.UndefOr[OpenGraphProfile] = js.undefined
  
  var site_name: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var video: js.UndefOr[OpenGraphVideo] = js.undefined
  
  var videos: js.UndefOr[js.Array[OpenGraphMedia]] = js.undefined
}
object OpenGraph {
  
  inline def apply(): OpenGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraph]
  }
  
  extension [Self <: OpenGraph](x: Self) {
    
    inline def setArticle(value: OpenGraphArticle): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
    
    inline def setArticleUndefined: Self = StObject.set(x, "article", js.undefined)
    
    inline def setAudio(value: js.Array[OpenGraphMedia]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setAudioVarargs(value: OpenGraphMedia*): Self = StObject.set(x, "audio", js.Array(value*))
    
    inline def setBook(value: OpenGraphBook): Self = StObject.set(x, "book", value.asInstanceOf[js.Any])
    
    inline def setBookUndefined: Self = StObject.set(x, "book", js.undefined)
    
    inline def setDefaultImageHeight(value: Double): Self = StObject.set(x, "defaultImageHeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultImageHeightUndefined: Self = StObject.set(x, "defaultImageHeight", js.undefined)
    
    inline def setDefaultImageWidth(value: Double): Self = StObject.set(x, "defaultImageWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultImageWidthUndefined: Self = StObject.set(x, "defaultImageWidth", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImages(value: js.Array[OpenGraphMedia]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: OpenGraphMedia*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setProfile(value: OpenGraphProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSite_name(value: String): Self = StObject.set(x, "site_name", value.asInstanceOf[js.Any])
    
    inline def setSite_nameUndefined: Self = StObject.set(x, "site_name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVideo(value: OpenGraphVideo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setVideos(value: js.Array[OpenGraphMedia]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
    
    inline def setVideosUndefined: Self = StObject.set(x, "videos", js.undefined)
    
    inline def setVideosVarargs(value: OpenGraphMedia*): Self = StObject.set(x, "videos", js.Array(value*))
  }
}
