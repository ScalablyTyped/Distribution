package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageRole extends StObject {
  
  var path: OrgString
  
  var query: PagePerpageRole
}
object QueryPagePerpageRole {
  
  inline def apply(path: OrgString, query: PagePerpageRole): QueryPagePerpageRole = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageRole]
  }
  
  extension [Self <: QueryPagePerpageRole](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageRole): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
