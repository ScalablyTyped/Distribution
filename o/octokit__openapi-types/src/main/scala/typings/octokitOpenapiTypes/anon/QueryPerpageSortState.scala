package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageSortState extends StObject {
  
  var path: OwnerString
  
  var query: PerpageSortState
}
object QueryPerpageSortState {
  
  inline def apply(path: OwnerString, query: PerpageSortState): QueryPerpageSortState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageSortState]
  }
  
  extension [Self <: QueryPerpageSortState](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSortState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
