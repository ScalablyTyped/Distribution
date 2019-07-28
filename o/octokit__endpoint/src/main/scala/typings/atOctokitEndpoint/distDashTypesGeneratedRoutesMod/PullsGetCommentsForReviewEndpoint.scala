package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetCommentsForReviewEndpoint extends js.Object {
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsGetCommentsForReviewEndpoint {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    review_id: Double,
    number: Int | Double = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): PullsGetCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetCommentsForReviewEndpoint]
  }
}

