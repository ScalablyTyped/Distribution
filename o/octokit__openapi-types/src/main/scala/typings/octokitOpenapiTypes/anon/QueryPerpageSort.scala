package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageSort extends StObject {
  
  var path: OwnerRepo
  
  var query: PerpageSort
}
object QueryPerpageSort {
  
  inline def apply(path: OwnerRepo, query: PerpageSort): QueryPerpageSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageSort]
  }
  
  extension [Self <: QueryPerpageSort](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
