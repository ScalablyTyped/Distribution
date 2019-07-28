package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponseEnforceAdmins extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposUpdateBranchProtectionResponseEnforceAdmins {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposUpdateBranchProtectionResponseEnforceAdmins = {
    val __obj = js.Dynamic.literal(enabled = enabled, url = url)
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseEnforceAdmins]
  }
}

