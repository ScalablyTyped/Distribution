package typings.nodeDashZendesk.nodeDashZendeskMod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.assigned
  - typings.nodeDashZendesk.nodeDashZendeskStrings.groups
  - typings.nodeDashZendesk.nodeDashZendeskStrings.organization
  - typings.nodeDashZendesk.nodeDashZendeskStrings.requested
*/
trait TicketRestriction extends js.Object

object TicketRestriction {
  @scala.inline
  def assigned: typings.nodeDashZendesk.nodeDashZendeskStrings.assigned = this.cast("assigned")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def groups: typings.nodeDashZendesk.nodeDashZendeskStrings.groups = this.cast("groups")
  @scala.inline
  def organization: typings.nodeDashZendesk.nodeDashZendeskStrings.organization = this.cast("organization")
  @scala.inline
  def requested: typings.nodeDashZendesk.nodeDashZendeskStrings.requested = this.cast("requested")
}

