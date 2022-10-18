package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilter extends StObject {
  
  var path: OrgString
  
  var query: Filter
}
object QueryFilter {
  
  inline def apply(path: OrgString, query: Filter): QueryFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilter]
  }
  
  extension [Self <: QueryFilter](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Filter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
