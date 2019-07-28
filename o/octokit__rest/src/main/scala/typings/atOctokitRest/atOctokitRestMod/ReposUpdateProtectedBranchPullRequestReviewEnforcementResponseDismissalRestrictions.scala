package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions extends js.Object {
  var teams: js.Array[
    ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictionsTeamsItem
  ]
  var teams_url: String
  var url: String
  var users: js.Array[
    ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictionsUsersItem
  ]
  var users_url: String
}

object ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[
      ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictionsTeamsItem
    ],
    teams_url: String,
    url: String,
    users: js.Array[
      ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictionsUsersItem
    ],
    users_url: String
  ): ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions]
  }
}

