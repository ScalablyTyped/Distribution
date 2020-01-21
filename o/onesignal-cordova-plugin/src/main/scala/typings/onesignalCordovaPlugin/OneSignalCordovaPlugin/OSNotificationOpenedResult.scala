package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.AnonActionID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotificationOpenedResult extends js.Object {
  var action: AnonActionID
  var notification: OSNotification
}

object OSNotificationOpenedResult {
  @scala.inline
  def apply(action: AnonActionID, notification: OSNotification): OSNotificationOpenedResult = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OSNotificationOpenedResult]
  }
}

