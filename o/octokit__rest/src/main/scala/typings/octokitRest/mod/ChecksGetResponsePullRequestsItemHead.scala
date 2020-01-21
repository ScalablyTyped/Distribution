package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItemHead]
  }
}

