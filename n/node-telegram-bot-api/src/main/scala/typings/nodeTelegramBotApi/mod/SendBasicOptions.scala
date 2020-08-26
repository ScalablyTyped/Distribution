package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBasicOptions extends js.Object {
  var disable_notification: js.UndefOr[Boolean] = js.native
  var reply_markup: js.UndefOr[InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply] = js.native
  var reply_to_message_id: js.UndefOr[Double] = js.native
}

object SendBasicOptions {
  @scala.inline
  def apply(): SendBasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBasicOptions]
  }
  @scala.inline
  implicit class SendBasicOptionsOps[Self <: SendBasicOptions] (val x: Self) extends AnyVal {
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
    def setReply_markup(value: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply): Self = this.set("reply_markup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply_markup: Self = this.set("reply_markup", js.undefined)
    @scala.inline
    def setReply_to_message_id(value: Double): Self = this.set("reply_to_message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply_to_message_id: Self = this.set("reply_to_message_id", js.undefined)
  }
  
}

