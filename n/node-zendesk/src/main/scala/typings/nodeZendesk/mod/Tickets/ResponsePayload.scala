package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val audit: Audit
  val ticket: ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(audit: Audit, ticket: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(audit = audit.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

