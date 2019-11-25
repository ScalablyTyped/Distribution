package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin

import typings.onesignalDashCordovaDashPlugin.Anon_ActionID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotificationOpenedResult extends js.Object {
  var action: Anon_ActionID
  var notification: OSNotification
}

object OSNotificationOpenedResult {
  @scala.inline
  def apply(action: Anon_ActionID, notification: OSNotification): OSNotificationOpenedResult = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OSNotificationOpenedResult]
  }
}

