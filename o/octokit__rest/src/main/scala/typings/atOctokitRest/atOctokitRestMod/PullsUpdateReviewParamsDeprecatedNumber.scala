package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(body = body, number = number, owner = owner, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsUpdateReviewParamsDeprecatedNumber]
  }
}

