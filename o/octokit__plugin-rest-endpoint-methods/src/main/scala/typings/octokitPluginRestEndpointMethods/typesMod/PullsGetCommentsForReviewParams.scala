package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetCommentsForReviewParams extends js.Object {
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsGetCommentsForReviewParams {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    review_id: Double,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): PullsGetCommentsForReviewParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetCommentsForReviewParams]
  }
}

