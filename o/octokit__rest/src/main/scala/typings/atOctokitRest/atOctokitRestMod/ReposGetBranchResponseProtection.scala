package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseProtection extends js.Object {
  var enabled: Boolean
  var required_status_checks: ReposGetBranchResponseProtectionRequiredStatusChecks
}

object ReposGetBranchResponseProtection {
  @scala.inline
  def apply(enabled: Boolean, required_status_checks: ReposGetBranchResponseProtectionRequiredStatusChecks): ReposGetBranchResponseProtection = {
    val __obj = js.Dynamic.literal(enabled = enabled, required_status_checks = required_status_checks)
  
    __obj.asInstanceOf[ReposGetBranchResponseProtection]
  }
}

