package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageSinceSort extends StObject {
  
  var path: OwnerString
  
  var query: PerpageSinceSort
}
object QueryPerpageSinceSort {
  
  inline def apply(path: OwnerString, query: PerpageSinceSort): QueryPerpageSinceSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageSinceSort]
  }
  
  extension [Self <: QueryPerpageSinceSort](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSinceSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
