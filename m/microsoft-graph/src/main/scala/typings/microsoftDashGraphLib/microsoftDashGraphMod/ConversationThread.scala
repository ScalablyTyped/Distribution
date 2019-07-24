package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationThread extends Entity {
  // The Cc: recipients for the thread.
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  // Indicates whether any of the posts within this thread has at least one attachment.
  var hasAttachments: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates if the thread is locked.
  var isLocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastDeliveredDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Read-only. Nullable.
  var posts: js.UndefOr[js.Array[Post]] = js.undefined
  // A short summary from the body of the latest post in this converstaion.
  var preview: js.UndefOr[java.lang.String] = js.undefined
  // The To: recipients for the thread.
  var toRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  // The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
  var topic: js.UndefOr[java.lang.String] = js.undefined
  // All the users that sent a message to this thread.
  var uniqueSenders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ConversationThread {
  @scala.inline
  def apply(
    ccRecipients: js.Array[Recipient] = null,
    hasAttachments: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    isLocked: js.UndefOr[scala.Boolean] = js.undefined,
    lastDeliveredDateTime: java.lang.String = null,
    posts: js.Array[Post] = null,
    preview: java.lang.String = null,
    toRecipients: js.Array[Recipient] = null,
    topic: java.lang.String = null,
    uniqueSenders: js.Array[java.lang.String] = null
  ): ConversationThread = {
    val __obj = js.Dynamic.literal()
    if (ccRecipients != null) __obj.updateDynamic("ccRecipients")(ccRecipients)
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isLocked)) __obj.updateDynamic("isLocked")(isLocked)
    if (lastDeliveredDateTime != null) __obj.updateDynamic("lastDeliveredDateTime")(lastDeliveredDateTime)
    if (posts != null) __obj.updateDynamic("posts")(posts)
    if (preview != null) __obj.updateDynamic("preview")(preview)
    if (toRecipients != null) __obj.updateDynamic("toRecipients")(toRecipients)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (uniqueSenders != null) __obj.updateDynamic("uniqueSenders")(uniqueSenders)
    __obj.asInstanceOf[ConversationThread]
  }
}

