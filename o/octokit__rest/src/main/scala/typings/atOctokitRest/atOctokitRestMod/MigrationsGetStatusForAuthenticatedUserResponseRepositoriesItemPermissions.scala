package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetStatusForAuthenticatedUserResponseRepositoriesItemPermissions extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object MigrationsGetStatusForAuthenticatedUserResponseRepositoriesItemPermissions {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): MigrationsGetStatusForAuthenticatedUserResponseRepositoriesItemPermissions = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[MigrationsGetStatusForAuthenticatedUserResponseRepositoriesItemPermissions]
  }
}

