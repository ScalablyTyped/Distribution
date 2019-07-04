package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audit extends js.Object {
  val author_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
  val created_at: java.lang.String
  val events: js.Array[_] | scala.Null
  val id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
  val metadata: js.Any | scala.Null
  val ticket_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
  val via: Via | scala.Null
}

object Audit {
  @scala.inline
  def apply(
    author_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    created_at: java.lang.String,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    ticket_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
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

