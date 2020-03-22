package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseHead]
  }
}

