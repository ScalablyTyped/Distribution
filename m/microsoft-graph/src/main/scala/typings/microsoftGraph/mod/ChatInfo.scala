package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatInfo extends js.Object {
  
  // The unique identifier of a message in a Microsoft Teams channel.
  var messageId: js.UndefOr[NullableOption[String]] = js.native
  
  // The ID of the reply message.
  var replyChainMessageId: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier for a thread in Microsoft Teams.
  var threadId: js.UndefOr[NullableOption[String]] = js.native
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
    def setMessageId(value: NullableOption[String]): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setMessageIdNull: Self = this.set("messageId", null)
    
    @scala.inline
    def setReplyChainMessageId(value: NullableOption[String]): Self = this.set("replyChainMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyChainMessageId: Self = this.set("replyChainMessageId", js.undefined)
    
    @scala.inline
    def setReplyChainMessageIdNull: Self = this.set("replyChainMessageId", null)
    
    @scala.inline
    def setThreadId(value: NullableOption[String]): Self = this.set("threadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadId: Self = this.set("threadId", js.undefined)
    
    @scala.inline
    def setThreadIdNull: Self = this.set("threadId", null)
  }
}
