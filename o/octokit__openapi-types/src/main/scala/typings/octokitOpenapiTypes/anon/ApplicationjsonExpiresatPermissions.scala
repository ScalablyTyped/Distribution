package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExpiresatPermissions extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ExpiresatPermissions
}
object ApplicationjsonExpiresatPermissions {
  
  inline def apply(applicationSlashjson: ExpiresatPermissions): ApplicationjsonExpiresatPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExpiresatPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonExpiresatPermissions] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ExpiresatPermissions): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
