package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.urgent
  - typings.nodeDashZendesk.nodeDashZendeskStrings.high
  - typings.nodeDashZendesk.nodeDashZendeskStrings.normal
  - typings.nodeDashZendesk.nodeDashZendeskStrings.low
*/
trait Priority extends js.Object

object Priority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.nodeDashZendesk.nodeDashZendeskStrings.high = this.cast("high")
  @scala.inline
  def low: typings.nodeDashZendesk.nodeDashZendeskStrings.low = this.cast("low")
  @scala.inline
  def normal: typings.nodeDashZendesk.nodeDashZendeskStrings.normal = this.cast("normal")
  @scala.inline
  def urgent: typings.nodeDashZendesk.nodeDashZendeskStrings.urgent = this.cast("urgent")
}

