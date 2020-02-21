package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDeleteReviewRequestParamsDeprecatedNumber extends js.Object {
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
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

object PullsDeleteReviewRequestParamsDeprecatedNumber {
  @scala.inline
  def apply(
    number: Double,
    owner: String,
    repo: String,
    reviewers: js.Array[String] = null,
    team_reviewers: js.Array[String] = null
  ): PullsDeleteReviewRequestParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers.asInstanceOf[js.Any])
    if (team_reviewers != null) __obj.updateDynamic("team_reviewers")(team_reviewers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDeleteReviewRequestParamsDeprecatedNumber]
  }
}

