package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends OutlookItem {
  
  // The fileAttachment and itemAttachment attachments for the message.
  var attachments: js.UndefOr[NullableOption[js.Array[Attachment]]] = js.native
  
  // The Bcc: recipients for the message.
  var bccRecipients: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.native
  
  // The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
  var body: js.UndefOr[NullableOption[ItemBody]] = js.native
  
  // The first 255 characters of the message body. It is in text format.
  var bodyPreview: js.UndefOr[NullableOption[String]] = js.native
  
  // The Cc: recipients for the message.
  var ccRecipients: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.native
  
  // The ID of the conversation the email belongs to.
  var conversationId: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates the position of the message within the conversation.
  var conversationIndex: js.UndefOr[NullableOption[Double]] = js.native
  
  // The collection of open extensions defined for the message. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  // The flag value that indicates the status, start date, due date, or completion date for the message.
  var flag: js.UndefOr[NullableOption[FollowupFlag]] = js.native
  
  /**
    * The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property,
    * except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about
    * setting the from and sender properties of a message.
    */
  var from: js.UndefOr[NullableOption[Recipient]] = js.native
  
  /**
    * Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message
    * contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body
    * property to look for a src attribute, such as &amp;lt;IMG src='cid:image001.jpg@01D26CD8.6C05F070'&amp;gt;.
    */
  var hasAttachments: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The importance of the message: Low, Normal, High.
  var importance: js.UndefOr[NullableOption[Importance]] = js.native
  
  /**
    * The classification of the message for the user, based on inferred relevance or importance, or on an explicit override.
    * The possible values are: focused or other.
    */
  var inferenceClassification: js.UndefOr[NullableOption[InferenceClassificationType]] = js.native
  
  /**
    * A collection of message headers defined by RFC5322. The set includes message headers indicating the network path taken
    * by a message from the sender to the recipient. It can also contain custom message headers that hold app data for the
    * message. Returned only on applying a $select query option. Read-only.
    */
  var internetMessageHeaders: js.UndefOr[NullableOption[js.Array[InternetMessageHeader]]] = js.native
  
  // The message ID in the format specified by RFC2822.
  var internetMessageId: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether a read receipt is requested for the message.
  var isDeliveryReceiptRequested: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether the message is a draft. A message is a draft if it hasn't been sent yet.
  var isDraft: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether the message has been read.
  var isRead: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether a read receipt is requested for the message.
  var isReadReceiptRequested: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The collection of multi-value extended properties defined for the message. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.native
  
  // The unique identifier for the message's parent mailFolder.
  var parentFolderId: js.UndefOr[NullableOption[String]] = js.native
  
  // The date and time the message was received.
  var receivedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The email addresses to use when replying.
  var replyTo: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.native
  
  /**
    * The account that is actually used to generate the message. In most cases, this value is the same as the from property.
    * You can set this property to a different value when sending a message from a shared mailbox, for a shared calendar, or
    * as a delegate. In any case, the value must correspond to the actual mailbox used. Find out more about setting the from
    * and sender properties of a message.
    */
  var sender: js.UndefOr[NullableOption[Recipient]] = js.native
  
  // The date and time the message was sent.
  var sentDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of single-value extended properties defined for the message. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.native
  
  // The subject of the message.
  var subject: js.UndefOr[NullableOption[String]] = js.native
  
  // The To: recipients for the message.
  var toRecipients: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.native
  
  /**
    * The part of the body of the message that is unique to the current message. uniqueBody is not returned by default but
    * can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
    */
  var uniqueBody: js.UndefOr[NullableOption[ItemBody]] = js.native
  
  /**
    * The URL to open the message in Outlook on the web.You can append an ispopout argument to the end of the URL to change
    * how the message is displayed. If ispopout is not present or if it is set to 1, then the message is shown in a popout
    * window. If ispopout is set to 0, then the browser will show the message in the Outlook on the web review pane.The
    * message will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to
    * login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[NullableOption[String]] = js.native
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
    def setAttachments(value: NullableOption[js.Array[Attachment]]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsNull: Self = this.set("attachments", null)
    
    @scala.inline
    def setBccRecipientsVarargs(value: Recipient*): Self = this.set("bccRecipients", js.Array(value :_*))
    
    @scala.inline
    def setBccRecipients(value: NullableOption[js.Array[Recipient]]): Self = this.set("bccRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBccRecipients: Self = this.set("bccRecipients", js.undefined)
    
    @scala.inline
    def setBccRecipientsNull: Self = this.set("bccRecipients", null)
    
    @scala.inline
    def setBody(value: NullableOption[ItemBody]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setBodyPreview(value: NullableOption[String]): Self = this.set("bodyPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyPreview: Self = this.set("bodyPreview", js.undefined)
    
    @scala.inline
    def setBodyPreviewNull: Self = this.set("bodyPreview", null)
    
    @scala.inline
    def setCcRecipientsVarargs(value: Recipient*): Self = this.set("ccRecipients", js.Array(value :_*))
    
    @scala.inline
    def setCcRecipients(value: NullableOption[js.Array[Recipient]]): Self = this.set("ccRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcRecipients: Self = this.set("ccRecipients", js.undefined)
    
    @scala.inline
    def setCcRecipientsNull: Self = this.set("ccRecipients", null)
    
    @scala.inline
    def setConversationId(value: NullableOption[String]): Self = this.set("conversationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversationId: Self = this.set("conversationId", js.undefined)
    
    @scala.inline
    def setConversationIdNull: Self = this.set("conversationId", null)
    
    @scala.inline
    def setConversationIndex(value: NullableOption[Double]): Self = this.set("conversationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversationIndex: Self = this.set("conversationIndex", js.undefined)
    
    @scala.inline
    def setConversationIndexNull: Self = this.set("conversationIndex", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setFlag(value: NullableOption[FollowupFlag]): Self = this.set("flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    
    @scala.inline
    def setFlagNull: Self = this.set("flag", null)
    
    @scala.inline
    def setFrom(value: NullableOption[Recipient]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setFromNull: Self = this.set("from", null)
    
    @scala.inline
    def setHasAttachments(value: NullableOption[Boolean]): Self = this.set("hasAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAttachments: Self = this.set("hasAttachments", js.undefined)
    
    @scala.inline
    def setHasAttachmentsNull: Self = this.set("hasAttachments", null)
    
    @scala.inline
    def setImportance(value: NullableOption[Importance]): Self = this.set("importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    
    @scala.inline
    def setImportanceNull: Self = this.set("importance", null)
    
    @scala.inline
    def setInferenceClassification(value: NullableOption[InferenceClassificationType]): Self = this.set("inferenceClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferenceClassification: Self = this.set("inferenceClassification", js.undefined)
    
    @scala.inline
    def setInferenceClassificationNull: Self = this.set("inferenceClassification", null)
    
    @scala.inline
    def setInternetMessageHeadersVarargs(value: InternetMessageHeader*): Self = this.set("internetMessageHeaders", js.Array(value :_*))
    
    @scala.inline
    def setInternetMessageHeaders(value: NullableOption[js.Array[InternetMessageHeader]]): Self = this.set("internetMessageHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternetMessageHeaders: Self = this.set("internetMessageHeaders", js.undefined)
    
    @scala.inline
    def setInternetMessageHeadersNull: Self = this.set("internetMessageHeaders", null)
    
    @scala.inline
    def setInternetMessageId(value: NullableOption[String]): Self = this.set("internetMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternetMessageId: Self = this.set("internetMessageId", js.undefined)
    
    @scala.inline
    def setInternetMessageIdNull: Self = this.set("internetMessageId", null)
    
    @scala.inline
    def setIsDeliveryReceiptRequested(value: NullableOption[Boolean]): Self = this.set("isDeliveryReceiptRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDeliveryReceiptRequested: Self = this.set("isDeliveryReceiptRequested", js.undefined)
    
    @scala.inline
    def setIsDeliveryReceiptRequestedNull: Self = this.set("isDeliveryReceiptRequested", null)
    
    @scala.inline
    def setIsDraft(value: NullableOption[Boolean]): Self = this.set("isDraft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDraft: Self = this.set("isDraft", js.undefined)
    
    @scala.inline
    def setIsDraftNull: Self = this.set("isDraft", null)
    
    @scala.inline
    def setIsRead(value: NullableOption[Boolean]): Self = this.set("isRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRead: Self = this.set("isRead", js.undefined)
    
    @scala.inline
    def setIsReadNull: Self = this.set("isRead", null)
    
    @scala.inline
    def setIsReadReceiptRequested(value: NullableOption[Boolean]): Self = this.set("isReadReceiptRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReadReceiptRequested: Self = this.set("isReadReceiptRequested", js.undefined)
    
    @scala.inline
    def setIsReadReceiptRequestedNull: Self = this.set("isReadReceiptRequested", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = this.set("multiValueExtendedProperties", null)
    
    @scala.inline
    def setParentFolderId(value: NullableOption[String]): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    
    @scala.inline
    def setParentFolderIdNull: Self = this.set("parentFolderId", null)
    
    @scala.inline
    def setReceivedDateTime(value: NullableOption[String]): Self = this.set("receivedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivedDateTime: Self = this.set("receivedDateTime", js.undefined)
    
    @scala.inline
    def setReceivedDateTimeNull: Self = this.set("receivedDateTime", null)
    
    @scala.inline
    def setReplyToVarargs(value: Recipient*): Self = this.set("replyTo", js.Array(value :_*))
    
    @scala.inline
    def setReplyTo(value: NullableOption[js.Array[Recipient]]): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    
    @scala.inline
    def setReplyToNull: Self = this.set("replyTo", null)
    
    @scala.inline
    def setSender(value: NullableOption[Recipient]): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    
    @scala.inline
    def setSenderNull: Self = this.set("sender", null)
    
    @scala.inline
    def setSentDateTime(value: NullableOption[String]): Self = this.set("sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentDateTime: Self = this.set("sentDateTime", js.undefined)
    
    @scala.inline
    def setSentDateTimeNull: Self = this.set("sentDateTime", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = this.set("singleValueExtendedProperties", null)
    
    @scala.inline
    def setSubject(value: NullableOption[String]): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setSubjectNull: Self = this.set("subject", null)
    
    @scala.inline
    def setToRecipientsVarargs(value: Recipient*): Self = this.set("toRecipients", js.Array(value :_*))
    
    @scala.inline
    def setToRecipients(value: NullableOption[js.Array[Recipient]]): Self = this.set("toRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToRecipients: Self = this.set("toRecipients", js.undefined)
    
    @scala.inline
    def setToRecipientsNull: Self = this.set("toRecipients", null)
    
    @scala.inline
    def setUniqueBody(value: NullableOption[ItemBody]): Self = this.set("uniqueBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueBody: Self = this.set("uniqueBody", js.undefined)
    
    @scala.inline
    def setUniqueBodyNull: Self = this.set("uniqueBody", null)
    
    @scala.inline
    def setWebLink(value: NullableOption[String]): Self = this.set("webLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebLink: Self = this.set("webLink", js.undefined)
    
    @scala.inline
    def setWebLinkNull: Self = this.set("webLink", null)
  }
}
