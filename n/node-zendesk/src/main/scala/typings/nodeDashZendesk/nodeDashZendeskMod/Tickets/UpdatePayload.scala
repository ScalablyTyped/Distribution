package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePayload extends js.Object {
  val ticket: UpdateModel
}

object UpdatePayload {
  @scala.inline
  def apply(ticket: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePayload]
  }
}

