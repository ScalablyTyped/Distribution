package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameOwnerQuery250 extends StObject {
  
  var path: EnvironmentnameOwner
  
  var query: `250`
}
object PathEnvironmentnameOwnerQuery250 {
  
  inline def apply(path: EnvironmentnameOwner, query: `250`): PathEnvironmentnameOwnerQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameOwnerQuery250]
  }
  
  extension [Self <: PathEnvironmentnameOwnerQuery250](x: Self) {
    
    inline def setPath(value: EnvironmentnameOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
