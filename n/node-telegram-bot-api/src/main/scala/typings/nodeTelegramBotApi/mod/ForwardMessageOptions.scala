package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardMessageOptions extends js.Object {
  var disable_notification: js.UndefOr[Boolean] = js.native
}

object ForwardMessageOptions {
  @scala.inline
  def apply(): ForwardMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardMessageOptions]
  }
  @scala.inline
  implicit class ForwardMessageOptionsOps[Self <: ForwardMessageOptions] (val x: Self) extends AnyVal {
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
    def setDisable_notification(value: Boolean): Self = this.set("disable_notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_notification: Self = this.set("disable_notification", js.undefined)
  }
  
}

