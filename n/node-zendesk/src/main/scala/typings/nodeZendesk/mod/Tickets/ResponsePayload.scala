package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePayload extends js.Object {
  val audit: Audit = js.native
  val ticket: ResponseModel = js.native
}

object ResponsePayload {
  @scala.inline
  def apply(audit: Audit, ticket: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(audit = audit.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  @scala.inline
  implicit class ResponsePayloadOps[Self <: ResponsePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudit(value: Audit): Self = this.set("audit", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicket(value: ResponseModel): Self = this.set("ticket", value.asInstanceOf[js.Any])
  }
  
}

