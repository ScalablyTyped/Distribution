package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponseRestrictions extends js.Object {
  var teams: js.Array[ReposUpdateBranchProtectionResponseRestrictionsTeamsItem]
  var teams_url: String
  var url: String
  var users: js.Array[ReposUpdateBranchProtectionResponseRestrictionsUsersItem]
  var users_url: String
}

object ReposUpdateBranchProtectionResponseRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[ReposUpdateBranchProtectionResponseRestrictionsTeamsItem],
    teams_url: String,
    url: String,
    users: js.Array[ReposUpdateBranchProtectionResponseRestrictionsUsersItem],
    users_url: String
  ): ReposUpdateBranchProtectionResponseRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseRestrictions]
  }
}

