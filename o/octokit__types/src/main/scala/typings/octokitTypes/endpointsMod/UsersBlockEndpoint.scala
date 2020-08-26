package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersBlockEndpoint extends js.Object {
  var username: String = js.native
}

object UsersBlockEndpoint {
  @scala.inline
  def apply(username: String): UsersBlockEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersBlockEndpoint]
  }
  @scala.inline
  implicit class UsersBlockEndpointOps[Self <: UsersBlockEndpoint] (val x: Self) extends AnyVal {
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

