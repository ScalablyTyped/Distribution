package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesResponseItem extends js.Object {
  var commit: ReposListBranchesResponseItemCommit
  var name: String
  var `protected`: Boolean
  var protection: ReposListBranchesResponseItemProtection
  var protection_url: String
}

object ReposListBranchesResponseItem {
  @scala.inline
  def apply(
    commit: ReposListBranchesResponseItemCommit,
    name: String,
    `protected`: Boolean,
    protection: ReposListBranchesResponseItemProtection,
    protection_url: String
  ): ReposListBranchesResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesResponseItem]
  }
}

