package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Post extends OutlookItem {
  
  // Read-only. Nullable.
  var attachments: js.UndefOr[NullableOption[js.Array[Attachment]]] = js.native
  
  // The contents of the post. This is a default property. This property can be null.
  var body: js.UndefOr[NullableOption[ItemBody]] = js.native
  
  // Unique ID of the conversation. Read-only.
  var conversationId: js.UndefOr[NullableOption[String]] = js.native
  
  // Unique ID of the conversation thread. Read-only.
  var conversationThreadId: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of open extensions defined for the post. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  /**
    * Used in delegate access scenarios. Indicates who posted the message on behalf of another user. This is a default
    * property.
    */
  var from: js.UndefOr[Recipient] = js.native
  
  // Indicates whether the post has at least one attachment. This is a default property.
  var hasAttachments: js.UndefOr[Boolean] = js.native
  
  // Read-only.
  var inReplyTo: js.UndefOr[NullableOption[Post]] = js.native
  
  // The collection of multi-value extended properties defined for the post. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.native
  
  // Conversation participants that were added to the thread as part of this post.
  var newParticipants: js.UndefOr[js.Array[Recipient]] = js.native
  
  /**
    * Specifies when the post was received. The DateTimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var receivedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Contains the address of the sender. The value of Sender is assumed to be the address of the authenticated user in the
    * case when Sender is not specified. This is a default property.
    */
  var sender: js.UndefOr[NullableOption[Recipient]] = js.native
  
  // The collection of single-value extended properties defined for the post. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.native
}
object Post {
  
  @scala.inline
  def apply(): Post = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Post]
  }
  
  @scala.inline
  implicit class PostMutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: NullableOption[js.Array[Attachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = StObject.set(x, "body", null)
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setConversationId(value: NullableOption[String]): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationIdNull: Self = StObject.set(x, "conversationId", null)
    
    @scala.inline
    def setConversationIdUndefined: Self = StObject.set(x, "conversationId", js.undefined)
    
    @scala.inline
    def setConversationThreadId(value: NullableOption[String]): Self = StObject.set(x, "conversationThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationThreadIdNull: Self = StObject.set(x, "conversationThreadId", null)
    
    @scala.inline
    def setConversationThreadIdUndefined: Self = StObject.set(x, "conversationThreadId", js.undefined)
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: Recipient): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setHasAttachments(value: Boolean): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    @scala.inline
    def setInReplyTo(value: NullableOption[Post]): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyToNull: Self = StObject.set(x, "inReplyTo", null)
    
    @scala.inline
    def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setNewParticipants(value: js.Array[Recipient]): Self = StObject.set(x, "newParticipants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewParticipantsUndefined: Self = StObject.set(x, "newParticipants", js.undefined)
    
    @scala.inline
    def setNewParticipantsVarargs(value: Recipient*): Self = StObject.set(x, "newParticipants", js.Array(value :_*))
    
    @scala.inline
    def setReceivedDateTime(value: String): Self = StObject.set(x, "receivedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDateTimeUndefined: Self = StObject.set(x, "receivedDateTime", js.undefined)
    
    @scala.inline
    def setSender(value: NullableOption[Recipient]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderNull: Self = StObject.set(x, "sender", null)
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value :_*))
  }
}
