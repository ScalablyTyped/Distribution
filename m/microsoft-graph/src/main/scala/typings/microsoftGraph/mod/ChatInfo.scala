package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatInfo extends StObject {
  
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
  implicit class ChatInfoMutableBuilder[Self <: ChatInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: NullableOption[String]): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdNull: Self = StObject.set(x, "messageId", null)
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setReplyChainMessageId(value: NullableOption[String]): Self = StObject.set(x, "replyChainMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyChainMessageIdNull: Self = StObject.set(x, "replyChainMessageId", null)
    
    @scala.inline
    def setReplyChainMessageIdUndefined: Self = StObject.set(x, "replyChainMessageId", js.undefined)
    
    @scala.inline
    def setThreadId(value: NullableOption[String]): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadIdNull: Self = StObject.set(x, "threadId", null)
    
    @scala.inline
    def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
  }
}
