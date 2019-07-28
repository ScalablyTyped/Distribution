package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsSubmitReviewEndpoint extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var event: String
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsSubmitReviewEndpoint {
  @scala.inline
  def apply(
    event: String,
    owner: String,
    pull_number: Double,
    repo: String,
    review_id: Double,
    body: String = null,
    number: Int | Double = null
  ): PullsSubmitReviewEndpoint = {
    val __obj = js.Dynamic.literal(event = event, owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
    if (body != null) __obj.updateDynamic("body")(body)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsSubmitReviewEndpoint]
  }
}

