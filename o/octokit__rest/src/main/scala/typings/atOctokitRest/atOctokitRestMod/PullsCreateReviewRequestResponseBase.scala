package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestResponseBase extends js.Object {
  var label: String
  var ref: String
  var repo: PullsCreateReviewRequestResponseBaseRepo
  var sha: String
  var user: PullsCreateReviewRequestResponseBaseUser
}

object PullsCreateReviewRequestResponseBase {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsCreateReviewRequestResponseBaseRepo,
    sha: String,
    user: PullsCreateReviewRequestResponseBaseUser
  ): PullsCreateReviewRequestResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseBase]
  }
}

