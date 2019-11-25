package typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val identity: typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(identity: typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

