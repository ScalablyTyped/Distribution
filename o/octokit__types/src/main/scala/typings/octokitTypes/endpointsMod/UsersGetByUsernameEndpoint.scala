package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetByUsernameEndpoint extends js.Object {
  var username: String
}

object UsersGetByUsernameEndpoint {
  @scala.inline
  def apply(username: String): UsersGetByUsernameEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetByUsernameEndpoint]
  }
}

