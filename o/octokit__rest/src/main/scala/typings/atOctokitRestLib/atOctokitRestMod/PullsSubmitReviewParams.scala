package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsSubmitReviewParams extends js.Object {
  /**
    * The body text of the pull request review
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
    */
  var event: atOctokitRestLib.atOctokitRestLibStrings.APPROVE | atOctokitRestLib.atOctokitRestLibStrings.REQUEST_CHANGES | atOctokitRestLib.atOctokitRestLibStrings.COMMENT
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsSubmitReviewParams {
  @scala.inline
  def apply(
    event: atOctokitRestLib.atOctokitRestLibStrings.APPROVE | atOctokitRestLib.atOctokitRestLibStrings.REQUEST_CHANGES | atOctokitRestLib.atOctokitRestLibStrings.COMMENT,
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    review_id: scala.Double,
    body: java.lang.String = null
  ): PullsSubmitReviewParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[PullsSubmitReviewParams]
  }
}

