package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesResponseItem extends js.Object {
  var commit: ReposListBranchesResponseItemCommit
  var name: java.lang.String
  var `protected`: scala.Boolean
  var protection: ReposListBranchesResponseItemProtection
  var protection_url: java.lang.String
}

object ReposListBranchesResponseItem {
  @scala.inline
  def apply(
    commit: ReposListBranchesResponseItemCommit,
    name: java.lang.String,
    `protected`: scala.Boolean,
    protection: ReposListBranchesResponseItemProtection,
    protection_url: java.lang.String
  ): ReposListBranchesResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit, name = name, protection = protection, protection_url = protection_url)
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[ReposListBranchesResponseItem]
  }
}

