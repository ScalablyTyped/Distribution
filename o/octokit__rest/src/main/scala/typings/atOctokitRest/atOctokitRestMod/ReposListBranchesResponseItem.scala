package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(commit = commit, name = name, protection = protection, protection_url = protection_url)
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[ReposListBranchesResponseItem]
  }
}

