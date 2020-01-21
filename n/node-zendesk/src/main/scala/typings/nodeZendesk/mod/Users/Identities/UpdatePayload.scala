package typings.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePayload extends js.Object {
  val identity: UpdateModel
}

object UpdatePayload {
  @scala.inline
  def apply(identity: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePayload]
  }
}

