package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCursorPerpage extends StObject {
  
  var query: CursorPerpage
}
object QueryCursorPerpage {
  
  inline def apply(query: CursorPerpage): QueryCursorPerpage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCursorPerpage]
  }
  
  extension [Self <: QueryCursorPerpage](x: Self) {
    
    inline def setQuery(value: CursorPerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
