package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListWatchedReposForAuthenticatedUserResponseItemPermissions extends js.Object {
  var admin: scala.Boolean
  var pull: scala.Boolean
  var push: scala.Boolean
}

object ActivityListWatchedReposForAuthenticatedUserResponseItemPermissions {
  @scala.inline
  def apply(admin: scala.Boolean, pull: scala.Boolean, push: scala.Boolean): ActivityListWatchedReposForAuthenticatedUserResponseItemPermissions = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[ActivityListWatchedReposForAuthenticatedUserResponseItemPermissions]
  }
}

