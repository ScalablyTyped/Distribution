package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageState extends StObject {
  
  var path: OrgString
  
  var query: PagePerpageState
}
object QueryPagePerpageState {
  
  inline def apply(path: OrgString, query: PagePerpageState): QueryPagePerpageState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageState]
  }
  
  extension [Self <: QueryPagePerpageState](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
