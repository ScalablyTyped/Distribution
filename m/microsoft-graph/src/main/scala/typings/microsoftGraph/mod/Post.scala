package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Post
  extends StObject
     with OutlookItem {
  
  // Read-only. Nullable.
  var attachments: js.UndefOr[NullableOption[js.Array[Attachment]]] = js.undefined
  
  // The contents of the post. This is a default property. This property can be null.
  var body: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  // Unique ID of the conversation. Read-only.
  var conversationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique ID of the conversation thread. Read-only.
  var conversationThreadId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of open extensions defined for the post. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  /**
    * Used in delegate access scenarios. Indicates who posted the message on behalf of another user. This is a default
    * property.
    */
  var from: js.UndefOr[Recipient] = js.undefined
  
  // Indicates whether the post has at least one attachment. This is a default property.
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  
  // Read-only.
  var inReplyTo: js.UndefOr[NullableOption[Post]] = js.undefined
  
  // The collection of multi-value extended properties defined for the post. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  // Conversation participants that were added to the thread as part of this post.
  var newParticipants: js.UndefOr[js.Array[Recipient]] = js.undefined
  
  /**
    * Specifies when the post was received. The DateTimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var receivedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the address of the sender. The value of Sender is assumed to be the address of the authenticated user in the
    * case when Sender is not specified. This is a default property.
    */
  var sender: js.UndefOr[NullableOption[Recipient]] = js.undefined
  
  // The collection of single-value extended properties defined for the post. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
}
object Post {
  
  inline def apply(): Post = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Post]
  }
  
  extension [Self <: Post](x: Self) {
    
    inline def setAttachments(value: NullableOption[js.Array[Attachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    inline def setBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setConversationId(value: NullableOption[String]): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    inline def setConversationIdNull: Self = StObject.set(x, "conversationId", null)
    
    inline def setConversationIdUndefined: Self = StObject.set(x, "conversationId", js.undefined)
    
    inline def setConversationThreadId(value: NullableOption[String]): Self = StObject.set(x, "conversationThreadId", value.asInstanceOf[js.Any])
    
    inline def setConversationThreadIdNull: Self = StObject.set(x, "conversationThreadId", null)
    
    inline def setConversationThreadIdUndefined: Self = StObject.set(x, "conversationThreadId", js.undefined)
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setFrom(value: Recipient): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHasAttachments(value: Boolean): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    inline def setInReplyTo(value: NullableOption[Post]): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    inline def setInReplyToNull: Self = StObject.set(x, "inReplyTo", null)
    
    inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    inline def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    inline def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    inline def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value :_*))
    
    inline def setNewParticipants(value: js.Array[Recipient]): Self = StObject.set(x, "newParticipants", value.asInstanceOf[js.Any])
    
    inline def setNewParticipantsUndefined: Self = StObject.set(x, "newParticipants", js.undefined)
    
    inline def setNewParticipantsVarargs(value: Recipient*): Self = StObject.set(x, "newParticipants", js.Array(value :_*))
    
    inline def setReceivedDateTime(value: String): Self = StObject.set(x, "receivedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReceivedDateTimeUndefined: Self = StObject.set(x, "receivedDateTime", js.undefined)
    
    inline def setSender(value: NullableOption[Recipient]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderNull: Self = StObject.set(x, "sender", null)
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    inline def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    inline def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value :_*))
  }
}
