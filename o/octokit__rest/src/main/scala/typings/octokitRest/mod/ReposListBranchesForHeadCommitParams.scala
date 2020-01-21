package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesForHeadCommitParams extends js.Object {
  var commit_sha: String
  var owner: String
  var repo: String
}

object ReposListBranchesForHeadCommitParams {
  @scala.inline
  def apply(commit_sha: String, owner: String, repo: String): ReposListBranchesForHeadCommitParams = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListBranchesForHeadCommitParams]
  }
}

