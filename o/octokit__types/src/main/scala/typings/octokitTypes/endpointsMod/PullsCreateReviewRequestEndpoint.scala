package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestEndpoint extends js.Object {
  var owner: String
  var pull_number: Double
  var repo: String
  /**
    * An array of user `login`s that will be requested.
    */
  var reviewers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An array of team `slug`s that will be requested.
    */
  var team_reviewers: js.UndefOr[js.Array[String]] = js.undefined
}

object PullsCreateReviewRequestEndpoint {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    reviewers: js.Array[String] = null,
    team_reviewers: js.Array[String] = null
  ): PullsCreateReviewRequestEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers.asInstanceOf[js.Any])
    if (team_reviewers != null) __obj.updateDynamic("team_reviewers")(team_reviewers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewRequestEndpoint]
  }
}

