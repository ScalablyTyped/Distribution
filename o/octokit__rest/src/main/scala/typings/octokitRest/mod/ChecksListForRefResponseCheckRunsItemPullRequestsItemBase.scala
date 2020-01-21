package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItemBase]
  }
}

