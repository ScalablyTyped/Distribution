package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilterPage extends StObject {
  
  var path: Org
  
  var query: FilterPage
}
object QueryFilterPage {
  
  inline def apply(path: Org, query: FilterPage): QueryFilterPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilterPage]
  }
  
  extension [Self <: QueryFilterPage](x: Self) {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: FilterPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
