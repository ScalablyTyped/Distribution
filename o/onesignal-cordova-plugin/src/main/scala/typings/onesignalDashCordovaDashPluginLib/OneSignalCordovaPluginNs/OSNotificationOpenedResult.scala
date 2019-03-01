package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotificationOpenedResult extends js.Object {
  var action: onesignalDashCordovaDashPluginLib.Anon_ActionID
  var notification: OSNotification
}

object OSNotificationOpenedResult {
  @scala.inline
  def apply(action: onesignalDashCordovaDashPluginLib.Anon_ActionID, notification: OSNotification): OSNotificationOpenedResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("notification")(notification)
    __obj.asInstanceOf[OSNotificationOpenedResult]
  }
}

