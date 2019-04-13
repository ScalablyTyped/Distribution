package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponsePullRequestsItemHead extends js.Object {
  var ref: java.lang.String
  var repo: ChecksCreateResponsePullRequestsItemHeadRepo
  var sha: java.lang.String
}

object ChecksCreateResponsePullRequestsItemHead {
  @scala.inline
  def apply(ref: java.lang.String, repo: ChecksCreateResponsePullRequestsItemHeadRepo, sha: java.lang.String): ChecksCreateResponsePullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksCreateResponsePullRequestsItemHead]
  }
}

