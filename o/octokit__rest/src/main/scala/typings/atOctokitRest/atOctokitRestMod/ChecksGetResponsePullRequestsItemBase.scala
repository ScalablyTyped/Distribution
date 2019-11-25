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
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItemBase]
  }
}

