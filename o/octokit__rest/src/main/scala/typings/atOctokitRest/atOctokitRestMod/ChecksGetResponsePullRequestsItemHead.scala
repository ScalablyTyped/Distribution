package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetResponsePullRequestsItemHead extends js.Object {
  var ref: String
  var repo: ChecksGetResponsePullRequestsItemHeadRepo
  var sha: String
}

object ChecksGetResponsePullRequestsItemHead {
  @scala.inline
  def apply(ref: String, repo: ChecksGetResponsePullRequestsItemHeadRepo, sha: String): ChecksGetResponsePullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItemHead]
  }
}

