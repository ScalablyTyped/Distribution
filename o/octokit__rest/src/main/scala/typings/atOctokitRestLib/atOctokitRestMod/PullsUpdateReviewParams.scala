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
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsUpdateReviewParams {
  @scala.inline
  def apply(
    body: java.lang.String,
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    review_id: scala.Double
  ): PullsUpdateReviewParams = {
    val __obj = js.Dynamic.literal(body = body, owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsUpdateReviewParams]
  }
}

