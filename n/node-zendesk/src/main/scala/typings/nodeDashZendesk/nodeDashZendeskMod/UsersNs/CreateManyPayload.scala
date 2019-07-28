package typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateManyPayload extends js.Object {
  var users: js.Array[CreateModel]
}

object CreateManyPayload {
  @scala.inline
  def apply(users: js.Array[CreateModel]): CreateManyPayload = {
    val __obj = js.Dynamic.literal(users = users)
  
    __obj.asInstanceOf[CreateManyPayload]
  }
}

