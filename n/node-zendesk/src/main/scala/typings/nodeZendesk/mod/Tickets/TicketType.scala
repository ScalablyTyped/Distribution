package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.problem
  - typings.nodeZendesk.nodeZendeskStrings.incident
  - typings.nodeZendesk.nodeZendeskStrings.question
  - typings.nodeZendesk.nodeZendeskStrings.task
*/
trait TicketType extends js.Object

object TicketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incident: typings.nodeZendesk.nodeZendeskStrings.incident = this.cast("incident")
  @scala.inline
  def problem: typings.nodeZendesk.nodeZendeskStrings.problem = this.cast("problem")
  @scala.inline
  def question: typings.nodeZendesk.nodeZendeskStrings.question = this.cast("question")
  @scala.inline
  def task: typings.nodeZendesk.nodeZendeskStrings.task = this.cast("task")
}

