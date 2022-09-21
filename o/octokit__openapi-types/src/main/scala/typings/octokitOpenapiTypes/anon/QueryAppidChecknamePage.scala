package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAppidChecknamePage extends StObject {
  
  var path: OwnerRefRepo
  
  var query: AppidChecknamePage
}
object QueryAppidChecknamePage {
  
  inline def apply(path: OwnerRefRepo, query: AppidChecknamePage): QueryAppidChecknamePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAppidChecknamePage]
  }
  
  extension [Self <: QueryAppidChecknamePage](x: Self) {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AppidChecknamePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
