package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions extends js.Object {
  var teams: js.Array[
    ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
  ]
  var teams_url: java.lang.String
  var url: java.lang.String
  var users: js.Array[
    ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
  ]
  var users_url: java.lang.String
}

object ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[
      ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
    ],
    teams_url: java.lang.String,
    url: java.lang.String,
    users: js.Array[
      ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
    ],
    users_url: java.lang.String
  ): ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions]
  }
}

