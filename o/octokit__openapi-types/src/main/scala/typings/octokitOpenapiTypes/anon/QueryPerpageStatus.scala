package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageStatus extends StObject {
  
  var path: OwnerRefRepo
  
  var query: PerpageStatus
}
object QueryPerpageStatus {
  
  inline def apply(path: OwnerRefRepo, query: PerpageStatus): QueryPerpageStatus = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageStatus]
  }
  
  extension [Self <: QueryPerpageStatus](x: Self) {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageStatus): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
