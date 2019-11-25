package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val ticket_metric: typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Metrics.ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(ticket_metric: typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Metrics.ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(ticket_metric = ticket_metric.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

