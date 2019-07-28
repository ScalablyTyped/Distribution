package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetReviewParams extends js.Object {
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsGetReviewParams {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String, review_id: Double): PullsGetReviewParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsGetReviewParams]
  }
}

