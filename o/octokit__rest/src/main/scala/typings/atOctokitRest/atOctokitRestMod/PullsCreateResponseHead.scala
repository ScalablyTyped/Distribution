package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponseHead extends js.Object {
  var label: String
  var ref: String
  var repo: PullsCreateResponseHeadRepo
  var sha: String
  var user: PullsCreateResponseHeadUser
}

object PullsCreateResponseHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsCreateResponseHeadRepo,
    sha: String,
    user: PullsCreateResponseHeadUser
  ): PullsCreateResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateResponseHead]
  }
}

