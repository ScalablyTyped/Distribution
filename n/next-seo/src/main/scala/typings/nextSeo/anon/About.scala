package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait About extends StObject {
  
  var `@type`: String
  
  var about: String
  
  var audience: js.UndefOr[String] = js.undefined
  
  var author: String
  
  var datePublished: String
  
  var image: js.UndefOr[String] = js.undefined
  
  var keywords: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var thumbnailUrl: js.UndefOr[String] = js.undefined
}
object About {
  
  inline def apply(`@type`: String, about: String, author: String, datePublished: String, name: String): About = {
    val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], datePublished = datePublished.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[About]
  }
  
  extension [Self <: About](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDatePublished(value: String): Self = StObject.set(x, "datePublished", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
