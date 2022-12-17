package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpagePinned extends StObject {
  
  var path: TeamslugString
  
  var query: PerpagePinned
}
object QueryPerpagePinned {
  
  inline def apply(path: TeamslugString, query: PerpagePinned): QueryPerpagePinned = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpagePinned]
  }
  
  extension [Self <: QueryPerpagePinned](x: Self) {
    
    inline def setPath(value: TeamslugString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpagePinned): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
