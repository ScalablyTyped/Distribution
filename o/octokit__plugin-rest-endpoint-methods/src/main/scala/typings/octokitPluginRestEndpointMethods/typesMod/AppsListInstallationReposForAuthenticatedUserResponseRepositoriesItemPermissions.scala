package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItemPermissions extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItemPermissions {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItemPermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItemPermissions]
  }
}

