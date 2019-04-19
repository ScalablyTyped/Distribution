package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetUserInstallationResponsePermissions extends js.Object {
  var checks: java.lang.String
  var contents: java.lang.String
  var metadata: java.lang.String
}

object AppsGetUserInstallationResponsePermissions {
  @scala.inline
  def apply(checks: java.lang.String, contents: java.lang.String, metadata: java.lang.String): AppsGetUserInstallationResponsePermissions = {
    val __obj = js.Dynamic.literal(checks = checks, contents = contents, metadata = metadata)
  
    __obj.asInstanceOf[AppsGetUserInstallationResponsePermissions]
  }
}

