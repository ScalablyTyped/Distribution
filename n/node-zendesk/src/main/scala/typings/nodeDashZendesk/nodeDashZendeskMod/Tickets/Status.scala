package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.`new`
  - typings.nodeDashZendesk.nodeDashZendeskStrings.open
  - typings.nodeDashZendesk.nodeDashZendeskStrings.pending
  - typings.nodeDashZendesk.nodeDashZendeskStrings.hold
  - typings.nodeDashZendesk.nodeDashZendeskStrings.solved
  - typings.nodeDashZendesk.nodeDashZendeskStrings.closed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.nodeDashZendesk.nodeDashZendeskStrings.closed = this.cast("closed")
  @scala.inline
  def hold: typings.nodeDashZendesk.nodeDashZendeskStrings.hold = this.cast("hold")
  @scala.inline
  def `new`: typings.nodeDashZendesk.nodeDashZendeskStrings.`new` = this.cast("new")
  @scala.inline
  def open: typings.nodeDashZendesk.nodeDashZendeskStrings.open = this.cast("open")
  @scala.inline
  def pending: typings.nodeDashZendesk.nodeDashZendeskStrings.pending = this.cast("pending")
  @scala.inline
  def solved: typings.nodeDashZendesk.nodeDashZendeskStrings.solved = this.cast("solved")
}

