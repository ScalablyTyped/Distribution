package typings.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePayload extends js.Object {
  val identity: CreateModel
}

object CreatePayload {
  @scala.inline
  def apply(identity: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePayload]
  }
}

