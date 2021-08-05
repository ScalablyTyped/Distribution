package typings.phonegapPluginPush

import typings.phonegapPluginPush.PhonegapPluginPush.PushNotificationStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var PushNotification: PushNotificationStatic
}
object Window {
  
  inline def apply(PushNotification: PushNotificationStatic): Window = {
    val __obj = js.Dynamic.literal(PushNotification = PushNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setPushNotification(value: PushNotificationStatic): Self = StObject.set(x, "PushNotification", value.asInstanceOf[js.Any])
  }
}
