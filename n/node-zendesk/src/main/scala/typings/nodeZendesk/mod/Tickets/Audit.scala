package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
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
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ticket_id = ticket_id.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audit]
  }
}

