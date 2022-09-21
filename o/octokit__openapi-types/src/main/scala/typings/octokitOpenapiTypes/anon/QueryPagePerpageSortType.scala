package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageSortType extends StObject {
  
  var path: `599`
  
  var query: PagePerpageSortType
}
object QueryPagePerpageSortType {
  
  inline def apply(path: `599`, query: PagePerpageSortType): QueryPagePerpageSortType = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageSortType]
  }
  
  extension [Self <: QueryPagePerpageSortType](x: Self) {
    
    inline def setPath(value: `599`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSortType): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
