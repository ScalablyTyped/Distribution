package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCheckBlockedEndpoint extends js.Object {
  var username: String
}

object UsersCheckBlockedEndpoint {
  @scala.inline
  def apply(username: String): UsersCheckBlockedEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCheckBlockedEndpoint]
  }
}

