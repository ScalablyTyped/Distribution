package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions]
  }
}

