package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestEndpoint extends js.Object {
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
  var reviewers: js.UndefOr[js.Array[String]] = js.undefined
  var team_reviewers: js.UndefOr[js.Array[String]] = js.undefined
}

object PullsCreateReviewRequestEndpoint {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    number: Int | Double = null,
    reviewers: js.Array[String] = null,
    team_reviewers: js.Array[String] = null
  ): PullsCreateReviewRequestEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers)
    if (team_reviewers != null) __obj.updateDynamic("team_reviewers")(team_reviewers)
    __obj.asInstanceOf[PullsCreateReviewRequestEndpoint]
  }
}

