package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePayload extends js.Object {
  val ticket: UpdateModel
}

object UpdatePayload {
  @scala.inline
  def apply(ticket: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(ticket = ticket)
  
    __obj.asInstanceOf[UpdatePayload]
  }
}

