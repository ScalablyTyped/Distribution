package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetResponsePullRequestsItemHead extends js.Object {
  var ref: java.lang.String
  var repo: ChecksGetResponsePullRequestsItemHeadRepo
  var sha: java.lang.String
}

object ChecksGetResponsePullRequestsItemHead {
  @scala.inline
  def apply(ref: java.lang.String, repo: ChecksGetResponsePullRequestsItemHeadRepo, sha: java.lang.String): ChecksGetResponsePullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItemHead]
  }
}

