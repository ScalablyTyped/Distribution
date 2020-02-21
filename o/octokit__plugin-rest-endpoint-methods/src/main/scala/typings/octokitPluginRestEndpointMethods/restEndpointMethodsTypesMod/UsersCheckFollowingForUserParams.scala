package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCheckFollowingForUserParams extends js.Object {
  var target_user: String
  var username: String
}

object UsersCheckFollowingForUserParams {
  @scala.inline
  def apply(target_user: String, username: String): UsersCheckFollowingForUserParams = {
    val __obj = js.Dynamic.literal(target_user = target_user.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersCheckFollowingForUserParams]
  }
}

