package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

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
    val __obj = js.Dynamic.literal(hasPrompted = hasPrompted.asInstanceOf[js.Any], provisional = provisional.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OSPermissionState]
  }
}

