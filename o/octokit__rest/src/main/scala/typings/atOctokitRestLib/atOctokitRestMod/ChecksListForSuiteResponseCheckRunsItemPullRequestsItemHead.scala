package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead extends js.Object {
  var ref: java.lang.String
  var repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHeadRepo
  var sha: java.lang.String
}

object ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead {
  @scala.inline
  def apply(
    ref: java.lang.String,
    repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHeadRepo,
    sha: java.lang.String
  ): ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead]
  }
}

