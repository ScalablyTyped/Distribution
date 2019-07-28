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
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItemHead]
  }
}

