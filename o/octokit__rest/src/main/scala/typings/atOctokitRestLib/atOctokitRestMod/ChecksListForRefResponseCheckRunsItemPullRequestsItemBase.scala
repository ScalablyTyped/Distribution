package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseCheckRunsItemPullRequestsItemBase extends js.Object {
  var ref: java.lang.String
  var repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemBaseRepo
  var sha: java.lang.String
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItemBase {
  @scala.inline
  def apply(
    ref: java.lang.String,
    repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemBaseRepo,
    sha: java.lang.String
  ): ChecksListForRefResponseCheckRunsItemPullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItemBase]
  }
}

