package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends js.Object {
  val ticket_metrics: js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs.ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    ticket_metrics: js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs.ResponseModel]
  ): ListPayload = {
    val __obj = js.Dynamic.literal(ticket_metrics = ticket_metrics)
  
    __obj.asInstanceOf[ListPayload]
  }
}

