package typings.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePayload extends js.Object {
  var user: UpdateModel
}

object UpdatePayload {
  @scala.inline
  def apply(user: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePayload]
  }
}

