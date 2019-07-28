package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetResponseHead extends js.Object {
  var label: String
  var ref: String
  var repo: PullsGetResponseHeadRepo
  var sha: String
  var user: PullsGetResponseHeadUser
}

object PullsGetResponseHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsGetResponseHeadRepo,
    sha: String,
    user: PullsGetResponseHeadUser
  ): PullsGetResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsGetResponseHead]
  }
}

