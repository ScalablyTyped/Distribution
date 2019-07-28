package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val ticket_metric: typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs.ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(ticket_metric: typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs.ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(ticket_metric = ticket_metric)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

