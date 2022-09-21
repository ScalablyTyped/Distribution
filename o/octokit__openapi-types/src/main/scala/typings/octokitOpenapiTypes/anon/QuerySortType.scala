package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySortType extends StObject {
  
  var path: `361`
  
  var query: SortType
}
object QuerySortType {
  
  inline def apply(path: `361`, query: SortType): QuerySortType = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySortType]
  }
  
  extension [Self <: QuerySortType](x: Self) {
    
    inline def setPath(value: `361`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: SortType): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
