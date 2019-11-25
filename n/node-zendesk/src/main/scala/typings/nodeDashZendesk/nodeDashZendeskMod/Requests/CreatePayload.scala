package typings.nodeDashZendesk.nodeDashZendeskMod.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePayload extends js.Object {
  val request: CreateModel
}

object CreatePayload {
  @scala.inline
  def apply(request: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePayload]
  }
}

