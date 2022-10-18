package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPermissionUser extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: PermissionUser
}
object ApplicationjsonPermissionUser {
  
  inline def apply(applicationSlashjson: PermissionUser): ApplicationjsonPermissionUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPermissionUser]
  }
  
  extension [Self <: ApplicationjsonPermissionUser](x: Self) {
    
    inline def setApplicationSlashjson(value: PermissionUser): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
