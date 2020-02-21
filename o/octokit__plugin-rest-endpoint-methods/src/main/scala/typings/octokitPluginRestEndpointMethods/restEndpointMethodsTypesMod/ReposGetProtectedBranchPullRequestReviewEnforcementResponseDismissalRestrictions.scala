package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions extends js.Object {
  var teams: js.Array[
    ReposGetProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictionsTeamsItem
  ]
  var teams_url: String
  var url: String
  var users: js.Array[
    ReposGetProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictionsUsersItem
  ]
  var users_url: String
}

object ReposGetProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[
      ReposGetProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictionsTeamsItem
    ],
    teams_url: String,
    url: String,
    users: js.Array[
      ReposGetProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictionsUsersItem
    ],
    users_url: String
  ): ReposGetProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetProtectedBranchPullRequestReviewEnforcementResponseDismissalRestrictions]
  }
}

