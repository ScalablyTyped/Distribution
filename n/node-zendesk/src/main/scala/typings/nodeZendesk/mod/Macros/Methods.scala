package typings.nodeZendesk.mod.Macros

import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def applyTicket(ticketId: ZendeskID, macroId: Double): js.Promise[ApplyTicketResponsePayload] = js.native
  def applyTicket(ticketId: ZendeskID, macroId: Double, cb: ZendeskCallback[_, _]): ApplyTicketResponsePayload = js.native
}

