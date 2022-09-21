package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPer extends StObject {
  
  var path: Owner
  
  var query: Per
}
object QueryPer {
  
  inline def apply(path: Owner, query: Per): QueryPer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPer]
  }
  
  extension [Self <: QueryPer](x: Self) {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Per): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
