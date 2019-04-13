package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesResponseItemProtection extends js.Object {
  var enabled: scala.Boolean
  var required_status_checks: ReposListBranchesResponseItemProtectionRequiredStatusChecks
}

object ReposListBranchesResponseItemProtection {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    required_status_checks: ReposListBranchesResponseItemProtectionRequiredStatusChecks
  ): ReposListBranchesResponseItemProtection = {
    val __obj = js.Dynamic.literal(enabled = enabled, required_status_checks = required_status_checks)
  
    __obj.asInstanceOf[ReposListBranchesResponseItemProtection]
  }
}

