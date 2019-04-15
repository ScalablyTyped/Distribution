package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesForHeadCommitResponseItem extends js.Object {
  var commit: ReposListBranchesForHeadCommitResponseItemCommit
  var name: java.lang.String
  var `protected`: java.lang.String
}

object ReposListBranchesForHeadCommitResponseItem {
  @scala.inline
  def apply(
    commit: ReposListBranchesForHeadCommitResponseItemCommit,
    name: java.lang.String,
    `protected`: java.lang.String
  ): ReposListBranchesForHeadCommitResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit, name = name)
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[ReposListBranchesForHeadCommitResponseItem]
  }
}

