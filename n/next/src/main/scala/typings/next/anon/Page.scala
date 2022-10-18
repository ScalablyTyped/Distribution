package typings.next.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var page: String
  
  var query: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
}
object Page {
  
  inline def apply(page: String): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  extension [Self <: Page](x: Self) {
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
