package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDeletePendingReviewParams extends js.Object {
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsDeletePendingReviewParams {
  @scala.inline
  def apply(number: scala.Double, owner: java.lang.String, repo: java.lang.String, review_id: scala.Double): PullsDeletePendingReviewParams = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsDeletePendingReviewParams]
  }
}

