package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCheckFollowingForUserParams extends js.Object {
  var target_user: java.lang.String
  var username: java.lang.String
}

object UsersCheckFollowingForUserParams {
  @scala.inline
  def apply(target_user: java.lang.String, username: java.lang.String): UsersCheckFollowingForUserParams = {
    val __obj = js.Dynamic.literal(target_user = target_user, username = username)
  
    __obj.asInstanceOf[UsersCheckFollowingForUserParams]
  }
}

