package typings.nodeZendesk.mod.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePayload extends js.Object {
  val request: UpdateModel
}

object UpdatePayload {
  @scala.inline
  def apply(request: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePayload]
  }
}

