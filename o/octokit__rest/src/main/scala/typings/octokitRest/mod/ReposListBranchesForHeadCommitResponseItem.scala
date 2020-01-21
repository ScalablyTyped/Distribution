package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesForHeadCommitResponseItem extends js.Object {
  var commit: ReposListBranchesForHeadCommitResponseItemCommit
  var name: String
  var `protected`: String
}

object ReposListBranchesForHeadCommitResponseItem {
  @scala.inline
  def apply(commit: ReposListBranchesForHeadCommitResponseItemCommit, name: String, `protected`: String): ReposListBranchesForHeadCommitResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesForHeadCommitResponseItem]
  }
}

