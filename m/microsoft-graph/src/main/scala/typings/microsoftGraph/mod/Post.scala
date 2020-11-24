package typings.microsoftGraph.mod

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
  implicit class PostOps[Self <: Post] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: NullableOption[js.Array[Attachment]]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsNull: Self = this.set("attachments", null)
    
    @scala.inline
    def setBody(value: NullableOption[ItemBody]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setConversationId(value: NullableOption[String]): Self = this.set("conversationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversationId: Self = this.set("conversationId", js.undefined)
    
    @scala.inline
    def setConversationIdNull: Self = this.set("conversationId", null)
    
    @scala.inline
    def setConversationThreadId(value: NullableOption[String]): Self = this.set("conversationThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversationThreadId: Self = this.set("conversationThreadId", js.undefined)
    
    @scala.inline
    def setConversationThreadIdNull: Self = this.set("conversationThreadId", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setFrom(value: Recipient): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setHasAttachments(value: Boolean): Self = this.set("hasAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAttachments: Self = this.set("hasAttachments", js.undefined)
    
    @scala.inline
    def setInReplyTo(value: NullableOption[Post]): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    
    @scala.inline
    def setInReplyToNull: Self = this.set("inReplyTo", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = this.set("multiValueExtendedProperties", null)
    
    @scala.inline
    def setNewParticipantsVarargs(value: Recipient*): Self = this.set("newParticipants", js.Array(value :_*))
    
    @scala.inline
    def setNewParticipants(value: js.Array[Recipient]): Self = this.set("newParticipants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewParticipants: Self = this.set("newParticipants", js.undefined)
    
    @scala.inline
    def setReceivedDateTime(value: String): Self = this.set("receivedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivedDateTime: Self = this.set("receivedDateTime", js.undefined)
    
    @scala.inline
    def setSender(value: NullableOption[Recipient]): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    
    @scala.inline
    def setSenderNull: Self = this.set("sender", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = this.set("singleValueExtendedProperties", null)
  }
}
