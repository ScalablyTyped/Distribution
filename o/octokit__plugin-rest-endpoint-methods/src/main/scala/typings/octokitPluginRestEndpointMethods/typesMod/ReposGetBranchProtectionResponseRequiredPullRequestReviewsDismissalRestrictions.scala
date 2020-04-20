package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions extends js.Object {
  var teams: js.Array[
    ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
  ]
  var teams_url: String
  var url: String
  var users: js.Array[
    ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
  ]
  var users_url: String
}

object ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[
      ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
    ],
    teams_url: String,
    url: String,
    users: js.Array[
      ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
    ],
    users_url: String
  ): ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions]
  }
}

