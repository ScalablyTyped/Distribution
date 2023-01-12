package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPermissionRolename extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: PermissionRolename
}
object ApplicationjsonPermissionRolename {
  
  inline def apply(applicationSlashjson: PermissionRolename): ApplicationjsonPermissionRolename = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPermissionRolename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonPermissionRolename] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: PermissionRolename): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
