package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestResponseBase extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsCreateReviewRequestResponseBaseRepo
  var sha: java.lang.String
  var user: PullsCreateReviewRequestResponseBaseUser
}

object PullsCreateReviewRequestResponseBase {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsCreateReviewRequestResponseBaseRepo,
    sha: java.lang.String,
    user: PullsCreateReviewRequestResponseBaseUser
  ): PullsCreateReviewRequestResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseBase]
  }
}

