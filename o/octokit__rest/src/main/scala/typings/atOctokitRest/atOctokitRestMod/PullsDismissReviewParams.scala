package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(message = message, owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsDismissReviewParams]
  }
}

