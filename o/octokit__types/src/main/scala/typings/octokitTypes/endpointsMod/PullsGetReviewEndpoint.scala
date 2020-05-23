package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetReviewEndpoint extends js.Object {
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsGetReviewEndpoint {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String, review_id: Double): PullsGetReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetReviewEndpoint]
  }
}

