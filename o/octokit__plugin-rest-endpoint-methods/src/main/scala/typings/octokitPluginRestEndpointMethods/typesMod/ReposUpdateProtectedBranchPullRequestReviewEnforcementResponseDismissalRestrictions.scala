package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions]
  }
}

