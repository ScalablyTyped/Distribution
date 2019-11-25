package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseCheckRunsItemPullRequestsItemHead extends js.Object {
  var ref: String
  var repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo
  var sha: String
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItemHead {
  @scala.inline
  def apply(ref: String, repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo, sha: String): ChecksListForRefResponseCheckRunsItemPullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItemHead]
  }
}

