package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseRestrictions extends js.Object {
  var apps: js.Array[ReposGetBranchProtectionResponseRestrictionsAppsItem]
  var apps_url: String
  var teams: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem]
  var teams_url: String
  var url: String
  var users: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem]
  var users_url: String
}

object ReposGetBranchProtectionResponseRestrictions {
  @scala.inline
  def apply(
    apps: js.Array[ReposGetBranchProtectionResponseRestrictionsAppsItem],
    apps_url: String,
    teams: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem],
    teams_url: String,
    url: String,
    users: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem],
    users_url: String
  ): ReposGetBranchProtectionResponseRestrictions = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], apps_url = apps_url.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRestrictions]
  }
}

