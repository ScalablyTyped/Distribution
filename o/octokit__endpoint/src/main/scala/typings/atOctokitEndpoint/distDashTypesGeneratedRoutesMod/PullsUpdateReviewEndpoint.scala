package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateReviewEndpoint extends js.Object {
  var body: String
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsUpdateReviewEndpoint {
  @scala.inline
  def apply(
    body: String,
    owner: String,
    pull_number: Double,
    repo: String,
    review_id: Double,
    number: Int | Double = null
  ): PullsUpdateReviewEndpoint = {
    val __obj = js.Dynamic.literal(body = body, owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateReviewEndpoint]
  }
}

