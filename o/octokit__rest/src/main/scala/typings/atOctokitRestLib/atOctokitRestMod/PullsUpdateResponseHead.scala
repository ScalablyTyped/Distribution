package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateResponseHead extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsUpdateResponseHeadRepo
  var sha: java.lang.String
  var user: PullsUpdateResponseHeadUser
}

object PullsUpdateResponseHead {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsUpdateResponseHeadRepo,
    sha: java.lang.String,
    user: PullsUpdateResponseHeadUser
  ): PullsUpdateResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsUpdateResponseHead]
  }
}

