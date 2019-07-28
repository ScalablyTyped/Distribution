package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase extends js.Object {
  var ref: String
  var repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBaseRepo
  var sha: String
}

object ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase {
  @scala.inline
  def apply(ref: String, repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBaseRepo, sha: String): ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase]
  }
}

