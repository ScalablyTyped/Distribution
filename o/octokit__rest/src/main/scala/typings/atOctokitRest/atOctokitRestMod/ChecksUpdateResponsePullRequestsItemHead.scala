package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponsePullRequestsItemHead extends js.Object {
  var ref: String
  var repo: ChecksUpdateResponsePullRequestsItemHeadRepo
  var sha: String
}

object ChecksUpdateResponsePullRequestsItemHead {
  @scala.inline
  def apply(ref: String, repo: ChecksUpdateResponsePullRequestsItemHeadRepo, sha: String): ChecksUpdateResponsePullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksUpdateResponsePullRequestsItemHead]
  }
}

