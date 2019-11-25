package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsForAuthenticatedUserResponseInstallationsItemPermissions extends js.Object {
  var contents: String
  var issues: String
  var metadata: String
  var single_file: String
}

object AppsListInstallationsForAuthenticatedUserResponseInstallationsItemPermissions {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): AppsListInstallationsForAuthenticatedUserResponseInstallationsItemPermissions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponseInstallationsItemPermissions]
  }
}

