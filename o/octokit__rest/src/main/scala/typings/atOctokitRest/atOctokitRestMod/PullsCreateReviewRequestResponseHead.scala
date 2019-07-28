package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestResponseHead extends js.Object {
  var label: String
  var ref: String
  var repo: PullsCreateReviewRequestResponseHeadRepo
  var sha: String
  var user: PullsCreateReviewRequestResponseHeadUser
}

object PullsCreateReviewRequestResponseHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsCreateReviewRequestResponseHeadRepo,
    sha: String,
    user: PullsCreateReviewRequestResponseHeadUser
  ): PullsCreateReviewRequestResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseHead]
  }
}

