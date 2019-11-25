package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead extends js.Object {
  var ref: String
  var repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHeadRepo
  var sha: String
}

object ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead {
  @scala.inline
  def apply(ref: String, repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHeadRepo, sha: String): ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead]
  }
}

