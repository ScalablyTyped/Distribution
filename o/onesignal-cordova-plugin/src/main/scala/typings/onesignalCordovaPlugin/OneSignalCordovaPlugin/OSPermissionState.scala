package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSPermissionState extends js.Object {
  var hasPrompted: Boolean = js.native
  var provisional: Boolean = js.native
  var state: OSNotificationPermissionState = js.native
  var status: OSNotificationPermission = js.native
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
  @scala.inline
  implicit class OSPermissionStateOps[Self <: OSPermissionState] (val x: Self) extends AnyVal {
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
    def setHasPrompted(value: Boolean): Self = this.set("hasPrompted", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisional(value: Boolean): Self = this.set("provisional", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: OSNotificationPermissionState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: OSNotificationPermission): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

