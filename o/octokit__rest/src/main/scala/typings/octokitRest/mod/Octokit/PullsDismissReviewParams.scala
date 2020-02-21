package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDismissReviewParams extends js.Object {
  /**
    * The message for the pull request review dismissal
    */
  var message: String
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsDismissReviewParams {
  @scala.inline
  def apply(message: String, owner: String, pull_number: Double, repo: String, review_id: Double): PullsDismissReviewParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsDismissReviewParams]
  }
}

