package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.APPROVE
import typings.atOctokitRest.atOctokitRestStrings.COMMENT
import typings.atOctokitRest.atOctokitRestStrings.REQUEST_CHANGES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewParams extends js.Object {
  /**
    * **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * Use the following table to specify the location, destination, and contents of the draft review comment.
    */
  var comments: js.UndefOr[js.Array[PullsCreateReviewParamsComments]] = js.undefined
  /**
    * The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value.
    */
  var commit_id: js.UndefOr[String] = js.undefined
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://developer.github.com/v3/pulls/reviews/#submit-a-pull-request-review) when you are ready.
    */
  var event: js.UndefOr[APPROVE | REQUEST_CHANGES | COMMENT] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsCreateReviewParams {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    body: String = null,
    comments: js.Array[PullsCreateReviewParamsComments] = null,
    commit_id: String = null,
    event: APPROVE | REQUEST_CHANGES | COMMENT = null
  ): PullsCreateReviewParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (body != null) __obj.updateDynamic("body")(body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (commit_id != null) __obj.updateDynamic("commit_id")(commit_id)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewParams]
  }
}

