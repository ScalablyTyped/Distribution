package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDismissReviewParamsDeprecatedNumber extends js.Object {
  /**
    * The message for the pull request review dismissal
    */
  var message: String
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
  var repo: String
  var review_id: Double
}

object PullsDismissReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(message: String, number: Double, owner: String, repo: String, review_id: Double): PullsDismissReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsDismissReviewParamsDeprecatedNumber]
  }
}

