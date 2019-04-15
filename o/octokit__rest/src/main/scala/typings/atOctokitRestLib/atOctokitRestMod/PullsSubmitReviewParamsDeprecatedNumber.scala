package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsSubmitReviewParamsDeprecatedNumber extends js.Object {
  /**
    * The body text of the pull request review
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
    */
  var event: atOctokitRestLib.atOctokitRestLibStrings.APPROVE | atOctokitRestLib.atOctokitRestLibStrings.REQUEST_CHANGES | atOctokitRestLib.atOctokitRestLibStrings.COMMENT
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsSubmitReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(
    event: atOctokitRestLib.atOctokitRestLibStrings.APPROVE | atOctokitRestLib.atOctokitRestLibStrings.REQUEST_CHANGES | atOctokitRestLib.atOctokitRestLibStrings.COMMENT,
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    review_id: scala.Double,
    body: java.lang.String = null
  ): PullsSubmitReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], number = number, owner = owner, repo = repo, review_id = review_id)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[PullsSubmitReviewParamsDeprecatedNumber]
  }
}

