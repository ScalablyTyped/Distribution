package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchRestrictionsResponse extends js.Object {
  var apps: js.Array[ReposGetProtectedBranchRestrictionsResponseAppsItem]
  var apps_url: String
  var teams: js.Array[ReposGetProtectedBranchRestrictionsResponseTeamsItem]
  var teams_url: String
  var url: String
  var users: js.Array[ReposGetProtectedBranchRestrictionsResponseUsersItem]
  var users_url: String
}

object ReposGetProtectedBranchRestrictionsResponse {
  @scala.inline
  def apply(
    apps: js.Array[ReposGetProtectedBranchRestrictionsResponseAppsItem],
    apps_url: String,
    teams: js.Array[ReposGetProtectedBranchRestrictionsResponseTeamsItem],
    teams_url: String,
    url: String,
    users: js.Array[ReposGetProtectedBranchRestrictionsResponseUsersItem],
    users_url: String
  ): ReposGetProtectedBranchRestrictionsResponse = {
    val __obj = js.Dynamic.literal(apps = apps, apps_url = apps_url, teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposGetProtectedBranchRestrictionsResponse]
  }
}

