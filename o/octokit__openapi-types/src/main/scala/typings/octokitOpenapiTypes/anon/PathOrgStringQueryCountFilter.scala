package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgStringQueryCountFilter extends StObject {
  
  var path: OrgString
  
  var query: CountFilter
}
object PathOrgStringQueryCountFilter {
  
  inline def apply(path: OrgString, query: CountFilter): PathOrgStringQueryCountFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgStringQueryCountFilter]
  }
  
  extension [Self <: PathOrgStringQueryCountFilter](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: CountFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
