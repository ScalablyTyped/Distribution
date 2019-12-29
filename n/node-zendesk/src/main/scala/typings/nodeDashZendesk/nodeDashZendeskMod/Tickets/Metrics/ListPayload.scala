package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends js.Object {
  val ticket_metrics: js.Array[ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(ticket_metrics: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(ticket_metrics = ticket_metrics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListPayload]
  }
}

