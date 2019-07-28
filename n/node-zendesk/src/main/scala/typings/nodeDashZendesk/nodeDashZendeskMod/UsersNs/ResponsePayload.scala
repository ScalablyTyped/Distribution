package typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  var user: ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(user: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(user = user)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

