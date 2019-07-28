package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDeletePendingReviewEndpoint extends js.Object {
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsDeletePendingReviewEndpoint {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String, review_id: Double, number: Int | Double = null): PullsDeletePendingReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDeletePendingReviewEndpoint]
  }
}

