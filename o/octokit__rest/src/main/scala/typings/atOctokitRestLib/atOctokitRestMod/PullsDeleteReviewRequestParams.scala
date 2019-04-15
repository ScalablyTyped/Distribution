package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDeleteReviewRequestParams extends js.Object {
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  /**
    * An array of user `login`s that will be removed.
    */
  var reviewers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An array of team `slug`s that will be removed.
    */
  var team_reviewers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PullsDeleteReviewRequestParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    reviewers: js.Array[java.lang.String] = null,
    team_reviewers: js.Array[java.lang.String] = null
  ): PullsDeleteReviewRequestParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers)
    if (team_reviewers != null) __obj.updateDynamic("team_reviewers")(team_reviewers)
    __obj.asInstanceOf[PullsDeleteReviewRequestParams]
  }
}

