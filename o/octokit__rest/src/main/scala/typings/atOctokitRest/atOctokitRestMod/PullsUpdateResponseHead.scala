package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateResponseHead extends js.Object {
  var label: String
  var ref: String
  var repo: PullsUpdateResponseHeadRepo
  var sha: String
  var user: PullsUpdateResponseHeadUser
}

object PullsUpdateResponseHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsUpdateResponseHeadRepo,
    sha: String,
    user: PullsUpdateResponseHeadUser
  ): PullsUpdateResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsUpdateResponseHead]
  }
}

