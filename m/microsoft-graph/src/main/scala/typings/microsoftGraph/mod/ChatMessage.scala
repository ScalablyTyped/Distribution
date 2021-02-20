package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessage extends Entity {
  
  // Attached files. Attachments are currently read-only – sending attachments is not supported.
  var attachments: js.UndefOr[NullableOption[js.Array[ChatMessageAttachment]]] = js.native
  
  /**
    * Plaintext/HTML representation of the content of the chat message. Representation is specified by the contentType inside
    * the body. The content is always in HTML if the chat message contains a chatMessageMention.
    */
  var body: js.UndefOr[ItemBody] = js.native
  
  // Read only. Timestamp of when the chat message was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Read only. Timestamp at which the chat message was deleted, or null if not deleted.
  var deletedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Version number of the chat message.
  var etag: js.UndefOr[NullableOption[String]] = js.native
  
  // Read only. Details of the sender of the chat message.
  var from: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  var hostedContents: js.UndefOr[NullableOption[js.Array[ChatMessageHostedContent]]] = js.native
  
  // The importance of the chat message. The possible values are: normal, high, urgent.
  var importance: js.UndefOr[ChatMessageImportance] = js.native
  
  /**
    * Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Microsoft Teams UI. If
    * no edits are made the value is null.
    */
  var lastEditedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Read only. Timestamp when the chat message is created (initial setting) or edited, including when a reaction is added
    * or removed.
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Locale of the chat message set by the client.
  var locale: js.UndefOr[String] = js.native
  
  // List of entities mentioned in the chat message. Currently supports user, bot, team, channel.
  var mentions: js.UndefOr[NullableOption[js.Array[ChatMessageMention]]] = js.native
  
  // The type of chat message. The possible values are: message.
  var messageType: js.UndefOr[ChatMessageType] = js.native
  
  // Defines the properties of a policy violation set by a data loss prevention (DLP) application.
  var policyViolation: js.UndefOr[NullableOption[ChatMessagePolicyViolation]] = js.native
  
  var reactions: js.UndefOr[NullableOption[js.Array[ChatMessageReaction]]] = js.native
  
  var replies: js.UndefOr[NullableOption[js.Array[ChatMessage]]] = js.native
  
  /**
    * Read-only. Id of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels
    * not chats)
    */
  var replyToId: js.UndefOr[NullableOption[String]] = js.native
  
  // The subject of the chat message, in plaintext.
  var subject: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only
    * applies to channel chat messages, not chat messages in a chat.
    */
  var summary: js.UndefOr[NullableOption[String]] = js.native
  
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
}
object ChatMessage {
  
  @scala.inline
  def apply(): ChatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessage]
  }
  
  @scala.inline
  implicit class ChatMessageMutableBuilder[Self <: ChatMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: NullableOption[js.Array[ChatMessageAttachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: ChatMessageAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: ItemBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDeletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "deletedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDateTimeNull: Self = StObject.set(x, "deletedDateTime", null)
    
    @scala.inline
    def setDeletedDateTimeUndefined: Self = StObject.set(x, "deletedDateTime", js.undefined)
    
    @scala.inline
    def setEtag(value: NullableOption[String]): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagNull: Self = StObject.set(x, "etag", null)
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFrom(value: NullableOption[IdentitySet]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromNull: Self = StObject.set(x, "from", null)
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setHostedContents(value: NullableOption[js.Array[ChatMessageHostedContent]]): Self = StObject.set(x, "hostedContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedContentsNull: Self = StObject.set(x, "hostedContents", null)
    
    @scala.inline
    def setHostedContentsUndefined: Self = StObject.set(x, "hostedContents", js.undefined)
    
    @scala.inline
    def setHostedContentsVarargs(value: ChatMessageHostedContent*): Self = StObject.set(x, "hostedContents", js.Array(value :_*))
    
    @scala.inline
    def setImportance(value: ChatMessageImportance): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    @scala.inline
    def setLastEditedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastEditedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEditedDateTimeNull: Self = StObject.set(x, "lastEditedDateTime", null)
    
    @scala.inline
    def setLastEditedDateTimeUndefined: Self = StObject.set(x, "lastEditedDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMentions(value: NullableOption[js.Array[ChatMessageMention]]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsNull: Self = StObject.set(x, "mentions", null)
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: ChatMessageMention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    @scala.inline
    def setMessageType(value: ChatMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setPolicyViolation(value: NullableOption[ChatMessagePolicyViolation]): Self = StObject.set(x, "policyViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyViolationNull: Self = StObject.set(x, "policyViolation", null)
    
    @scala.inline
    def setPolicyViolationUndefined: Self = StObject.set(x, "policyViolation", js.undefined)
    
    @scala.inline
    def setReactions(value: NullableOption[js.Array[ChatMessageReaction]]): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionsNull: Self = StObject.set(x, "reactions", null)
    
    @scala.inline
    def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    @scala.inline
    def setReactionsVarargs(value: ChatMessageReaction*): Self = StObject.set(x, "reactions", js.Array(value :_*))
    
    @scala.inline
    def setReplies(value: NullableOption[js.Array[ChatMessage]]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesNull: Self = StObject.set(x, "replies", null)
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: ChatMessage*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setReplyToId(value: NullableOption[String]): Self = StObject.set(x, "replyToId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToIdNull: Self = StObject.set(x, "replyToId", null)
    
    @scala.inline
    def setReplyToIdUndefined: Self = StObject.set(x, "replyToId", js.undefined)
    
    @scala.inline
    def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setSummary(value: NullableOption[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
