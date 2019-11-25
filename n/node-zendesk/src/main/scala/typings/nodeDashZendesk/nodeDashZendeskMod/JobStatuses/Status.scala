package typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.queued
  - typings.nodeDashZendesk.nodeDashZendeskStrings.working
  - typings.nodeDashZendesk.nodeDashZendeskStrings.failed
  - typings.nodeDashZendesk.nodeDashZendeskStrings.completed
  - typings.nodeDashZendesk.nodeDashZendeskStrings.killed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.nodeDashZendesk.nodeDashZendeskStrings.completed = this.cast("completed")
  @scala.inline
  def failed: typings.nodeDashZendesk.nodeDashZendeskStrings.failed = this.cast("failed")
  @scala.inline
  def killed: typings.nodeDashZendesk.nodeDashZendeskStrings.killed = this.cast("killed")
  @scala.inline
  def queued: typings.nodeDashZendesk.nodeDashZendeskStrings.queued = this.cast("queued")
  @scala.inline
  def working: typings.nodeDashZendesk.nodeDashZendeskStrings.working = this.cast("working")
}

