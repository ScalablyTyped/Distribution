package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsDismissReviewEndpoint extends js.Object {
  /**
    * The message for the pull request review dismissal
    */
  var message: String = js.native
  var owner: String = js.native
  var pull_number: Double = js.native
  var repo: String = js.native
  var review_id: Double = js.native
}

object PullsDismissReviewEndpoint {
  @scala.inline
  def apply(message: String, owner: String, pull_number: Double, repo: String, review_id: Double): PullsDismissReviewEndpoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDismissReviewEndpoint]
  }
  @scala.inline
  implicit class PullsDismissReviewEndpointOps[Self <: PullsDismissReviewEndpoint] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull_number(value: Double): Self = this.set("pull_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setReview_id(value: Double): Self = this.set("review_id", value.asInstanceOf[js.Any])
  }
  
}

