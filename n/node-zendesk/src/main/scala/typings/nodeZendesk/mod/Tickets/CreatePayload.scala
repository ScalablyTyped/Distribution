package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePayload extends js.Object {
  val ticket: CreateModel
}

object CreatePayload {
  @scala.inline
  def apply(ticket: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayload]
  }
}

