package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberOwner extends StObject {
  
  var path: AlertnumberOwner
}
object PathAlertnumberOwner {
  
  inline def apply(path: AlertnumberOwner): PathAlertnumberOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberOwner]
  }
  
  extension [Self <: PathAlertnumberOwner](x: Self) {
    
    inline def setPath(value: AlertnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
