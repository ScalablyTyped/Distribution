package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewParamsDeprecatedNumber extends js.Object {
  /**
    * **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use the following table to specify the location, destination, and contents of the draft review comment.
    */
  var comments: js.UndefOr[js.Array[PullsCreateReviewParamsComments]] = js.undefined
  /**
    * The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value.
    */
  var commit_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://developer.github.com/v3/pulls/reviews/#submit-a-pull-request-review) when you are ready.
    */
  var event: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.APPROVE | atOctokitRestLib.atOctokitRestLibStrings.REQUEST_CHANGES | atOctokitRestLib.atOctokitRestLibStrings.COMMENT
  ] = js.undefined
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object PullsCreateReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    body: java.lang.String = null,
    comments: js.Array[PullsCreateReviewParamsComments] = null,
    commit_id: java.lang.String = null,
    event: atOctokitRestLib.atOctokitRestLibStrings.APPROVE | atOctokitRestLib.atOctokitRestLibStrings.REQUEST_CHANGES | atOctokitRestLib.atOctokitRestLibStrings.COMMENT = null
  ): PullsCreateReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
    if (body != null) __obj.updateDynamic("body")(body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (commit_id != null) __obj.updateDynamic("commit_id")(commit_id)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewParamsDeprecatedNumber]
  }
}

