package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponseEnforceAdmins extends js.Object {
  var enabled: scala.Boolean
  var url: java.lang.String
}

object ReposUpdateBranchProtectionResponseEnforceAdmins {
  @scala.inline
  def apply(enabled: scala.Boolean, url: java.lang.String): ReposUpdateBranchProtectionResponseEnforceAdmins = {
    val __obj = js.Dynamic.literal(enabled = enabled, url = url)
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseEnforceAdmins]
  }
}

