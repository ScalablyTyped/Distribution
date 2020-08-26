package typings.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePayload extends js.Object {
  val identity: UpdateModel = js.native
}

object UpdatePayload {
  @scala.inline
  def apply(identity: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePayload]
  }
  @scala.inline
  implicit class UpdatePayloadOps[Self <: UpdatePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentity(value: UpdateModel): Self = this.set("identity", value.asInstanceOf[js.Any])
  }
  
}

