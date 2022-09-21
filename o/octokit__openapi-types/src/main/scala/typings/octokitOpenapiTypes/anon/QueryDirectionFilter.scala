package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirectionFilter extends StObject {
  
  var path: OrgString
  
  var query: DirectionFilter
}
object QueryDirectionFilter {
  
  inline def apply(path: OrgString, query: DirectionFilter): QueryDirectionFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirectionFilter]
  }
  
  extension [Self <: QueryDirectionFilter](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
