package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseCheckRunsItemPullRequestsItemHead extends js.Object {
  var ref: java.lang.String
  var repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo
  var sha: java.lang.String
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItemHead {
  @scala.inline
  def apply(
    ref: java.lang.String,
    repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo,
    sha: java.lang.String
  ): ChecksListForRefResponseCheckRunsItemPullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItemHead]
  }
}

