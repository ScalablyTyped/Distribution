package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends OutlookItem {
  // The fileAttachment and itemAttachment attachments for the message.
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  // The Bcc: recipients for the message.
  var bccRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  // The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
  var body: js.UndefOr[ItemBody] = js.native
  // The first 255 characters of the message body. It is in text format.
  var bodyPreview: js.UndefOr[String] = js.native
  // The Cc: recipients for the message.
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  // The ID of the conversation the email belongs to.
  var conversationId: js.UndefOr[String] = js.native
  // Indicates the position of the message within the conversation.
  var conversationIndex: js.UndefOr[Double] = js.native
  // The collection of open extensions defined for the message. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // The flag value that indicates the status, start date, due date, or completion date for the message.
  var flag: js.UndefOr[FollowupFlag] = js.native
  /**
    * The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property,
    * except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about
    * setting the from and sender properties of a message.
    */
  var from: js.UndefOr[Recipient] = js.native
  /**
    * Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message
    * contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body
    * property to look for a src attribute, such as &amp;lt;IMG src='cid:image001.jpg@01D26CD8.6C05F070'&amp;gt;.
    */
  var hasAttachments: js.UndefOr[Boolean] = js.native
  // The importance of the message: Low, Normal, High.
  var importance: js.UndefOr[Importance] = js.native
  /**
    * The classification of the message for the user, based on inferred relevance or importance, or on an explicit override.
    * The possible values are: focused or other.
    */
  var inferenceClassification: js.UndefOr[InferenceClassificationType] = js.native
  /**
    * A collection of message headers defined by RFC5322. The set includes message headers indicating the network path taken
    * by a message from the sender to the recipient. It can also contain custom message headers that hold app data for the
    * message. Returned only on applying a $select query option. Read-only.
    */
  var internetMessageHeaders: js.UndefOr[js.Array[InternetMessageHeader]] = js.native
  // The message ID in the format specified by RFC2822.
  var internetMessageId: js.UndefOr[String] = js.native
  // Indicates whether a read receipt is requested for the message.
  var isDeliveryReceiptRequested: js.UndefOr[Boolean] = js.native
  // Indicates whether the message is a draft. A message is a draft if it hasn't been sent yet.
  var isDraft: js.UndefOr[Boolean] = js.native
  // Indicates whether the message has been read.
  var isRead: js.UndefOr[Boolean] = js.native
  // Indicates whether a read receipt is requested for the message.
  var isReadReceiptRequested: js.UndefOr[Boolean] = js.native
  // The collection of multi-value extended properties defined for the message. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The unique identifier for the message's parent mailFolder.
  var parentFolderId: js.UndefOr[String] = js.native
  // The date and time the message was received.
  var receivedDateTime: js.UndefOr[String] = js.native
  // The email addresses to use when replying.
  var replyTo: js.UndefOr[js.Array[Recipient]] = js.native
  /**
    * The account that is actually used to generate the message. In most cases, this value is the same as the from property.
    * You can set this property to a different value when sending a message from a shared mailbox, for a shared calendar, or
    * as a delegate. In any case, the value must correspond to the actual mailbox used. Find out more about setting the from
    * and sender properties of a message.
    */
  var sender: js.UndefOr[Recipient] = js.native
  // The date and time the message was sent.
  var sentDateTime: js.UndefOr[String] = js.native
  // The collection of single-value extended properties defined for the message. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
  // The subject of the message.
  var subject: js.UndefOr[String] = js.native
  // The To: recipients for the message.
  var toRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  /**
    * The part of the body of the message that is unique to the current message. uniqueBody is not returned by default but
    * can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
    */
  var uniqueBody: js.UndefOr[ItemBody] = js.native
  /**
    * The URL to open the message in Outlook Web App.You can append an ispopout argument to the end of the URL to change how
    * the message is displayed. If ispopout is not present or if it is set to 1, then the message is shown in a popout
    * window. If ispopout is set to 0, then the browser will show the message in the Outlook Web App review pane.The message
    * will open in the browser if you are logged in to your mailbox via Outlook Web App. You will be prompted to login if you
    * are not already logged in with the browser.This URL can be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[String] = js.native
}

object Message {
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBccRecipientsVarargs(value: Recipient*): Self = this.set("bccRecipients", js.Array(value :_*))
    @scala.inline
    def setBccRecipients(value: js.Array[Recipient]): Self = this.set("bccRecipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBccRecipients: Self = this.set("bccRecipients", js.undefined)
    @scala.inline
    def setBody(value: ItemBody): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyPreview(value: String): Self = this.set("bodyPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyPreview: Self = this.set("bodyPreview", js.undefined)
    @scala.inline
    def setCcRecipientsVarargs(value: Recipient*): Self = this.set("ccRecipients", js.Array(value :_*))
    @scala.inline
    def setCcRecipients(value: js.Array[Recipient]): Self = this.set("ccRecipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcRecipients: Self = this.set("ccRecipients", js.undefined)
    @scala.inline
    def setConversationId(value: String): Self = this.set("conversationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversationId: Self = this.set("conversationId", js.undefined)
    @scala.inline
    def setConversationIndex(value: Double): Self = this.set("conversationIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversationIndex: Self = this.set("conversationIndex", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFlag(value: FollowupFlag): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setFrom(value: Recipient): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHasAttachments(value: Boolean): Self = this.set("hasAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAttachments: Self = this.set("hasAttachments", js.undefined)
    @scala.inline
    def setImportance(value: Importance): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    @scala.inline
    def setInferenceClassification(value: InferenceClassificationType): Self = this.set("inferenceClassification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInferenceClassification: Self = this.set("inferenceClassification", js.undefined)
    @scala.inline
    def setInternetMessageHeadersVarargs(value: InternetMessageHeader*): Self = this.set("internetMessageHeaders", js.Array(value :_*))
    @scala.inline
    def setInternetMessageHeaders(value: js.Array[InternetMessageHeader]): Self = this.set("internetMessageHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternetMessageHeaders: Self = this.set("internetMessageHeaders", js.undefined)
    @scala.inline
    def setInternetMessageId(value: String): Self = this.set("internetMessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternetMessageId: Self = this.set("internetMessageId", js.undefined)
    @scala.inline
    def setIsDeliveryReceiptRequested(value: Boolean): Self = this.set("isDeliveryReceiptRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDeliveryReceiptRequested: Self = this.set("isDeliveryReceiptRequested", js.undefined)
    @scala.inline
    def setIsDraft(value: Boolean): Self = this.set("isDraft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDraft: Self = this.set("isDraft", js.undefined)
    @scala.inline
    def setIsRead(value: Boolean): Self = this.set("isRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRead: Self = this.set("isRead", js.undefined)
    @scala.inline
    def setIsReadReceiptRequested(value: Boolean): Self = this.set("isReadReceiptRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReadReceiptRequested: Self = this.set("isReadReceiptRequested", js.undefined)
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    @scala.inline
    def setReceivedDateTime(value: String): Self = this.set("receivedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceivedDateTime: Self = this.set("receivedDateTime", js.undefined)
    @scala.inline
    def setReplyToVarargs(value: Recipient*): Self = this.set("replyTo", js.Array(value :_*))
    @scala.inline
    def setReplyTo(value: js.Array[Recipient]): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    @scala.inline
    def setSender(value: Recipient): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    @scala.inline
    def setSentDateTime(value: String): Self = this.set("sentDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentDateTime: Self = this.set("sentDateTime", js.undefined)
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setToRecipientsVarargs(value: Recipient*): Self = this.set("toRecipients", js.Array(value :_*))
    @scala.inline
    def setToRecipients(value: js.Array[Recipient]): Self = this.set("toRecipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToRecipients: Self = this.set("toRecipients", js.undefined)
    @scala.inline
    def setUniqueBody(value: ItemBody): Self = this.set("uniqueBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueBody: Self = this.set("uniqueBody", js.undefined)
    @scala.inline
    def setWebLink(value: String): Self = this.set("webLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebLink: Self = this.set("webLink", js.undefined)
  }
  
}

