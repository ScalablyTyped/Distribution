package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetResponseHead extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsGetResponseHeadRepo
  var sha: java.lang.String
  var user: PullsGetResponseHeadUser
}

object PullsGetResponseHead {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsGetResponseHeadRepo,
    sha: java.lang.String,
    user: PullsGetResponseHeadUser
  ): PullsGetResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsGetResponseHead]
  }
}

