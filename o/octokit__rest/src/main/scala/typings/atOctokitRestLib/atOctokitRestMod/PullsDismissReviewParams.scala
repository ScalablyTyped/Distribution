package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDismissReviewParams extends js.Object {
  /**
    * The message for the pull request review dismissal
    */
  var message: java.lang.String
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsDismissReviewParams {
  @scala.inline
  def apply(
    message: java.lang.String,
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    review_id: scala.Double
  ): PullsDismissReviewParams = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsDismissReviewParams]
  }
}

