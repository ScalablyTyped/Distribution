package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateManyPayload extends js.Object {
  val tickets: js.Array[UpdateModel]
}

object UpdateManyPayload {
  @scala.inline
  def apply(tickets: js.Array[UpdateModel]): UpdateManyPayload = {
    val __obj = js.Dynamic.literal(tickets = tickets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateManyPayload]
  }
}

