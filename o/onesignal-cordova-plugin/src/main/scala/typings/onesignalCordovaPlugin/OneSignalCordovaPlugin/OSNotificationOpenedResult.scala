package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.anon.ActionID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotificationOpenedResult extends js.Object {
  var action: ActionID
  var notification: OSNotification
}

object OSNotificationOpenedResult {
  @scala.inline
  def apply(action: ActionID, notification: OSNotification): OSNotificationOpenedResult = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationOpenedResult]
  }
}

