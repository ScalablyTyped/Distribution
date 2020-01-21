package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCheckFollowingParams extends js.Object {
  var username: String
}

object UsersCheckFollowingParams {
  @scala.inline
  def apply(username: String): UsersCheckFollowingParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersCheckFollowingParams]
  }
}

