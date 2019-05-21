package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetReviewEndpoint extends js.Object {
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  var review_id: scala.Double
}

object PullsGetReviewEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    review_id: scala.Double,
    number: scala.Int | scala.Double = null
  ): PullsGetReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo, review_id = review_id)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetReviewEndpoint]
  }
}

