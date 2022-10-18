package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentUrl extends StObject {
  
  var `@context`: js.UndefOr[String] = js.undefined
  
  var `@type`: String
  
  var contentUrl: js.UndefOr[String] = js.undefined
  
  var description: String
  
  var duration: js.UndefOr[String] = js.undefined
  
  var embedUrl: js.UndefOr[String] = js.undefined
  
  var expires: js.UndefOr[String] = js.undefined
  
  var hasPart: js.UndefOr[StartOffset | js.Array[StartOffset]] = js.undefined
  
  var interactionStatistic: js.UndefOr[InteractionType] = js.undefined
  
  var name: String
  
  var publication: js.UndefOr[EndDate | js.Array[EndDate]] = js.undefined
  
  var regionsAllowed: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var thumbnailUrl: js.Array[String]
  
  var uploadDate: String
}
object ContentUrl {
  
  inline def apply(
    `@type`: String,
    description: String,
    name: String,
    thumbnailUrl: js.Array[String],
    uploadDate: String
  ): ContentUrl = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnailUrl = thumbnailUrl.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentUrl]
  }
  
  extension [Self <: ContentUrl](x: Self) {
    
    inline def `set@context`(value: String): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
    
    inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEmbedUrl(value: String): Self = StObject.set(x, "embedUrl", value.asInstanceOf[js.Any])
    
    inline def setEmbedUrlUndefined: Self = StObject.set(x, "embedUrl", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHasPart(value: StartOffset | js.Array[StartOffset]): Self = StObject.set(x, "hasPart", value.asInstanceOf[js.Any])
    
    inline def setHasPartUndefined: Self = StObject.set(x, "hasPart", js.undefined)
    
    inline def setHasPartVarargs(value: StartOffset*): Self = StObject.set(x, "hasPart", js.Array(value*))
    
    inline def setInteractionStatistic(value: InteractionType): Self = StObject.set(x, "interactionStatistic", value.asInstanceOf[js.Any])
    
    inline def setInteractionStatisticUndefined: Self = StObject.set(x, "interactionStatistic", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublication(value: EndDate | js.Array[EndDate]): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    inline def setPublicationUndefined: Self = StObject.set(x, "publication", js.undefined)
    
    inline def setPublicationVarargs(value: EndDate*): Self = StObject.set(x, "publication", js.Array(value*))
    
    inline def setRegionsAllowed(value: String | js.Array[String]): Self = StObject.set(x, "regionsAllowed", value.asInstanceOf[js.Any])
    
    inline def setRegionsAllowedUndefined: Self = StObject.set(x, "regionsAllowed", js.undefined)
    
    inline def setRegionsAllowedVarargs(value: String*): Self = StObject.set(x, "regionsAllowed", js.Array(value*))
    
    inline def setThumbnailUrl(value: js.Array[String]): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlVarargs(value: String*): Self = StObject.set(x, "thumbnailUrl", js.Array(value*))
    
    inline def setUploadDate(value: String): Self = StObject.set(x, "uploadDate", value.asInstanceOf[js.Any])
  }
}
