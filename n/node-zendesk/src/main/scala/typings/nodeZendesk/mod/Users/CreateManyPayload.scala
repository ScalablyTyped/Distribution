package typings.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateManyPayload extends js.Object {
  var users: js.Array[CreateModel]
}

object CreateManyPayload {
  @scala.inline
  def apply(users: js.Array[CreateModel]): CreateManyPayload = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateManyPayload]
  }
}

