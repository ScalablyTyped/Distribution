package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponsePullRequestsItemBase extends js.Object {
  var ref: String
  var repo: ChecksCreateResponsePullRequestsItemBaseRepo
  var sha: String
}

object ChecksCreateResponsePullRequestsItemBase {
  @scala.inline
  def apply(ref: String, repo: ChecksCreateResponsePullRequestsItemBaseRepo, sha: String): ChecksCreateResponsePullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksCreateResponsePullRequestsItemBase]
  }
}

