package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberOwnerQuery309 extends StObject {
  
  var path: AlertnumberOwner
  
  var query: `309`
}
object PathAlertnumberOwnerQuery309 {
  
  inline def apply(path: AlertnumberOwner, query: `309`): PathAlertnumberOwnerQuery309 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberOwnerQuery309]
  }
  
  extension [Self <: PathAlertnumberOwnerQuery309](x: Self) {
    
    inline def setPath(value: AlertnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `309`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
