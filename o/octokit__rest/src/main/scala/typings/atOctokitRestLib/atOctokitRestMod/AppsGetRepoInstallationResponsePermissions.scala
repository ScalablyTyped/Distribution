package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetRepoInstallationResponsePermissions extends js.Object {
  var checks: java.lang.String
  var contents: java.lang.String
  var metadata: java.lang.String
}

object AppsGetRepoInstallationResponsePermissions {
  @scala.inline
  def apply(checks: java.lang.String, contents: java.lang.String, metadata: java.lang.String): AppsGetRepoInstallationResponsePermissions = {
    val __obj = js.Dynamic.literal(checks = checks, contents = contents, metadata = metadata)
  
    __obj.asInstanceOf[AppsGetRepoInstallationResponsePermissions]
  }
}

