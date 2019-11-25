package typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.deliverable
  - typings.nodeDashZendesk.nodeDashZendeskStrings.undeliverable
*/
trait DeliverableState extends js.Object

object DeliverableState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deliverable: typings.nodeDashZendesk.nodeDashZendeskStrings.deliverable = this.cast("deliverable")
  @scala.inline
  def undeliverable: typings.nodeDashZendesk.nodeDashZendeskStrings.undeliverable = this.cast("undeliverable")
}

