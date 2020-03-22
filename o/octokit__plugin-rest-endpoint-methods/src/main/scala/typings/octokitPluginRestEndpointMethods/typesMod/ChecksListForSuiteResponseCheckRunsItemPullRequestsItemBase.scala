package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase]
  }
}

