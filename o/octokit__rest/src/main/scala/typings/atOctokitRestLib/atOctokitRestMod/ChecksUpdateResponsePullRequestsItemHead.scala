package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponsePullRequestsItemHead extends js.Object {
  var ref: java.lang.String
  var repo: ChecksUpdateResponsePullRequestsItemHeadRepo
  var sha: java.lang.String
}

object ChecksUpdateResponsePullRequestsItemHead {
  @scala.inline
  def apply(ref: java.lang.String, repo: ChecksUpdateResponsePullRequestsItemHeadRepo, sha: java.lang.String): ChecksUpdateResponsePullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksUpdateResponsePullRequestsItemHead]
  }
}

