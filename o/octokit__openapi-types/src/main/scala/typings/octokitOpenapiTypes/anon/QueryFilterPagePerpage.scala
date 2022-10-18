package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilterPagePerpage extends StObject {
  
  var path: OrgString
  
  var query: FilterPagePerpage
}
object QueryFilterPagePerpage {
  
  inline def apply(path: OrgString, query: FilterPagePerpage): QueryFilterPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilterPagePerpage]
  }
  
  extension [Self <: QueryFilterPagePerpage](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: FilterPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
