package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPinned extends StObject {
  
  var path: Teamslug
  
  var query: Pinned
}
object QueryPinned {
  
  inline def apply(path: Teamslug, query: Pinned): QueryPinned = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPinned]
  }
  
  extension [Self <: QueryPinned](x: Self) {
    
    inline def setPath(value: Teamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Pinned): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
