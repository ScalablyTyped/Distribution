package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListPendingInvitationsResponseItem extends js.Object {
  var created_at: java.lang.String
  var email: java.lang.String
  var id: scala.Double
  var invitation_team_url: java.lang.String
  var inviter: TeamsListPendingInvitationsResponseItemInviter
  var login: java.lang.String
  var role: java.lang.String
  var team_count: scala.Double
}

object TeamsListPendingInvitationsResponseItem {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    email: java.lang.String,
    id: scala.Double,
    invitation_team_url: java.lang.String,
    inviter: TeamsListPendingInvitationsResponseItemInviter,
    login: java.lang.String,
    role: java.lang.String,
    team_count: scala.Double
  ): TeamsListPendingInvitationsResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, email = email, id = id, invitation_team_url = invitation_team_url, inviter = inviter, login = login, role = role, team_count = team_count)
  
    __obj.asInstanceOf[TeamsListPendingInvitationsResponseItem]
  }
}

