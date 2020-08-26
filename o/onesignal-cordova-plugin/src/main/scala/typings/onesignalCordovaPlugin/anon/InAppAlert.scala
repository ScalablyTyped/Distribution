package typings.onesignalCordovaPlugin.anon

import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`0`
import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
import typings.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppAlert extends js.Object {
  var InAppAlert: `1` = js.native
  var None: `0` = js.native
  var Notification: `2` = js.native
}

object InAppAlert {
  @scala.inline
  def apply(InAppAlert: `1`, None: `0`, Notification: `2`): InAppAlert = {
    val __obj = js.Dynamic.literal(InAppAlert = InAppAlert.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppAlert]
  }
  @scala.inline
  implicit class InAppAlertOps[Self <: InAppAlert] (val x: Self) extends AnyVal {
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
    def setInAppAlert(value: `1`): Self = this.set("InAppAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: `0`): Self = this.set("None", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotification(value: `2`): Self = this.set("Notification", value.asInstanceOf[js.Any])
  }
  
}

