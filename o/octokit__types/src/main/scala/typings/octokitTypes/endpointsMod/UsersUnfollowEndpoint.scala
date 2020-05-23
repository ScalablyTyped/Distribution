package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersUnfollowEndpoint extends js.Object {
  var username: String
}

object UsersUnfollowEndpoint {
  @scala.inline
  def apply(username: String): UsersUnfollowEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersUnfollowEndpoint]
  }
}

