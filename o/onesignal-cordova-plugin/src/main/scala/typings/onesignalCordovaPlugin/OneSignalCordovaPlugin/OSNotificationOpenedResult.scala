package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.anon.ActionID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSNotificationOpenedResult extends StObject {
  
  var action: ActionID = js.native
  
  var notification: OSNotification = js.native
}
object OSNotificationOpenedResult {
  
  @scala.inline
  def apply(action: ActionID, notification: OSNotification): OSNotificationOpenedResult = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationOpenedResult]
  }
  
  @scala.inline
  implicit class OSNotificationOpenedResultMutableBuilder[Self <: OSNotificationOpenedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionID): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: OSNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
  }
}
