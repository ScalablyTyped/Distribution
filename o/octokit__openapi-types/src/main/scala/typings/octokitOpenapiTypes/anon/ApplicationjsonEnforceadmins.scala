package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnforceadmins extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Enforceadmins
}
object ApplicationjsonEnforceadmins {
  
  inline def apply(applicationSlashjson: Enforceadmins): ApplicationjsonEnforceadmins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnforceadmins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEnforceadmins] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Enforceadmins): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
