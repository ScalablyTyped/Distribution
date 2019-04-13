package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestResponseHead extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsCreateReviewRequestResponseHeadRepo
  var sha: java.lang.String
  var user: PullsCreateReviewRequestResponseHeadUser
}

object PullsCreateReviewRequestResponseHead {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsCreateReviewRequestResponseHeadRepo,
    sha: java.lang.String,
    user: PullsCreateReviewRequestResponseHeadUser
  ): PullsCreateReviewRequestResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseHead]
  }
}

