package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationId extends StObject {
  
  var notificationId: String = js.native
}
object NotificationId {
  
  @scala.inline
  def apply(notificationId: String): NotificationId = {
    val __obj = js.Dynamic.literal(notificationId = notificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationId]
  }
  
  @scala.inline
  implicit class NotificationIdMutableBuilder[Self <: NotificationId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationId(value: String): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
  }
}
