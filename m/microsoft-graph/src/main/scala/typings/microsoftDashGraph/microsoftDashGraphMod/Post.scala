package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends OutlookItem {
  // Read-only. Nullable.
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  // The contents of the post. This is a default property. This property can be null.
  var body: js.UndefOr[ItemBody] = js.undefined
  // Unique ID of the conversation. Read-only.
  var conversationId: js.UndefOr[String] = js.undefined
  // Unique ID of the conversation thread. Read-only.
  var conversationThreadId: js.UndefOr[String] = js.undefined
  // The collection of open extensions defined for the post. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  /**
    * Used in delegate access scenarios. Indicates who posted the message on behalf of another user. This is a default
    * property.
    */
  var from: js.UndefOr[Recipient] = js.undefined
  // Indicates whether the post has at least one attachment. This is a default property.
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  // Read-only.
  var inReplyTo: js.UndefOr[Post] = js.undefined
  // The collection of multi-value extended properties defined for the post. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  // Conversation participants that were added to the thread as part of this post.
  var newParticipants: js.UndefOr[js.Array[Recipient]] = js.undefined
  /**
    * Specifies when the post was received. The DateTimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var receivedDateTime: js.UndefOr[String] = js.undefined
  /**
    * Contains the address of the sender. The value of Sender is assumed to be the address of the authenticated user in the
    * case when Sender is not specified. This is a default property.
    */
  var sender: js.UndefOr[Recipient] = js.undefined
  // The collection of single-value extended properties defined for the post. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
}

object Post {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment] = null,
    body: ItemBody = null,
    categories: js.Array[String] = null,
    changeKey: String = null,
    conversationId: String = null,
    conversationThreadId: String = null,
    createdDateTime: String = null,
    extensions: js.Array[Extension] = null,
    from: Recipient = null,
    hasAttachments: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inReplyTo: Post = null,
    lastModifiedDateTime: String = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    newParticipants: js.Array[Recipient] = null,
    receivedDateTime: String = null,
    sender: Recipient = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null
  ): Post = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (body != null) __obj.updateDynamic("body")(body)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey)
    if (conversationId != null) __obj.updateDynamic("conversationId")(conversationId)
    if (conversationThreadId != null) __obj.updateDynamic("conversationThreadId")(conversationThreadId)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (from != null) __obj.updateDynamic("from")(from)
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties)
    if (newParticipants != null) __obj.updateDynamic("newParticipants")(newParticipants)
    if (receivedDateTime != null) __obj.updateDynamic("receivedDateTime")(receivedDateTime)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties)
    __obj.asInstanceOf[Post]
  }
}

