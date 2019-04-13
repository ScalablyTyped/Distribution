package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetResponsePullRequestsItemBase extends js.Object {
  var ref: java.lang.String
  var repo: ChecksGetResponsePullRequestsItemBaseRepo
  var sha: java.lang.String
}

object ChecksGetResponsePullRequestsItemBase {
  @scala.inline
  def apply(ref: java.lang.String, repo: ChecksGetResponsePullRequestsItemBaseRepo, sha: java.lang.String): ChecksGetResponsePullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItemBase]
  }
}

