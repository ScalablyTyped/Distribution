package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSPermissionState extends js.Object {
  var hasPrompted: Boolean
  var provisional: Boolean
  var state: OSNotificationPermissionState
  var status: OSNotificationPermission
}

object OSPermissionState {
  @scala.inline
  def apply(
    hasPrompted: Boolean,
    provisional: Boolean,
    state: OSNotificationPermissionState,
    status: OSNotificationPermission
  ): OSPermissionState = {
    val __obj = js.Dynamic.literal(hasPrompted = hasPrompted, provisional = provisional, state = state, status = status)
  
    __obj.asInstanceOf[OSPermissionState]
  }
}

