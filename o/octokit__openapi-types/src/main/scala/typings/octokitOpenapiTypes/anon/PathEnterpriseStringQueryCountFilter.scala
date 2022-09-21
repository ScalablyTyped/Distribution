package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseStringQueryCountFilter extends StObject {
  
  var path: EnterpriseString
  
  var query: CountFilter
}
object PathEnterpriseStringQueryCountFilter {
  
  inline def apply(path: EnterpriseString, query: CountFilter): PathEnterpriseStringQueryCountFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseStringQueryCountFilter]
  }
  
  extension [Self <: PathEnterpriseStringQueryCountFilter](x: Self) {
    
    inline def setPath(value: EnterpriseString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: CountFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
