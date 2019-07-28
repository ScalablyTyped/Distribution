package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions]
  }
}

