package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponsePullRequestsItemHead extends js.Object {
  var ref: String
  var repo: ChecksCreateResponsePullRequestsItemHeadRepo
  var sha: String
}

object ChecksCreateResponsePullRequestsItemHead {
  @scala.inline
  def apply(ref: String, repo: ChecksCreateResponsePullRequestsItemHeadRepo, sha: String): ChecksCreateResponsePullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksCreateResponsePullRequestsItemHead]
  }
}

