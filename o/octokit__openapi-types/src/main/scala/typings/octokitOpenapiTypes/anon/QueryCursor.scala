package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCursor extends StObject {
  
  var path: Hookid
  
  var query: Cursor
}
object QueryCursor {
  
  inline def apply(path: Hookid, query: Cursor): QueryCursor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryCursor] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Hookid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Cursor): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
