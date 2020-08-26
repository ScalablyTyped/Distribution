package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.APPROVE
import typings.octokitTypes.octokitTypesStrings.COMMENT
import typings.octokitTypes.octokitTypesStrings.REQUEST_CHANGES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateReviewEndpoint extends js.Object {
  /**
    * **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Use the following table to specify the location, destination, and contents of the draft review comment.
    */
  var comments: js.UndefOr[js.Array[PullsCreateReviewParamsComments]] = js.native
  /**
    * The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value.
    */
  var commit_id: js.UndefOr[String] = js.native
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://developer.github.com/v3/pulls/reviews/#submit-a-review-for-a-pull-request) when you are ready.
    */
  var event: js.UndefOr[APPROVE | REQUEST_CHANGES | COMMENT] = js.native
  var owner: String = js.native
  var pull_number: Double = js.native
  var repo: String = js.native
}

object PullsCreateReviewEndpoint {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsCreateReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewEndpoint]
  }
  @scala.inline
  implicit class PullsCreateReviewEndpointOps[Self <: PullsCreateReviewEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull_number(value: Double): Self = this.set("pull_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCommentsVarargs(value: PullsCreateReviewParamsComments*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[PullsCreateReviewParamsComments]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setCommit_id(value: String): Self = this.set("commit_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit_id: Self = this.set("commit_id", js.undefined)
    @scala.inline
    def setEvent(value: APPROVE | REQUEST_CHANGES | COMMENT): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}

