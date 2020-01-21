package typings.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.assigned
  - typings.nodeZendesk.nodeZendeskStrings.groups
  - typings.nodeZendesk.nodeZendeskStrings.organization
  - typings.nodeZendesk.nodeZendeskStrings.requested
*/
trait TicketRestriction extends js.Object

object TicketRestriction {
  @scala.inline
  def assigned: typings.nodeZendesk.nodeZendeskStrings.assigned = this.cast("assigned")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def groups: typings.nodeZendesk.nodeZendeskStrings.groups = this.cast("groups")
  @scala.inline
  def organization: typings.nodeZendesk.nodeZendeskStrings.organization = this.cast("organization")
  @scala.inline
  def requested: typings.nodeZendesk.nodeZendeskStrings.requested = this.cast("requested")
}

