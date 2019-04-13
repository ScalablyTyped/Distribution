package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseEnforceAdmins extends js.Object {
  var enabled: scala.Boolean
  var url: java.lang.String
}

object ReposGetBranchProtectionResponseEnforceAdmins {
  @scala.inline
  def apply(enabled: scala.Boolean, url: java.lang.String): ReposGetBranchProtectionResponseEnforceAdmins = {
    val __obj = js.Dynamic.literal(enabled = enabled, url = url)
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponseEnforceAdmins]
  }
}

