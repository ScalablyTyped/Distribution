package typings.nodeZendesk.mod.JobStatuses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.queued
  - typings.nodeZendesk.nodeZendeskStrings.working
  - typings.nodeZendesk.nodeZendeskStrings.failed
  - typings.nodeZendesk.nodeZendeskStrings.completed
  - typings.nodeZendesk.nodeZendeskStrings.killed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.nodeZendesk.nodeZendeskStrings.completed = this.cast("completed")
  @scala.inline
  def failed: typings.nodeZendesk.nodeZendeskStrings.failed = this.cast("failed")
  @scala.inline
  def killed: typings.nodeZendesk.nodeZendeskStrings.killed = this.cast("killed")
  @scala.inline
  def queued: typings.nodeZendesk.nodeZendeskStrings.queued = this.cast("queued")
  @scala.inline
  def working: typings.nodeZendesk.nodeZendeskStrings.working = this.cast("working")
}

