package typings.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateManyPayload extends js.Object {
  var users: js.Array[UpdateModel] = js.native
}

object UpdateManyPayload {
  @scala.inline
  def apply(users: js.Array[UpdateModel]): UpdateManyPayload = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateManyPayload]
  }
  @scala.inline
  implicit class UpdateManyPayloadOps[Self <: UpdateManyPayload] (val x: Self) extends AnyVal {
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
    def setUsersVarargs(value: UpdateModel*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[UpdateModel]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

