package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

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
    val __obj = js.Dynamic.literal(audit = audit, ticket = ticket)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

