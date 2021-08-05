package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationId extends StObject {
  
  var notificationId: String
}
object NotificationId {
  
  inline def apply(notificationId: String): NotificationId = {
    val __obj = js.Dynamic.literal(notificationId = notificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationId]
  }
  
  extension [Self <: NotificationId](x: Self) {
    
    inline def setNotificationId(value: String): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
  }
}
