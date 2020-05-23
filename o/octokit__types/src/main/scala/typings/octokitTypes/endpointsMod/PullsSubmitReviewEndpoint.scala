package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.APPROVE
import typings.octokitTypes.octokitTypesStrings.COMMENT
import typings.octokitTypes.octokitTypesStrings.REQUEST_CHANGES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsSubmitReviewEndpoint extends js.Object {
  /**
    * The body text of the pull request review
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
    */
  var event: APPROVE | REQUEST_CHANGES | COMMENT
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsSubmitReviewEndpoint {
  @scala.inline
  def apply(
    event: APPROVE | REQUEST_CHANGES | COMMENT,
    owner: String,
    pull_number: Double,
    repo: String,
    review_id: Double,
    body: String = null
  ): PullsSubmitReviewEndpoint = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsSubmitReviewEndpoint]
  }
}

