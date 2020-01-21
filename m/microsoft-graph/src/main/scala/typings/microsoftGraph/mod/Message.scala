package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends OutlookItem {
  // The fileAttachment and itemAttachment attachments for the message.
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  // The Bcc: recipients for the message.
  var bccRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  // The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
  var body: js.UndefOr[ItemBody] = js.undefined
  // The first 255 characters of the message body. It is in text format.
  var bodyPreview: js.UndefOr[String] = js.undefined
  // The Cc: recipients for the message.
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  // The ID of the conversation the email belongs to.
  var conversationId: js.UndefOr[String] = js.undefined
  // The collection of open extensions defined for the message. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  // The flag value that indicates the status, start date, due date, or completion date for the message.
  var flag: js.UndefOr[FollowupFlag] = js.undefined
  /**
    * The mailbox owner and sender of the message. The value must correspond to the actual mailbox used. Find out more about
    * setting the from and sender properties of a message.
    */
  var from: js.UndefOr[Recipient] = js.undefined
  /**
    * Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message
    * contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body
    * property to look for a src attribute, such as &amp;lt;IMG src='cid:image001.jpg@01D26CD8.6C05F070'&amp;gt;.
    */
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  // The importance of the message: Low, Normal, High.
  var importance: js.UndefOr[Importance] = js.undefined
  /**
    * The classification of the message for the user, based on inferred relevance or importance, or on an explicit override.
    * The possible values are: focused or other.
    */
  var inferenceClassification: js.UndefOr[InferenceClassificationType] = js.undefined
  /**
    * A collection of message headers defined by RFC5322. The set includes message headers indicating the network path taken
    * by a message from the sender to the recipient. It can also contain custom message headers that hold app data for the
    * message. Returned only on applying a $select query option. Read-only.
    */
  var internetMessageHeaders: js.UndefOr[js.Array[InternetMessageHeader]] = js.undefined
  // The message ID in the format specified by RFC2822.
  var internetMessageId: js.UndefOr[String] = js.undefined
  // Indicates whether a read receipt is requested for the message.
  var isDeliveryReceiptRequested: js.UndefOr[Boolean] = js.undefined
  // Indicates whether the message is a draft. A message is a draft if it hasn't been sent yet.
  var isDraft: js.UndefOr[Boolean] = js.undefined
  // Indicates whether the message has been read.
  var isRead: js.UndefOr[Boolean] = js.undefined
  // Indicates whether a read receipt is requested for the message.
  var isReadReceiptRequested: js.UndefOr[Boolean] = js.undefined
  // The collection of multi-value extended properties defined for the message. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  // The unique identifier for the message's parent mailFolder.
  var parentFolderId: js.UndefOr[String] = js.undefined
  // The date and time the message was received.
  var receivedDateTime: js.UndefOr[String] = js.undefined
  // The email addresses to use when replying.
  var replyTo: js.UndefOr[js.Array[Recipient]] = js.undefined
  /**
    * The account that is actually used to generate the message. In most cases, this value is the same as the from property.
    * You can set this property to a different value when sending a message from a shared mailbox, or sending a message as a
    * delegate. In any case, the value must correspond to the actual mailbox used. Find out more about setting the from and
    * sender properties of a message.
    */
  var sender: js.UndefOr[Recipient] = js.undefined
  // The date and time the message was sent.
  var sentDateTime: js.UndefOr[String] = js.undefined
  // The collection of single-value extended properties defined for the message. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
  // The subject of the message.
  var subject: js.UndefOr[String] = js.undefined
  // The To: recipients for the message.
  var toRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  /**
    * The part of the body of the message that is unique to the current message. uniqueBody is not returned by default but
    * can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
    */
  var uniqueBody: js.UndefOr[ItemBody] = js.undefined
  /**
    * The URL to open the message in Outlook Web App.You can append an ispopout argument to the end of the URL to change how
    * the message is displayed. If ispopout is not present or if it is set to 1, then the message is shown in a popout
    * window. If ispopout is set to 0, then the browser will show the message in the Outlook Web App review pane.The message
    * will open in the browser if you are logged in to your mailbox via Outlook Web App. You will be prompted to login if you
    * are not already logged in with the browser.This URL can be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment] = null,
    bccRecipients: js.Array[Recipient] = null,
    body: ItemBody = null,
    bodyPreview: String = null,
    categories: js.Array[String] = null,
    ccRecipients: js.Array[Recipient] = null,
    changeKey: String = null,
    conversationId: String = null,
    createdDateTime: String = null,
    extensions: js.Array[Extension] = null,
    flag: FollowupFlag = null,
    from: Recipient = null,
    hasAttachments: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    importance: Importance = null,
    inferenceClassification: InferenceClassificationType = null,
    internetMessageHeaders: js.Array[InternetMessageHeader] = null,
    internetMessageId: String = null,
    isDeliveryReceiptRequested: js.UndefOr[Boolean] = js.undefined,
    isDraft: js.UndefOr[Boolean] = js.undefined,
    isRead: js.UndefOr[Boolean] = js.undefined,
    isReadReceiptRequested: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: String = null,
    receivedDateTime: String = null,
    replyTo: js.Array[Recipient] = null,
    sender: Recipient = null,
    sentDateTime: String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    subject: String = null,
    toRecipients: js.Array[Recipient] = null,
    uniqueBody: ItemBody = null,
    webLink: String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bccRecipients != null) __obj.updateDynamic("bccRecipients")(bccRecipients.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyPreview != null) __obj.updateDynamic("bodyPreview")(bodyPreview.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (ccRecipients != null) __obj.updateDynamic("ccRecipients")(ccRecipients.asInstanceOf[js.Any])
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey.asInstanceOf[js.Any])
    if (conversationId != null) __obj.updateDynamic("conversationId")(conversationId.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (importance != null) __obj.updateDynamic("importance")(importance.asInstanceOf[js.Any])
    if (inferenceClassification != null) __obj.updateDynamic("inferenceClassification")(inferenceClassification.asInstanceOf[js.Any])
    if (internetMessageHeaders != null) __obj.updateDynamic("internetMessageHeaders")(internetMessageHeaders.asInstanceOf[js.Any])
    if (internetMessageId != null) __obj.updateDynamic("internetMessageId")(internetMessageId.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeliveryReceiptRequested)) __obj.updateDynamic("isDeliveryReceiptRequested")(isDeliveryReceiptRequested.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraft)) __obj.updateDynamic("isDraft")(isDraft.asInstanceOf[js.Any])
    if (!js.isUndefined(isRead)) __obj.updateDynamic("isRead")(isRead.asInstanceOf[js.Any])
    if (!js.isUndefined(isReadReceiptRequested)) __obj.updateDynamic("isReadReceiptRequested")(isReadReceiptRequested.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (receivedDateTime != null) __obj.updateDynamic("receivedDateTime")(receivedDateTime.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (sentDateTime != null) __obj.updateDynamic("sentDateTime")(sentDateTime.asInstanceOf[js.Any])
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (toRecipients != null) __obj.updateDynamic("toRecipients")(toRecipients.asInstanceOf[js.Any])
    if (uniqueBody != null) __obj.updateDynamic("uniqueBody")(uniqueBody.asInstanceOf[js.Any])
    if (webLink != null) __obj.updateDynamic("webLink")(webLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

