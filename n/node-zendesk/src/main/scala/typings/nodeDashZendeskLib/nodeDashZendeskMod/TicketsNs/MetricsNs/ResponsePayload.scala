package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.MetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val ticket_metric: ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(ticket_metric: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(ticket_metric = ticket_metric)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

