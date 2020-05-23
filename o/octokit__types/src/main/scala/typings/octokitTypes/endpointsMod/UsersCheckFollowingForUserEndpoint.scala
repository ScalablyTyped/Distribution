package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCheckFollowingForUserEndpoint extends js.Object {
  var target_user: String
  var username: String
}

object UsersCheckFollowingForUserEndpoint {
  @scala.inline
  def apply(target_user: String, username: String): UsersCheckFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(target_user = target_user.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCheckFollowingForUserEndpoint]
  }
}

