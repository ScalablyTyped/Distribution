package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksCreateResponsePullRequestsItemBase]
  }
}

