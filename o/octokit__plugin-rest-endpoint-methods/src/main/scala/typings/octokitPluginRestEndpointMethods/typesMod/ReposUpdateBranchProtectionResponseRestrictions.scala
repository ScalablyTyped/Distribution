package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponseRestrictions extends js.Object {
  var apps: js.Array[ReposUpdateBranchProtectionResponseRestrictionsAppsItem]
  var apps_url: String
  var teams: js.Array[ReposUpdateBranchProtectionResponseRestrictionsTeamsItem]
  var teams_url: String
  var url: String
  var users: js.Array[ReposUpdateBranchProtectionResponseRestrictionsUsersItem]
  var users_url: String
}

object ReposUpdateBranchProtectionResponseRestrictions {
  @scala.inline
  def apply(
    apps: js.Array[ReposUpdateBranchProtectionResponseRestrictionsAppsItem],
    apps_url: String,
    teams: js.Array[ReposUpdateBranchProtectionResponseRestrictionsTeamsItem],
    teams_url: String,
    url: String,
    users: js.Array[ReposUpdateBranchProtectionResponseRestrictionsUsersItem],
    users_url: String
  ): ReposUpdateBranchProtectionResponseRestrictions = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], apps_url = apps_url.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseRestrictions]
  }
}

