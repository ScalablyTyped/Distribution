package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions extends js.Object {
  var teams: js.Array[
    ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
  ]
  var teams_url: String
  var url: String
  var users: js.Array[
    ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
  ]
  var users_url: String
}

object ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[
      ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
    ],
    teams_url: String,
    url: String,
    users: js.Array[
      ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
    ],
    users_url: String
  ): ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions]
  }
}

