package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDeleteReviewRequestParams extends js.Object {
  var owner: String
  var pull_number: Double
  var repo: String
  /**
    * An array of user `login`s that will be removed.
    */
  var reviewers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An array of team `slug`s that will be removed.
    */
  var team_reviewers: js.UndefOr[js.Array[String]] = js.undefined
}

object PullsDeleteReviewRequestParams {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    reviewers: js.Array[String] = null,
    team_reviewers: js.Array[String] = null
  ): PullsDeleteReviewRequestParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers)
    if (team_reviewers != null) __obj.updateDynamic("team_reviewers")(team_reviewers)
    __obj.asInstanceOf[PullsDeleteReviewRequestParams]
  }
}

