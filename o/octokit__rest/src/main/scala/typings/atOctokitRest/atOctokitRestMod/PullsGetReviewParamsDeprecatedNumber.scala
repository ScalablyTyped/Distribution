package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetReviewParamsDeprecatedNumber extends js.Object {
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
  var repo: String
  var review_id: Double
}

object PullsGetReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(number: Double, owner: String, repo: String, review_id: Double): PullsGetReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsGetReviewParamsDeprecatedNumber]
  }
}

