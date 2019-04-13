package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase extends js.Object {
  var ref: java.lang.String
  var repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBaseRepo
  var sha: java.lang.String
}

object ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase {
  @scala.inline
  def apply(
    ref: java.lang.String,
    repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBaseRepo,
    sha: java.lang.String
  ): ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase]
  }
}

