package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseRestrictions extends js.Object {
  var teams: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem]
  var teams_url: java.lang.String
  var url: java.lang.String
  var users: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem]
  var users_url: java.lang.String
}

object ReposGetBranchProtectionResponseRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem],
    teams_url: java.lang.String,
    url: java.lang.String,
    users: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem],
    users_url: java.lang.String
  ): ReposGetBranchProtectionResponseRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRestrictions]
  }
}

