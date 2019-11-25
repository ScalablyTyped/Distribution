package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateManyPayload extends js.Object {
  val tickets: js.Array[CreateModel]
}

object CreateManyPayload {
  @scala.inline
  def apply(tickets: js.Array[CreateModel]): CreateManyPayload = {
    val __obj = js.Dynamic.literal(tickets = tickets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateManyPayload]
  }
}

