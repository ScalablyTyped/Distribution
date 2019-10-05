package typings.nodeDashZendesk.nodeDashZendeskMod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateManyPayload extends js.Object {
  var users: js.Array[UpdateModel]
}

object UpdateManyPayload {
  @scala.inline
  def apply(users: js.Array[UpdateModel]): UpdateManyPayload = {
    val __obj = js.Dynamic.literal(users = users)
  
    __obj.asInstanceOf[UpdateManyPayload]
  }
}

