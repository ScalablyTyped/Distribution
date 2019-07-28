package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audit extends js.Object {
  val author_id: ZendeskID
  val created_at: String
  val events: js.Array[_] | Null
  val id: ZendeskID
  val metadata: js.Any | Null
  val ticket_id: ZendeskID
  val via: Via | Null
}

object Audit {
  @scala.inline
  def apply(
    author_id: ZendeskID,
    created_at: String,
    id: ZendeskID,
    ticket_id: ZendeskID,
    events: js.Array[_] = null,
    metadata: js.Any = null,
    via: Via = null
  ): Audit = {
    val __obj = js.Dynamic.literal(author_id = author_id, created_at = created_at, id = id, ticket_id = ticket_id)
    if (events != null) __obj.updateDynamic("events")(events)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (via != null) __obj.updateDynamic("via")(via)
    __obj.asInstanceOf[Audit]
  }
}

