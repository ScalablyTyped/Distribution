package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersBlockEndpoint extends js.Object {
  var username: String
}

object UsersBlockEndpoint {
  @scala.inline
  def apply(username: String): UsersBlockEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersBlockEndpoint]
  }
}

