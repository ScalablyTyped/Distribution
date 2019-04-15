package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDismissReviewParamsDeprecatedNumber extends js.Object {
  /**
    * The message for the pull request review dismissal
    */
  var message: java.lang.String
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsDismissReviewParamsDeprecatedNumber {
  @scala.inline
  def apply(
    message: java.lang.String,
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    review_id: scala.Double
  ): PullsDismissReviewParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(message = message, number = number, owner = owner, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsDismissReviewParamsDeprecatedNumber]
  }
}

