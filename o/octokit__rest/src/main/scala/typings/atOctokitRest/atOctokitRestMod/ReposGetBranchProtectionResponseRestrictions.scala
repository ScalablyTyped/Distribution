package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseRestrictions extends js.Object {
  var teams: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem]
  var teams_url: String
  var url: String
  var users: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem]
  var users_url: String
}

object ReposGetBranchProtectionResponseRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem],
    teams_url: String,
    url: String,
    users: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem],
    users_url: String
  ): ReposGetBranchProtectionResponseRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRestrictions]
  }
}

