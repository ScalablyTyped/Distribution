package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateReviewParamsDeprecatedNumber extends js.Object {
  /**
    * The body text of the pull request review.
    */
  var body: String
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
  var repo: String
  var review_id: Double
}

object PullsUpdateReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(body: String, number: Double, owner: String, repo: String, review_id: Double): PullsUpdateReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsUpdateReviewParamsDeprecatedNumber]
  }
}

