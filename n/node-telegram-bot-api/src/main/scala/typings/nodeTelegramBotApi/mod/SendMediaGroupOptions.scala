package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMediaGroupOptions extends js.Object {
  var disable_notification: js.UndefOr[Boolean] = js.native
  var reply_to_message_id: js.UndefOr[Double] = js.native
}

object SendMediaGroupOptions {
  @scala.inline
  def apply(): SendMediaGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMediaGroupOptions]
  }
  @scala.inline
  implicit class SendMediaGroupOptionsOps[Self <: SendMediaGroupOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setReply_to_message_id(value: Double): Self = this.set("reply_to_message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply_to_message_id: Self = this.set("reply_to_message_id", js.undefined)
  }
  
}

