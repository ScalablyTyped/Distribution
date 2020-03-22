package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsUpdateReviewParams]
  }
}

