package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.anon.ActionID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSNotificationOpenedResult extends js.Object {
  
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
  implicit class OSNotificationOpenedResultOps[Self <: OSNotificationOpenedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: ActionID): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: OSNotification): Self = this.set("notification", value.asInstanceOf[js.Any])
  }
}
