package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksUpdateResponsePullRequestsItemHead]
  }
}

