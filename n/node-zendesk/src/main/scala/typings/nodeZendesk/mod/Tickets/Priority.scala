package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.urgent
  - typings.nodeZendesk.nodeZendeskStrings.high
  - typings.nodeZendesk.nodeZendeskStrings.normal
  - typings.nodeZendesk.nodeZendeskStrings.low
*/
trait Priority extends js.Object

object Priority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.nodeZendesk.nodeZendeskStrings.high = this.cast("high")
  @scala.inline
  def low: typings.nodeZendesk.nodeZendeskStrings.low = this.cast("low")
  @scala.inline
  def normal: typings.nodeZendesk.nodeZendeskStrings.normal = this.cast("normal")
  @scala.inline
  def urgent: typings.nodeZendesk.nodeZendeskStrings.urgent = this.cast("urgent")
}

