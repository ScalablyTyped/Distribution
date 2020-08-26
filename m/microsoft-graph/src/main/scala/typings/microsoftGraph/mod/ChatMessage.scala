package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatMessage extends Entity {
  // Attached files. Attachments are currently read-only – sending attachments is not supported.
  var attachments: js.UndefOr[js.Array[ChatMessageAttachment]] = js.native
  /**
    * Plaintext/HTML representation of the content of the chat message. Representation is specified by the contentType inside
    * the body. The content is always in HTML if the chat message contains a chatMessageMention.
    */
  var body: js.UndefOr[ItemBody] = js.native
  // Read only. Timestamp of when the chat message was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Read only. Timestamp at which the chat message was deleted, or null if not deleted.
  var deletedDateTime: js.UndefOr[String] = js.native
  // Read-only. Version number of the chat message.
  var etag: js.UndefOr[String] = js.native
  // Read only. Details of the sender of the chat message.
  var from: js.UndefOr[IdentitySet] = js.native
  var hostedContents: js.UndefOr[js.Array[ChatMessageHostedContent]] = js.native
  // The importance of the chat message. The possible values are: normal, high, urgent.
  var importance: js.UndefOr[ChatMessageImportance] = js.native
  /**
    * Read only. Timestamp of when the chat message is created or edited, including when a reply is made (if it's a root chat
    * message in a channel) or a reaction is added or removed.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Locale of the chat message set by the client.
  var locale: js.UndefOr[String] = js.native
  // List of entities mentioned in the chat message. Currently supports user, bot, team, channel.
  var mentions: js.UndefOr[js.Array[ChatMessageMention]] = js.native
  // The type of chat message. The possible values are: message.
  var messageType: js.UndefOr[ChatMessageType] = js.native
  var policyViolation: js.UndefOr[ChatMessagePolicyViolation] = js.native
  var reactions: js.UndefOr[js.Array[ChatMessageReaction]] = js.native
  var replies: js.UndefOr[js.Array[ChatMessage]] = js.native
  /**
    * Read-only. Id of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels
    * not chats)
    */
  var replyToId: js.UndefOr[String] = js.native
  // The subject of the chat message, in plaintext.
  var subject: js.UndefOr[String] = js.native
  /**
    * Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only
    * applies to channel chat messages, not chat messages in a chat.
    */
  var summary: js.UndefOr[String] = js.native
  var webUrl: js.UndefOr[String] = js.native
}

object ChatMessage {
  @scala.inline
  def apply(): ChatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessage]
  }
  @scala.inline
  implicit class ChatMessageOps[Self <: ChatMessage] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: ChatMessageAttachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[ChatMessageAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBody(value: ItemBody): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setDeletedDateTime(value: String): Self = this.set("deletedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedDateTime: Self = this.set("deletedDateTime", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFrom(value: IdentitySet): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHostedContentsVarargs(value: ChatMessageHostedContent*): Self = this.set("hostedContents", js.Array(value :_*))
    @scala.inline
    def setHostedContents(value: js.Array[ChatMessageHostedContent]): Self = this.set("hostedContents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedContents: Self = this.set("hostedContents", js.undefined)
    @scala.inline
    def setImportance(value: ChatMessageImportance): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMentionsVarargs(value: ChatMessageMention*): Self = this.set("mentions", js.Array(value :_*))
    @scala.inline
    def setMentions(value: js.Array[ChatMessageMention]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    @scala.inline
    def setMessageType(value: ChatMessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    @scala.inline
    def setPolicyViolation(value: ChatMessagePolicyViolation): Self = this.set("policyViolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyViolation: Self = this.set("policyViolation", js.undefined)
    @scala.inline
    def setReactionsVarargs(value: ChatMessageReaction*): Self = this.set("reactions", js.Array(value :_*))
    @scala.inline
    def setReactions(value: js.Array[ChatMessageReaction]): Self = this.set("reactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactions: Self = this.set("reactions", js.undefined)
    @scala.inline
    def setRepliesVarargs(value: ChatMessage*): Self = this.set("replies", js.Array(value :_*))
    @scala.inline
    def setReplies(value: js.Array[ChatMessage]): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    @scala.inline
    def setReplyToId(value: String): Self = this.set("replyToId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToId: Self = this.set("replyToId", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

