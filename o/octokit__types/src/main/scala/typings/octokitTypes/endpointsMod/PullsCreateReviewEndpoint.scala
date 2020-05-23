package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.APPROVE
import typings.octokitTypes.octokitTypesStrings.COMMENT
import typings.octokitTypes.octokitTypesStrings.REQUEST_CHANGES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewEndpoint extends js.Object {
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

object PullsCreateReviewEndpoint {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    body: String = null,
    comments: js.Array[PullsCreateReviewParamsComments] = null,
    commit_id: String = null,
    event: APPROVE | REQUEST_CHANGES | COMMENT = null
  ): PullsCreateReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (commit_id != null) __obj.updateDynamic("commit_id")(commit_id.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewEndpoint]
  }
}

