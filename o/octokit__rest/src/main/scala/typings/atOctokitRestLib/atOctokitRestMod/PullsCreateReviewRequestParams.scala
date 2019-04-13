package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestParams extends js.Object {
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * An array of user `login`s that will be requested.
    */
  var reviewers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An array of team `slug`s that will be requested.
    */
  var team_reviewers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PullsCreateReviewRequestParams {
  @scala.inline
  def apply(
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    reviewers: js.Array[java.lang.String] = null,
    team_reviewers: js.Array[java.lang.String] = null
  ): PullsCreateReviewRequestParams = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers)
    if (team_reviewers != null) __obj.updateDynamic("team_reviewers")(team_reviewers)
    __obj.asInstanceOf[PullsCreateReviewRequestParams]
  }
}

