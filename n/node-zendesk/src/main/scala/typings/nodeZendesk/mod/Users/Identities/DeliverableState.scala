package typings.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.deliverable
  - typings.nodeZendesk.nodeZendeskStrings.undeliverable
*/
trait DeliverableState extends js.Object

object DeliverableState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deliverable: typings.nodeZendesk.nodeZendeskStrings.deliverable = this.cast("deliverable")
  @scala.inline
  def undeliverable: typings.nodeZendesk.nodeZendeskStrings.undeliverable = this.cast("undeliverable")
}

