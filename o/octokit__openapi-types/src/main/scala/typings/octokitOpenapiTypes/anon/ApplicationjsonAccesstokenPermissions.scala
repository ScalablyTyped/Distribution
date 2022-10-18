package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAccesstokenPermissions extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AccesstokenPermissions
}
object ApplicationjsonAccesstokenPermissions {
  
  inline def apply(applicationSlashjson: AccesstokenPermissions): ApplicationjsonAccesstokenPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAccesstokenPermissions]
  }
  
  extension [Self <: ApplicationjsonAccesstokenPermissions](x: Self) {
    
    inline def setApplicationSlashjson(value: AccesstokenPermissions): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
