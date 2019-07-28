package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetResponsePullRequestsItemBase extends js.Object {
  var ref: String
  var repo: ChecksGetResponsePullRequestsItemBaseRepo
  var sha: String
}

object ChecksGetResponsePullRequestsItemBase {
  @scala.inline
  def apply(ref: String, repo: ChecksGetResponsePullRequestsItemBaseRepo, sha: String): ChecksGetResponsePullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItemBase]
  }
}

