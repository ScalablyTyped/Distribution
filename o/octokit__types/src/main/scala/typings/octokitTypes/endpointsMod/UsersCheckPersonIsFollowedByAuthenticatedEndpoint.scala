package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCheckPersonIsFollowedByAuthenticatedEndpoint extends js.Object {
  var username: String
}

object UsersCheckPersonIsFollowedByAuthenticatedEndpoint {
  @scala.inline
  def apply(username: String): UsersCheckPersonIsFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCheckPersonIsFollowedByAuthenticatedEndpoint]
  }
}

