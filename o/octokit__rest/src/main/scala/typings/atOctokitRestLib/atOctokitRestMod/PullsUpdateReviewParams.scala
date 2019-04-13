package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateReviewParams extends js.Object {
  /**
    * The body text of the pull request review.
    */
  var body: java.lang.String
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsUpdateReviewParams {
  @scala.inline
  def apply(
    body: java.lang.String,
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    review_id: scala.Double
  ): PullsUpdateReviewParams = {
    val __obj = js.Dynamic.literal(body = body, number = number, owner = owner, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsUpdateReviewParams]
  }
}

