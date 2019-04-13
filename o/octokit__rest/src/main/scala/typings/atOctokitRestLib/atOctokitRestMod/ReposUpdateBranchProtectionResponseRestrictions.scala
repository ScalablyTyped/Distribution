package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponseRestrictions extends js.Object {
  var teams: js.Array[ReposUpdateBranchProtectionResponseRestrictionsTeamsItem]
  var teams_url: java.lang.String
  var url: java.lang.String
  var users: js.Array[ReposUpdateBranchProtectionResponseRestrictionsUsersItem]
  var users_url: java.lang.String
}

object ReposUpdateBranchProtectionResponseRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[ReposUpdateBranchProtectionResponseRestrictionsTeamsItem],
    teams_url: java.lang.String,
    url: java.lang.String,
    users: js.Array[ReposUpdateBranchProtectionResponseRestrictionsUsersItem],
    users_url: java.lang.String
  ): ReposUpdateBranchProtectionResponseRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams, teams_url = teams_url, url = url, users = users, users_url = users_url)
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseRestrictions]
  }
}

