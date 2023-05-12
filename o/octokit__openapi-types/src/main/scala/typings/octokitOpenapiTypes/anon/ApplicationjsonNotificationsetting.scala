package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNotificationsetting extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Notificationsetting
}
object ApplicationjsonNotificationsetting {
  
  inline def apply(applicationSlashjson: Notificationsetting): ApplicationjsonNotificationsetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNotificationsetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNotificationsetting] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Notificationsetting): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
