package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMessage extends Message {
  /**
    * The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to
    * automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
    */
  var event: js.UndefOr[Event] = js.undefined
  /** The type of event message: none, meetingRequest, meetingCancelled, meetingAccepted, meetingTenativelyAccepted, meetingDeclined. */
  var meetingMessageType: js.UndefOr[MeetingMessageType] = js.undefined
}

object EventMessage {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment] = null,
    bccRecipients: js.Array[Recipient] = null,
    body: ItemBody = null,
    bodyPreview: java.lang.String = null,
    categories: js.Array[java.lang.String] = null,
    ccRecipients: js.Array[Recipient] = null,
    changeKey: java.lang.String = null,
    conversationId: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    event: Event = null,
    extensions: js.Array[Extension] = null,
    flag: FollowupFlag = null,
    from: Recipient = null,
    hasAttachments: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    importance: Importance = null,
    inferenceClassification: InferenceClassificationType = null,
    internetMessageHeaders: js.Array[InternetMessageHeader] = null,
    internetMessageId: java.lang.String = null,
    isDeliveryReceiptRequested: js.UndefOr[scala.Boolean] = js.undefined,
    isDraft: js.UndefOr[scala.Boolean] = js.undefined,
    isRead: js.UndefOr[scala.Boolean] = js.undefined,
    isReadReceiptRequested: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDateTime: java.lang.String = null,
    meetingMessageType: MeetingMessageType = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: java.lang.String = null,
    receivedDateTime: java.lang.String = null,
    replyTo: js.Array[Recipient] = null,
    sender: Recipient = null,
    sentDateTime: java.lang.String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    subject: java.lang.String = null,
    toRecipients: js.Array[Recipient] = null,
    uniqueBody: ItemBody = null,
    webLink: java.lang.String = null
  ): EventMessage = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bccRecipients != null) __obj.updateDynamic("bccRecipients")(bccRecipients)
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyPreview != null) __obj.updateDynamic("bodyPreview")(bodyPreview)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (ccRecipients != null) __obj.updateDynamic("ccRecipients")(ccRecipients)
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey)
    if (conversationId != null) __obj.updateDynamic("conversationId")(conversationId)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (event != null) __obj.updateDynamic("event")(event)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (from != null) __obj.updateDynamic("from")(from)
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (importance != null) __obj.updateDynamic("importance")(importance)
    if (inferenceClassification != null) __obj.updateDynamic("inferenceClassification")(inferenceClassification)
    if (internetMessageHeaders != null) __obj.updateDynamic("internetMessageHeaders")(internetMessageHeaders)
    if (internetMessageId != null) __obj.updateDynamic("internetMessageId")(internetMessageId)
    if (!js.isUndefined(isDeliveryReceiptRequested)) __obj.updateDynamic("isDeliveryReceiptRequested")(isDeliveryReceiptRequested)
    if (!js.isUndefined(isDraft)) __obj.updateDynamic("isDraft")(isDraft)
    if (!js.isUndefined(isRead)) __obj.updateDynamic("isRead")(isRead)
    if (!js.isUndefined(isReadReceiptRequested)) __obj.updateDynamic("isReadReceiptRequested")(isReadReceiptRequested)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (meetingMessageType != null) __obj.updateDynamic("meetingMessageType")(meetingMessageType)
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (receivedDateTime != null) __obj.updateDynamic("receivedDateTime")(receivedDateTime)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (sentDateTime != null) __obj.updateDynamic("sentDateTime")(sentDateTime)
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (toRecipients != null) __obj.updateDynamic("toRecipients")(toRecipients)
    if (uniqueBody != null) __obj.updateDynamic("uniqueBody")(uniqueBody)
    if (webLink != null) __obj.updateDynamic("webLink")(webLink)
    __obj.asInstanceOf[EventMessage]
  }
}

