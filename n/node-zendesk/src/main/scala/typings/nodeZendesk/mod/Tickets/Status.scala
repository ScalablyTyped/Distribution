package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.`new`
  - typings.nodeZendesk.nodeZendeskStrings.open
  - typings.nodeZendesk.nodeZendeskStrings.pending
  - typings.nodeZendesk.nodeZendeskStrings.hold
  - typings.nodeZendesk.nodeZendeskStrings.solved
  - typings.nodeZendesk.nodeZendeskStrings.closed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.nodeZendesk.nodeZendeskStrings.closed = this.cast("closed")
  @scala.inline
  def hold: typings.nodeZendesk.nodeZendeskStrings.hold = this.cast("hold")
  @scala.inline
  def `new`: typings.nodeZendesk.nodeZendeskStrings.`new` = this.cast("new")
  @scala.inline
  def open: typings.nodeZendesk.nodeZendeskStrings.open = this.cast("open")
  @scala.inline
  def pending: typings.nodeZendesk.nodeZendeskStrings.pending = this.cast("pending")
  @scala.inline
  def solved: typings.nodeZendesk.nodeZendeskStrings.solved = this.cast("solved")
}

