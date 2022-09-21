package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberOwnerQuery451 extends StObject {
  
  var path: AlertnumberOwner
  
  var query: `451`
}
object PathAlertnumberOwnerQuery451 {
  
  inline def apply(path: AlertnumberOwner, query: `451`): PathAlertnumberOwnerQuery451 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberOwnerQuery451]
  }
  
  extension [Self <: PathAlertnumberOwnerQuery451](x: Self) {
    
    inline def setPath(value: AlertnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `451`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
