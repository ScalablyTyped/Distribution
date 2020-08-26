package typings.nodePushnotifications.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var error: js.UndefOr[Error | Null] = js.native
  var errorMsg: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[String] = js.native
  var originalRegId: js.UndefOr[String] = js.native
  var regId: String = js.native
}

object Message {
  @scala.inline
  def apply(regId: String): Message = {
    val __obj = js.Dynamic.literal(regId = regId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setRegId(value: String): Self = this.set("regId", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    @scala.inline
    def setErrorMsg(value: String): Self = this.set("errorMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMsg: Self = this.set("errorMsg", js.undefined)
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setOriginalRegId(value: String): Self = this.set("originalRegId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalRegId: Self = this.set("originalRegId", js.undefined)
  }
  
}

