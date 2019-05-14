package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequest_Options extends js.Object {
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  var reviewers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var team_reviewers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PullsCreateReviewRequest_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null,
    reviewers: js.Array[java.lang.String] = null,
    team_reviewers: js.Array[java.lang.String] = null
  ): PullsCreateReviewRequest_Options = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers)
    if (team_reviewers != null) __obj.updateDynamic("team_reviewers")(team_reviewers)
    __obj.asInstanceOf[PullsCreateReviewRequest_Options]
  }
}

