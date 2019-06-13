package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversation extends Entity {
  /** Indicates whether any of the posts within this Conversation has at least one attachment. */
  var hasAttachments: js.UndefOr[scala.Boolean] = js.undefined
  /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z' */
  var lastDeliveredDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** A short summary from the body of the latest post in this converstaion. */
  var preview: js.UndefOr[java.lang.String] = js.undefined
  /** A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable. */
  var threads: js.UndefOr[js.Array[ConversationThread]] = js.undefined
  /** The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated. */
  var topic: js.UndefOr[java.lang.String] = js.undefined
  /** All the users that sent a message to this Conversation. */
  var uniqueSenders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Conversation {
  @scala.inline
  def apply(
    hasAttachments: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    lastDeliveredDateTime: java.lang.String = null,
    preview: java.lang.String = null,
    threads: js.Array[ConversationThread] = null,
    topic: java.lang.String = null,
    uniqueSenders: js.Array[java.lang.String] = null
  ): Conversation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastDeliveredDateTime != null) __obj.updateDynamic("lastDeliveredDateTime")(lastDeliveredDateTime)
    if (preview != null) __obj.updateDynamic("preview")(preview)
    if (threads != null) __obj.updateDynamic("threads")(threads)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (uniqueSenders != null) __obj.updateDynamic("uniqueSenders")(uniqueSenders)
    __obj.asInstanceOf[Conversation]
  }
}

