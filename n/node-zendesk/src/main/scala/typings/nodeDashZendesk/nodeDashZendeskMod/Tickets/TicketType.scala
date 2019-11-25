package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.problem
  - typings.nodeDashZendesk.nodeDashZendeskStrings.incident
  - typings.nodeDashZendesk.nodeDashZendeskStrings.question
  - typings.nodeDashZendesk.nodeDashZendeskStrings.task
*/
trait TicketType extends js.Object

object TicketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incident: typings.nodeDashZendesk.nodeDashZendeskStrings.incident = this.cast("incident")
  @scala.inline
  def problem: typings.nodeDashZendesk.nodeDashZendeskStrings.problem = this.cast("problem")
  @scala.inline
  def question: typings.nodeDashZendesk.nodeDashZendeskStrings.question = this.cast("question")
  @scala.inline
  def task: typings.nodeDashZendesk.nodeDashZendeskStrings.task = this.cast("task")
}

