package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetReviewParams extends js.Object {
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsGetReviewParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    review_id: scala.Double
  ): PullsGetReviewParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsGetReviewParams]
  }
}

