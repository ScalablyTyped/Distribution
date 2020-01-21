package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversation extends Entity {
  // Indicates whether any of the posts within this Conversation has at least one attachment.
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastDeliveredDateTime: js.UndefOr[String] = js.undefined
  // A short summary from the body of the latest post in this converstaion.
  var preview: js.UndefOr[String] = js.undefined
  // A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
  var threads: js.UndefOr[js.Array[ConversationThread]] = js.undefined
  // The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
  var topic: js.UndefOr[String] = js.undefined
  // All the users that sent a message to this Conversation.
  var uniqueSenders: js.UndefOr[js.Array[String]] = js.undefined
}

object Conversation {
  @scala.inline
  def apply(
    hasAttachments: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastDeliveredDateTime: String = null,
    preview: String = null,
    threads: js.Array[ConversationThread] = null,
    topic: String = null,
    uniqueSenders: js.Array[String] = null
  ): Conversation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastDeliveredDateTime != null) __obj.updateDynamic("lastDeliveredDateTime")(lastDeliveredDateTime.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (uniqueSenders != null) __obj.updateDynamic("uniqueSenders")(uniqueSenders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
}

