package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesResponseItemProtection extends js.Object {
  var enabled: Boolean
  var required_status_checks: ReposListBranchesResponseItemProtectionRequiredStatusChecks
}

object ReposListBranchesResponseItemProtection {
  @scala.inline
  def apply(
    enabled: Boolean,
    required_status_checks: ReposListBranchesResponseItemProtectionRequiredStatusChecks
  ): ReposListBranchesResponseItemProtection = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesResponseItemProtection]
  }
}

