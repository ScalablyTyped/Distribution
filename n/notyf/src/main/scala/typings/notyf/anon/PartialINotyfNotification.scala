package typings.notyf.anon

import typings.notyf.notyfBooleans.`false`
import typings.notyf.notyfOptionsMod.INotyfIcon
import typings.notyf.notyfOptionsMod.INotyfPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<notyf.notyf/notyf.options.INotyfNotificationOptions> */
@js.native
trait PartialINotyfNotification extends js.Object {
  var background: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var dismissible: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var icon: js.UndefOr[INotyfIcon | `false`] = js.native
  var message: js.UndefOr[String] = js.native
  var position: js.UndefOr[INotyfPosition] = js.native
  var ripple: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object PartialINotyfNotification {
  @scala.inline
  def apply(): PartialINotyfNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINotyfNotification]
  }
  @scala.inline
  implicit class PartialINotyfNotificationOps[Self <: PartialINotyfNotification] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setIcon(value: INotyfIcon | `false`): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPosition(value: INotyfPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

