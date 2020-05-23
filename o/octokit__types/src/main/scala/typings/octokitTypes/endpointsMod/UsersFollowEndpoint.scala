package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersFollowEndpoint extends js.Object {
  var username: String
}

object UsersFollowEndpoint {
  @scala.inline
  def apply(username: String): UsersFollowEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersFollowEndpoint]
  }
}

