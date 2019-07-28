package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.APPROVE
import typings.atOctokitRest.atOctokitRestStrings.COMMENT
import typings.atOctokitRest.atOctokitRestStrings.REQUEST_CHANGES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsSubmitReviewParamsDeprecatedNumber extends js.Object {
  /**
    * The body text of the pull request review
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
    */
  var event: APPROVE | REQUEST_CHANGES | COMMENT
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
  var repo: String
  var review_id: Double
}

object PullsSubmitReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(
    event: APPROVE | REQUEST_CHANGES | COMMENT,
    number: Double,
    owner: String,
    repo: String,
    review_id: Double,
    body: String = null
  ): PullsSubmitReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], number = number, owner = owner, repo = repo, review_id = review_id)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[PullsSubmitReviewParamsDeprecatedNumber]
  }
}

