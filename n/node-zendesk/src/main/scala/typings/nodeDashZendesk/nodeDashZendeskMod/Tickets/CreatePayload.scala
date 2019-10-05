package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePayload extends js.Object {
  val ticket: CreateModel
}

object CreatePayload {
  @scala.inline
  def apply(ticket: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(ticket = ticket)
  
    __obj.asInstanceOf[CreatePayload]
  }
}

