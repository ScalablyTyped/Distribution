package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseCheckRunsItemPullRequestsItemBase extends js.Object {
  var ref: String
  var repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemBaseRepo
  var sha: String
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItemBase {
  @scala.inline
  def apply(ref: String, repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemBaseRepo, sha: String): ChecksListForRefResponseCheckRunsItemPullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItemBase]
  }
}

