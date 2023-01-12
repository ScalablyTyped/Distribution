package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRoleState extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RoleState
}
object ApplicationjsonRoleState {
  
  inline def apply(applicationSlashjson: RoleState): ApplicationjsonRoleState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRoleState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRoleState] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RoleState): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
