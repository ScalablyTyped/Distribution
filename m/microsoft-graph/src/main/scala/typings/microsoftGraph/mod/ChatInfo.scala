package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatInfo extends StObject {
  
  // The unique identifier of a message in a Microsoft Teams channel.
  var messageId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the reply message.
  var replyChainMessageId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for a thread in Microsoft Teams.
  var threadId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ChatInfo {
  
  inline def apply(): ChatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatInfo] (val x: Self) extends AnyVal {
    
    inline def setMessageId(value: NullableOption[String]): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdNull: Self = StObject.set(x, "messageId", null)
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setReplyChainMessageId(value: NullableOption[String]): Self = StObject.set(x, "replyChainMessageId", value.asInstanceOf[js.Any])
    
    inline def setReplyChainMessageIdNull: Self = StObject.set(x, "replyChainMessageId", null)
    
    inline def setReplyChainMessageIdUndefined: Self = StObject.set(x, "replyChainMessageId", js.undefined)
    
    inline def setThreadId(value: NullableOption[String]): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdNull: Self = StObject.set(x, "threadId", null)
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
  }
}
