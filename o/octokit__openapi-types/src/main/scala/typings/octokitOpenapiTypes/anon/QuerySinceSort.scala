package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySinceSort extends StObject {
  
  var path: OwnerRepo
  
  var query: SinceSort
}
object QuerySinceSort {
  
  inline def apply(path: OwnerRepo, query: SinceSort): QuerySinceSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySinceSort]
  }
  
  extension [Self <: QuerySinceSort](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: SinceSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
