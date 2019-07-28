package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDismissReviewEndpoint extends js.Object {
  var message: String
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsDismissReviewEndpoint {
  @scala.inline
  def apply(
    message: String,
    owner: String,
    pull_number: Double,
    repo: String,
    review_id: Double,
    number: Int | Double = null
  ): PullsDismissReviewEndpoint = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDismissReviewEndpoint]
  }
}

