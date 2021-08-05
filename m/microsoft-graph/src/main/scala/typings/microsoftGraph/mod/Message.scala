package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message
  extends StObject
     with OutlookItem {
  
  // The fileAttachment and itemAttachment attachments for the message.
  var attachments: js.UndefOr[NullableOption[js.Array[Attachment]]] = js.undefined
  
  // The Bcc: recipients for the message.
  var bccRecipients: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  // The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
  var body: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  // The first 255 characters of the message body. It is in text format.
  var bodyPreview: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Cc: recipients for the message.
  var ccRecipients: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  // The ID of the conversation the email belongs to.
  var conversationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the position of the message within the conversation.
  var conversationIndex: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The collection of open extensions defined for the message. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  // The flag value that indicates the status, start date, due date, or completion date for the message.
  var flag: js.UndefOr[NullableOption[FollowupFlag]] = js.undefined
  
  /**
    * The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property,
    * except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about
    * setting the from and sender properties of a message.
    */
  var from: js.UndefOr[NullableOption[Recipient]] = js.undefined
  
  /**
    * Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message
    * contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body
    * property to look for a src attribute, such as &amp;lt;IMG src='cid:image001.jpg@01D26CD8.6C05F070'&amp;gt;.
    */
  var hasAttachments: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The importance of the message: Low, Normal, High.
  var importance: js.UndefOr[NullableOption[Importance]] = js.undefined
  
  /**
    * The classification of the message for the user, based on inferred relevance or importance, or on an explicit override.
    * The possible values are: focused or other.
    */
  var inferenceClassification: js.UndefOr[NullableOption[InferenceClassificationType]] = js.undefined
  
  /**
    * A collection of message headers defined by RFC5322. The set includes message headers indicating the network path taken
    * by a message from the sender to the recipient. It can also contain custom message headers that hold app data for the
    * message. Returned only on applying a $select query option. Read-only.
    */
  var internetMessageHeaders: js.UndefOr[NullableOption[js.Array[InternetMessageHeader]]] = js.undefined
  
  // The message ID in the format specified by RFC2822.
  var internetMessageId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether a read receipt is requested for the message.
  var isDeliveryReceiptRequested: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the message is a draft. A message is a draft if it hasn't been sent yet.
  var isDraft: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the message has been read.
  var isRead: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether a read receipt is requested for the message.
  var isReadReceiptRequested: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The collection of multi-value extended properties defined for the message. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  // The unique identifier for the message's parent mailFolder.
  var parentFolderId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time the message was received.
  var receivedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The email addresses to use when replying.
  var replyTo: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  /**
    * The account that is actually used to generate the message. In most cases, this value is the same as the from property.
    * You can set this property to a different value when sending a message from a shared mailbox, for a shared calendar, or
    * as a delegate. In any case, the value must correspond to the actual mailbox used. Find out more about setting the from
    * and sender properties of a message.
    */
  var sender: js.UndefOr[NullableOption[Recipient]] = js.undefined
  
  // The date and time the message was sent.
  var sentDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of single-value extended properties defined for the message. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
  
  // The subject of the message.
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The To: recipients for the message.
  var toRecipients: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  /**
    * The part of the body of the message that is unique to the current message. uniqueBody is not returned by default but
    * can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
    */
  var uniqueBody: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  /**
    * The URL to open the message in Outlook on the web.You can append an ispopout argument to the end of the URL to change
    * how the message is displayed. If ispopout is not present or if it is set to 1, then the message is shown in a popout
    * window. If ispopout is set to 0, then the browser will show the message in the Outlook on the web review pane.The
    * message will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to
    * login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[NullableOption[String]] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setAttachments(value: NullableOption[js.Array[Attachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    inline def setBccRecipients(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "bccRecipients", value.asInstanceOf[js.Any])
    
    inline def setBccRecipientsNull: Self = StObject.set(x, "bccRecipients", null)
    
    inline def setBccRecipientsUndefined: Self = StObject.set(x, "bccRecipients", js.undefined)
    
    inline def setBccRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "bccRecipients", js.Array(value :_*))
    
    inline def setBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyPreview(value: NullableOption[String]): Self = StObject.set(x, "bodyPreview", value.asInstanceOf[js.Any])
    
    inline def setBodyPreviewNull: Self = StObject.set(x, "bodyPreview", null)
    
    inline def setBodyPreviewUndefined: Self = StObject.set(x, "bodyPreview", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCcRecipients(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "ccRecipients", value.asInstanceOf[js.Any])
    
    inline def setCcRecipientsNull: Self = StObject.set(x, "ccRecipients", null)
    
    inline def setCcRecipientsUndefined: Self = StObject.set(x, "ccRecipients", js.undefined)
    
    inline def setCcRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "ccRecipients", js.Array(value :_*))
    
    inline def setConversationId(value: NullableOption[String]): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    inline def setConversationIdNull: Self = StObject.set(x, "conversationId", null)
    
    inline def setConversationIdUndefined: Self = StObject.set(x, "conversationId", js.undefined)
    
    inline def setConversationIndex(value: NullableOption[Double]): Self = StObject.set(x, "conversationIndex", value.asInstanceOf[js.Any])
    
    inline def setConversationIndexNull: Self = StObject.set(x, "conversationIndex", null)
    
    inline def setConversationIndexUndefined: Self = StObject.set(x, "conversationIndex", js.undefined)
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setFlag(value: NullableOption[FollowupFlag]): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagNull: Self = StObject.set(x, "flag", null)
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setFrom(value: NullableOption[Recipient]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHasAttachments(value: NullableOption[Boolean]): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentsNull: Self = StObject.set(x, "hasAttachments", null)
    
    inline def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    inline def setImportance(value: NullableOption[Importance]): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceNull: Self = StObject.set(x, "importance", null)
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    inline def setInferenceClassification(value: NullableOption[InferenceClassificationType]): Self = StObject.set(x, "inferenceClassification", value.asInstanceOf[js.Any])
    
    inline def setInferenceClassificationNull: Self = StObject.set(x, "inferenceClassification", null)
    
    inline def setInferenceClassificationUndefined: Self = StObject.set(x, "inferenceClassification", js.undefined)
    
    inline def setInternetMessageHeaders(value: NullableOption[js.Array[InternetMessageHeader]]): Self = StObject.set(x, "internetMessageHeaders", value.asInstanceOf[js.Any])
    
    inline def setInternetMessageHeadersNull: Self = StObject.set(x, "internetMessageHeaders", null)
    
    inline def setInternetMessageHeadersUndefined: Self = StObject.set(x, "internetMessageHeaders", js.undefined)
    
    inline def setInternetMessageHeadersVarargs(value: InternetMessageHeader*): Self = StObject.set(x, "internetMessageHeaders", js.Array(value :_*))
    
    inline def setInternetMessageId(value: NullableOption[String]): Self = StObject.set(x, "internetMessageId", value.asInstanceOf[js.Any])
    
    inline def setInternetMessageIdNull: Self = StObject.set(x, "internetMessageId", null)
    
    inline def setInternetMessageIdUndefined: Self = StObject.set(x, "internetMessageId", js.undefined)
    
    inline def setIsDeliveryReceiptRequested(value: NullableOption[Boolean]): Self = StObject.set(x, "isDeliveryReceiptRequested", value.asInstanceOf[js.Any])
    
    inline def setIsDeliveryReceiptRequestedNull: Self = StObject.set(x, "isDeliveryReceiptRequested", null)
    
    inline def setIsDeliveryReceiptRequestedUndefined: Self = StObject.set(x, "isDeliveryReceiptRequested", js.undefined)
    
    inline def setIsDraft(value: NullableOption[Boolean]): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
    
    inline def setIsDraftNull: Self = StObject.set(x, "isDraft", null)
    
    inline def setIsDraftUndefined: Self = StObject.set(x, "isDraft", js.undefined)
    
    inline def setIsRead(value: NullableOption[Boolean]): Self = StObject.set(x, "isRead", value.asInstanceOf[js.Any])
    
    inline def setIsReadNull: Self = StObject.set(x, "isRead", null)
    
    inline def setIsReadReceiptRequested(value: NullableOption[Boolean]): Self = StObject.set(x, "isReadReceiptRequested", value.asInstanceOf[js.Any])
    
    inline def setIsReadReceiptRequestedNull: Self = StObject.set(x, "isReadReceiptRequested", null)
    
    inline def setIsReadReceiptRequestedUndefined: Self = StObject.set(x, "isReadReceiptRequested", js.undefined)
    
    inline def setIsReadUndefined: Self = StObject.set(x, "isRead", js.undefined)
    
    inline def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    inline def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    inline def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value :_*))
    
    inline def setParentFolderId(value: NullableOption[String]): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdNull: Self = StObject.set(x, "parentFolderId", null)
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setReceivedDateTime(value: NullableOption[String]): Self = StObject.set(x, "receivedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReceivedDateTimeNull: Self = StObject.set(x, "receivedDateTime", null)
    
    inline def setReceivedDateTimeUndefined: Self = StObject.set(x, "receivedDateTime", js.undefined)
    
    inline def setReplyTo(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToNull: Self = StObject.set(x, "replyTo", null)
    
    inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    inline def setReplyToVarargs(value: Recipient*): Self = StObject.set(x, "replyTo", js.Array(value :_*))
    
    inline def setSender(value: NullableOption[Recipient]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderNull: Self = StObject.set(x, "sender", null)
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSentDateTime(value: NullableOption[String]): Self = StObject.set(x, "sentDateTime", value.asInstanceOf[js.Any])
    
    inline def setSentDateTimeNull: Self = StObject.set(x, "sentDateTime", null)
    
    inline def setSentDateTimeUndefined: Self = StObject.set(x, "sentDateTime", js.undefined)
    
    inline def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    inline def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    inline def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value :_*))
    
    inline def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setToRecipients(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "toRecipients", value.asInstanceOf[js.Any])
    
    inline def setToRecipientsNull: Self = StObject.set(x, "toRecipients", null)
    
    inline def setToRecipientsUndefined: Self = StObject.set(x, "toRecipients", js.undefined)
    
    inline def setToRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "toRecipients", js.Array(value :_*))
    
    inline def setUniqueBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "uniqueBody", value.asInstanceOf[js.Any])
    
    inline def setUniqueBodyNull: Self = StObject.set(x, "uniqueBody", null)
    
    inline def setUniqueBodyUndefined: Self = StObject.set(x, "uniqueBody", js.undefined)
    
    inline def setWebLink(value: NullableOption[String]): Self = StObject.set(x, "webLink", value.asInstanceOf[js.Any])
    
    inline def setWebLinkNull: Self = StObject.set(x, "webLink", null)
    
    inline def setWebLinkUndefined: Self = StObject.set(x, "webLink", js.undefined)
  }
}
