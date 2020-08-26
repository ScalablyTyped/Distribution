package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGameHighScoresOptions extends js.Object {
  var chat_id: js.UndefOr[Double] = js.native
  var inline_message_id: js.UndefOr[String] = js.native
  var message_id: js.UndefOr[Double] = js.native
}

object GetGameHighScoresOptions {
  @scala.inline
  def apply(): GetGameHighScoresOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGameHighScoresOptions]
  }
  @scala.inline
  implicit class GetGameHighScoresOptionsOps[Self <: GetGameHighScoresOptions] (val x: Self) extends AnyVal {
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
    def setChat_id(value: Double): Self = this.set("chat_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChat_id: Self = this.set("chat_id", js.undefined)
    @scala.inline
    def setInline_message_id(value: String): Self = this.set("inline_message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline_message_id: Self = this.set("inline_message_id", js.undefined)
    @scala.inline
    def setMessage_id(value: Double): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage_id: Self = this.set("message_id", js.undefined)
  }
  
}

