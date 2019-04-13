package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponsePullRequestsItemBase extends js.Object {
  var ref: java.lang.String
  var repo: ChecksCreateResponsePullRequestsItemBaseRepo
  var sha: java.lang.String
}

object ChecksCreateResponsePullRequestsItemBase {
  @scala.inline
  def apply(ref: java.lang.String, repo: ChecksCreateResponsePullRequestsItemBaseRepo, sha: java.lang.String): ChecksCreateResponsePullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ChecksCreateResponsePullRequestsItemBase]
  }
}

