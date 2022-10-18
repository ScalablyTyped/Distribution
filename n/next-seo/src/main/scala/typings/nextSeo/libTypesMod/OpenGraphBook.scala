package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphBook extends StObject {
  
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  
  var isbn: js.UndefOr[String] = js.undefined
  
  var releaseDate: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object OpenGraphBook {
  
  inline def apply(): OpenGraphBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraphBook]
  }
  
  extension [Self <: OpenGraphBook](x: Self) {
    
    inline def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setIsbn(value: String): Self = StObject.set(x, "isbn", value.asInstanceOf[js.Any])
    
    inline def setIsbnUndefined: Self = StObject.set(x, "isbn", js.undefined)
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
