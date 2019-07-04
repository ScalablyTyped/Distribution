package typings
package nodeDashZendeskLib.nodeDashZendeskMod.MacrosNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def applyTicket(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    macroId: scala.Double,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ApplyTicketResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    applyTicket: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, scala.Double, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ApplyTicketResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(applyTicket = js.Any.fromFunction3(applyTicket))
  
    __obj.asInstanceOf[Methods]
  }
}

