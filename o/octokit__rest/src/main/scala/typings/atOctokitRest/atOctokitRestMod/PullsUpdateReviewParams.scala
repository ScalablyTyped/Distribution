package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateReviewParams extends js.Object {
  /**
    * The body text of the pull request review.
    */
  var body: String
  var owner: String
  var pull_number: Double
  var repo: String
  var review_id: Double
}

object PullsUpdateReviewParams {
  @scala.inline
  def apply(body: String, owner: String, pull_number: Double, repo: String, review_id: Double): PullsUpdateReviewParams = {
    val __obj = js.Dynamic.literal(body = body, owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
  
    __obj.asInstanceOf[PullsUpdateReviewParams]
  }
}

