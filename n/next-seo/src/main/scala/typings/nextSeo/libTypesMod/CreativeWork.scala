package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeWork extends StObject {
  
  var about: String
  
  var audience: js.UndefOr[String] = js.undefined
  
  var author: String
  
  var datePublished: String
  
  var image: js.UndefOr[String] = js.undefined
  
  var keywords: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var thumbnailUrl: js.UndefOr[String] = js.undefined
}
object CreativeWork {
  
  inline def apply(about: String, author: String, datePublished: String, name: String): CreativeWork = {
    val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], datePublished = datePublished.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeWork]
  }
  
  extension [Self <: CreativeWork](x: Self) {
    
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
