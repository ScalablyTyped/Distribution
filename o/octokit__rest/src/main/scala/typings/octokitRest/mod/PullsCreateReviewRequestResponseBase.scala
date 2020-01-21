package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseBase]
  }
}

