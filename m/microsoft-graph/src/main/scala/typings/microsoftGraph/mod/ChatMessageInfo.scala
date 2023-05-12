package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessageInfo
  extends StObject
     with Entity {
  
  /**
    * Body of the chatMessage. This will still contain markers for @mentions and attachments even though the object does not
    * return @mentions and attachments.
    */
  var body: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  // Date time object representing the time at which message was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Read-only. If present, represents details of an event that happened in a chat, a channel, or a team, for example,
    * members were added, and so on. For event messages, the messageType property will be set to systemEventMessage.
    */
  var eventDetail: js.UndefOr[NullableOption[EventMessageDetail]] = js.undefined
  
  // Information about the sender of the message.
  var from: js.UndefOr[NullableOption[ChatMessageFromIdentitySet]] = js.undefined
  
  // If set to true, the original message has been deleted.
  var isDeleted: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The type of chat message. The possible values are: message, unknownFutureValue, systemEventMessage.
  var messageType: js.UndefOr[ChatMessageType] = js.undefined
}
object ChatMessageInfo {
  
  inline def apply(): ChatMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessageInfo] (val x: Self) extends AnyVal {
    
    inline def setBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setEventDetail(value: NullableOption[EventMessageDetail]): Self = StObject.set(x, "eventDetail", value.asInstanceOf[js.Any])
    
    inline def setEventDetailNull: Self = StObject.set(x, "eventDetail", null)
    
    inline def setEventDetailUndefined: Self = StObject.set(x, "eventDetail", js.undefined)
    
    inline def setFrom(value: NullableOption[ChatMessageFromIdentitySet]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setIsDeleted(value: NullableOption[Boolean]): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setIsDeletedNull: Self = StObject.set(x, "isDeleted", null)
    
    inline def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
    
    inline def setMessageType(value: ChatMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
  }
}
