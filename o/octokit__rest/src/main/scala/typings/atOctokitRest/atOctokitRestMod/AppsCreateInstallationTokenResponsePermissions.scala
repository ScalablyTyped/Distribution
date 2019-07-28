package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateInstallationTokenResponsePermissions extends js.Object {
  var contents: String
  var issues: String
}

object AppsCreateInstallationTokenResponsePermissions {
  @scala.inline
  def apply(contents: String, issues: String): AppsCreateInstallationTokenResponsePermissions = {
    val __obj = js.Dynamic.literal(contents = contents, issues = issues)
  
    __obj.asInstanceOf[AppsCreateInstallationTokenResponsePermissions]
  }
}

