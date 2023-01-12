package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPermissions extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Permissions
}
object ApplicationjsonPermissions {
  
  inline def apply(applicationSlashjson: Permissions): ApplicationjsonPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonPermissions] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Permissions): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
