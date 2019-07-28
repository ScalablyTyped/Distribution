package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSPermissionState extends js.Object {
  var hasPrompted: Boolean
  var status: OSNotificationPermission
}

object OSPermissionState {
  @scala.inline
  def apply(hasPrompted: Boolean, status: OSNotificationPermission): OSPermissionState = {
    val __obj = js.Dynamic.literal(hasPrompted = hasPrompted, status = status)
  
    __obj.asInstanceOf[OSPermissionState]
  }
}

