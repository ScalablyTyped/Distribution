package typings.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePayload extends js.Object {
  var user: CreateModel
}

object CreatePayload {
  @scala.inline
  def apply(user: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayload]
  }
}

