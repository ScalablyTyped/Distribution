package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseProtection extends js.Object {
  var enabled: scala.Boolean
  var required_status_checks: ReposGetBranchResponseProtectionRequiredStatusChecks
}

object ReposGetBranchResponseProtection {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    required_status_checks: ReposGetBranchResponseProtectionRequiredStatusChecks
  ): ReposGetBranchResponseProtection = {
    val __obj = js.Dynamic.literal(enabled = enabled, required_status_checks = required_status_checks)
  
    __obj.asInstanceOf[ReposGetBranchResponseProtection]
  }
}

