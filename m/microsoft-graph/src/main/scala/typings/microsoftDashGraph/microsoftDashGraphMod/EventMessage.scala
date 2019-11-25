package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMessage extends Message {
  /**
    * The event associated with the event message. The assumption for attendees or room resources is that the Calendar
    * Attendant is set to automatically update the calendar with an event when meeting request event messages arrive.
    * Navigation property. Read-only.
    */
  var event: js.UndefOr[Event] = js.undefined
  /**
    * The type of event message: none, meetingRequest, meetingCancelled, meetingAccepted, meetingTenativelyAccepted,
    * meetingDeclined.
    */
  var meetingMessageType: js.UndefOr[MeetingMessageType] = js.undefined
}

object EventMessage {
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
    event: Event = null,
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
    meetingMessageType: MeetingMessageType = null,
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
  ): EventMessage = {
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
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
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
    if (meetingMessageType != null) __obj.updateDynamic("meetingMessageType")(meetingMessageType.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[EventMessage]
  }
}

