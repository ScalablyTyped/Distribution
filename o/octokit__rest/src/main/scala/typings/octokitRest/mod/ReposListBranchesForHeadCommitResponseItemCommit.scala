package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesForHeadCommitResponseItemCommit extends js.Object {
  var sha: String
  var url: String
}

object ReposListBranchesForHeadCommitResponseItemCommit {
  @scala.inline
  def apply(sha: String, url: String): ReposListBranchesForHeadCommitResponseItemCommit = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListBranchesForHeadCommitResponseItemCommit]
  }
}

