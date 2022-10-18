package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphArticle extends StObject {
  
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  
  var expirationTime: js.UndefOr[String] = js.undefined
  
  var modifiedTime: js.UndefOr[String] = js.undefined
  
  var publishedTime: js.UndefOr[String] = js.undefined
  
  var section: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object OpenGraphArticle {
  
  inline def apply(): OpenGraphArticle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraphArticle]
  }
  
  extension [Self <: OpenGraphArticle](x: Self) {
    
    inline def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    inline def setPublishedTime(value: String): Self = StObject.set(x, "publishedTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedTimeUndefined: Self = StObject.set(x, "publishedTime", js.undefined)
    
    inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
