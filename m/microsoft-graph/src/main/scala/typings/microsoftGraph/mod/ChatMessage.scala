package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessage
  extends StObject
     with Entity {
  
  // References to attached objects like files, tabs, meetings etc.
  var attachments: js.UndefOr[NullableOption[js.Array[ChatMessageAttachment]]] = js.undefined
  
  /**
    * Plaintext/HTML representation of the content of the chat message. Representation is specified by the contentType inside
    * the body. The content is always in HTML if the chat message contains a chatMessageMention.
    */
  var body: js.UndefOr[ItemBody] = js.undefined
  
  // If the message was sent in a channel, represents identity of the channel.
  var channelIdentity: js.UndefOr[NullableOption[ChannelIdentity]] = js.undefined
  
  // If the message was sent in a chat, represents the identity of the chat.
  var chatId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Timestamp of when the chat message was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read only. Timestamp at which the chat message was deleted, or null if not deleted.
  var deletedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Version number of the chat message.
  var etag: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Read-only. If present, represents details of an event that happened in a chat, a channel, or a team, for example,
    * adding new members. For event messages, the messageType property will be set to systemEventMessage.
    */
  var eventDetail: js.UndefOr[NullableOption[EventMessageDetail]] = js.undefined
  
  // Details of the sender of the chat message. Can only be set during migration.
  var from: js.UndefOr[NullableOption[ChatMessageFromIdentitySet]] = js.undefined
  
  // Content in a message hosted by Microsoft Teams - for example, images or code snippets.
  var hostedContents: js.UndefOr[NullableOption[js.Array[ChatMessageHostedContent]]] = js.undefined
  
  // The importance of the chat message. The possible values are: normal, high, urgent.
  var importance: js.UndefOr[ChatMessageImportance] = js.undefined
  
  /**
    * Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Teams UI. If no edits
    * are made the value is null.
    */
  var lastEditedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Read only. Timestamp when the chat message is created (initial setting) or modified, including when a reaction is added
    * or removed.
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Locale of the chat message set by the client. Always set to en-us.
  var locale: js.UndefOr[String] = js.undefined
  
  // List of entities mentioned in the chat message. Supported entities are: user, bot, team, and channel.
  var mentions: js.UndefOr[NullableOption[js.Array[ChatMessageMention]]] = js.undefined
  
  /**
    * List of activity history of a message item, including modification time and actions, such as reactionAdded,
    * reactionRemoved, or reaction changes, on the message.
    */
  var messageHistory: js.UndefOr[NullableOption[js.Array[ChatMessageHistoryItem]]] = js.undefined
  
  /**
    * The type of chat message. The possible values are: message, chatEvent, typing, unknownFutureValue, systemEventMessage.
    * Note that you must use the Prefer: include-unknown-enum-members request header to get the following value in this
    * evolvable enum: systemEventMessage.
    */
  var messageType: js.UndefOr[ChatMessageType] = js.undefined
  
  // Defines the properties of a policy violation set by a data loss prevention (DLP) application.
  var policyViolation: js.UndefOr[NullableOption[ChatMessagePolicyViolation]] = js.undefined
  
  // Reactions for this chat message (for example, Like).
  var reactions: js.UndefOr[NullableOption[js.Array[ChatMessageReaction]]] = js.undefined
  
  // Replies for a specified message. Supports $expand for channel messages.
  var replies: js.UndefOr[NullableOption[js.Array[ChatMessage]]] = js.undefined
  
  /**
    * Read-only. ID of the parent chat message or root chat message of the thread. (Only applies to chat messages in
    * channels, not chats.)
    */
  var replyToId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The subject of the chat message, in plaintext.
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only
    * applies to channel chat messages, not chat messages in a chat.
    */
  var summary: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Link to the message in Microsoft Teams.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object ChatMessage {
  
  inline def apply(): ChatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessage] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: NullableOption[js.Array[ChatMessageAttachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: ChatMessageAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setBody(value: ItemBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setChannelIdentity(value: NullableOption[ChannelIdentity]): Self = StObject.set(x, "channelIdentity", value.asInstanceOf[js.Any])
    
    inline def setChannelIdentityNull: Self = StObject.set(x, "channelIdentity", null)
    
    inline def setChannelIdentityUndefined: Self = StObject.set(x, "channelIdentity", js.undefined)
    
    inline def setChatId(value: NullableOption[String]): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setChatIdNull: Self = StObject.set(x, "chatId", null)
    
    inline def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDeletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "deletedDateTime", value.asInstanceOf[js.Any])
    
    inline def setDeletedDateTimeNull: Self = StObject.set(x, "deletedDateTime", null)
    
    inline def setDeletedDateTimeUndefined: Self = StObject.set(x, "deletedDateTime", js.undefined)
    
    inline def setEtag(value: NullableOption[String]): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEventDetail(value: NullableOption[EventMessageDetail]): Self = StObject.set(x, "eventDetail", value.asInstanceOf[js.Any])
    
    inline def setEventDetailNull: Self = StObject.set(x, "eventDetail", null)
    
    inline def setEventDetailUndefined: Self = StObject.set(x, "eventDetail", js.undefined)
    
    inline def setFrom(value: NullableOption[ChatMessageFromIdentitySet]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHostedContents(value: NullableOption[js.Array[ChatMessageHostedContent]]): Self = StObject.set(x, "hostedContents", value.asInstanceOf[js.Any])
    
    inline def setHostedContentsNull: Self = StObject.set(x, "hostedContents", null)
    
    inline def setHostedContentsUndefined: Self = StObject.set(x, "hostedContents", js.undefined)
    
    inline def setHostedContentsVarargs(value: ChatMessageHostedContent*): Self = StObject.set(x, "hostedContents", js.Array(value*))
    
    inline def setImportance(value: ChatMessageImportance): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    inline def setLastEditedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastEditedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastEditedDateTimeNull: Self = StObject.set(x, "lastEditedDateTime", null)
    
    inline def setLastEditedDateTimeUndefined: Self = StObject.set(x, "lastEditedDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMentions(value: NullableOption[js.Array[ChatMessageMention]]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsNull: Self = StObject.set(x, "mentions", null)
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: ChatMessageMention*): Self = StObject.set(x, "mentions", js.Array(value*))
    
    inline def setMessageHistory(value: NullableOption[js.Array[ChatMessageHistoryItem]]): Self = StObject.set(x, "messageHistory", value.asInstanceOf[js.Any])
    
    inline def setMessageHistoryNull: Self = StObject.set(x, "messageHistory", null)
    
    inline def setMessageHistoryUndefined: Self = StObject.set(x, "messageHistory", js.undefined)
    
    inline def setMessageHistoryVarargs(value: ChatMessageHistoryItem*): Self = StObject.set(x, "messageHistory", js.Array(value*))
    
    inline def setMessageType(value: ChatMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setPolicyViolation(value: NullableOption[ChatMessagePolicyViolation]): Self = StObject.set(x, "policyViolation", value.asInstanceOf[js.Any])
    
    inline def setPolicyViolationNull: Self = StObject.set(x, "policyViolation", null)
    
    inline def setPolicyViolationUndefined: Self = StObject.set(x, "policyViolation", js.undefined)
    
    inline def setReactions(value: NullableOption[js.Array[ChatMessageReaction]]): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsNull: Self = StObject.set(x, "reactions", null)
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setReactionsVarargs(value: ChatMessageReaction*): Self = StObject.set(x, "reactions", js.Array(value*))
    
    inline def setReplies(value: NullableOption[js.Array[ChatMessage]]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesNull: Self = StObject.set(x, "replies", null)
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: ChatMessage*): Self = StObject.set(x, "replies", js.Array(value*))
    
    inline def setReplyToId(value: NullableOption[String]): Self = StObject.set(x, "replyToId", value.asInstanceOf[js.Any])
    
    inline def setReplyToIdNull: Self = StObject.set(x, "replyToId", null)
    
    inline def setReplyToIdUndefined: Self = StObject.set(x, "replyToId", js.undefined)
    
    inline def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSummary(value: NullableOption[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
