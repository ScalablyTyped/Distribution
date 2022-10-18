package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  var contentUrl: js.UndefOr[String] = js.undefined
  
  var description: String
  
  var duration: js.UndefOr[String] = js.undefined
  
  var embedUrl: js.UndefOr[String] = js.undefined
  
  var expires: js.UndefOr[String] = js.undefined
  
  var hasPart: js.UndefOr[Clip | js.Array[Clip]] = js.undefined
  
  var name: String
  
  var publication: js.UndefOr[BroadcastEvent | js.Array[BroadcastEvent]] = js.undefined
  
  var regionsAllowed: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var thumbnailUrls: js.Array[String]
  
  var uploadDate: String
  
  var watchCount: js.UndefOr[Double] = js.undefined
}
object Video {
  
  inline def apply(description: String, name: String, thumbnailUrls: js.Array[String], uploadDate: String): Video = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnailUrls = thumbnailUrls.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
  
  extension [Self <: Video](x: Self) {
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEmbedUrl(value: String): Self = StObject.set(x, "embedUrl", value.asInstanceOf[js.Any])
    
    inline def setEmbedUrlUndefined: Self = StObject.set(x, "embedUrl", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHasPart(value: Clip | js.Array[Clip]): Self = StObject.set(x, "hasPart", value.asInstanceOf[js.Any])
    
    inline def setHasPartUndefined: Self = StObject.set(x, "hasPart", js.undefined)
    
    inline def setHasPartVarargs(value: Clip*): Self = StObject.set(x, "hasPart", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublication(value: BroadcastEvent | js.Array[BroadcastEvent]): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    inline def setPublicationUndefined: Self = StObject.set(x, "publication", js.undefined)
    
    inline def setPublicationVarargs(value: BroadcastEvent*): Self = StObject.set(x, "publication", js.Array(value*))
    
    inline def setRegionsAllowed(value: String | js.Array[String]): Self = StObject.set(x, "regionsAllowed", value.asInstanceOf[js.Any])
    
    inline def setRegionsAllowedUndefined: Self = StObject.set(x, "regionsAllowed", js.undefined)
    
    inline def setRegionsAllowedVarargs(value: String*): Self = StObject.set(x, "regionsAllowed", js.Array(value*))
    
    inline def setThumbnailUrls(value: js.Array[String]): Self = StObject.set(x, "thumbnailUrls", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlsVarargs(value: String*): Self = StObject.set(x, "thumbnailUrls", js.Array(value*))
    
    inline def setUploadDate(value: String): Self = StObject.set(x, "uploadDate", value.asInstanceOf[js.Any])
    
    inline def setWatchCount(value: Double): Self = StObject.set(x, "watchCount", value.asInstanceOf[js.Any])
    
    inline def setWatchCountUndefined: Self = StObject.set(x, "watchCount", js.undefined)
  }
}
