package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsFindUserInstallationResponsePermissions extends js.Object {
  var checks: String
  var contents: String
  var metadata: String
}

object AppsFindUserInstallationResponsePermissions {
  @scala.inline
  def apply(checks: String, contents: String, metadata: String): AppsFindUserInstallationResponsePermissions = {
    val __obj = js.Dynamic.literal(checks = checks, contents = contents, metadata = metadata)
  
    __obj.asInstanceOf[AppsFindUserInstallationResponsePermissions]
  }
}

