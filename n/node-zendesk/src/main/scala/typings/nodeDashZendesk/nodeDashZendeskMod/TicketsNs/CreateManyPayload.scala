package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateManyPayload extends js.Object {
  val tickets: js.Array[CreateModel]
}

object CreateManyPayload {
  @scala.inline
  def apply(tickets: js.Array[CreateModel]): CreateManyPayload = {
    val __obj = js.Dynamic.literal(tickets = tickets)
  
    __obj.asInstanceOf[CreateManyPayload]
  }
}

