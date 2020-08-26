package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatInfo extends js.Object {
  // The unique identifier of a message in a Microsoft Teams channel.
  var messageId: js.UndefOr[String] = js.native
  // The ID of the reply message.
  var replyChainMessageId: js.UndefOr[String] = js.native
  // The unique identifier for a thread in Microsoft Teams.
  var threadId: js.UndefOr[String] = js.native
}

object ChatInfo {
  @scala.inline
  def apply(): ChatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatInfo]
  }
  @scala.inline
  implicit class ChatInfoOps[Self <: ChatInfo] (val x: Self) extends AnyVal {
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
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setReplyChainMessageId(value: String): Self = this.set("replyChainMessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyChainMessageId: Self = this.set("replyChainMessageId", js.undefined)
    @scala.inline
    def setThreadId(value: String): Self = this.set("threadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadId: Self = this.set("threadId", js.undefined)
  }
  
}

