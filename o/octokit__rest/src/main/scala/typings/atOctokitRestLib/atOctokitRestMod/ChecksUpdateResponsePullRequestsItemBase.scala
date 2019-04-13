package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponsePullRequestsItemBase extends js.Object {
  var ref: java.lang.String
  var repo: ChecksUpdateResponsePullRequestsItemBaseRepo
  var sha: java.lang.String
}

object ChecksUpdateResponsePullRequestsItemBase {
  @scala.inline
  def apply(ref: java.lang.String, repo: ChecksUpdateResponsePullRequestsItemBaseRepo, sha: java.lang.String): ChecksUpdateResponsePullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksUpdateResponsePullRequestsItemBase]
  }
}

