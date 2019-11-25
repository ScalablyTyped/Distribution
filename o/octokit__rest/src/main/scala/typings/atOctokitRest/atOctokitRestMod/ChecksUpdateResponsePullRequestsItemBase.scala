package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponsePullRequestsItemBase extends js.Object {
  var ref: String
  var repo: ChecksUpdateResponsePullRequestsItemBaseRepo
  var sha: String
}

object ChecksUpdateResponsePullRequestsItemBase {
  @scala.inline
  def apply(ref: String, repo: ChecksUpdateResponsePullRequestsItemBaseRepo, sha: String): ChecksUpdateResponsePullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksUpdateResponsePullRequestsItemBase]
  }
}

