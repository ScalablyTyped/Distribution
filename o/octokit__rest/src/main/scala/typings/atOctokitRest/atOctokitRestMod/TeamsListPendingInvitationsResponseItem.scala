package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListPendingInvitationsResponseItem extends js.Object {
  var created_at: String
  var email: String
  var id: Double
  var invitation_team_url: String
  var inviter: TeamsListPendingInvitationsResponseItemInviter
  var login: String
  var role: String
  var team_count: Double
}

object TeamsListPendingInvitationsResponseItem {
  @scala.inline
  def apply(
    created_at: String,
    email: String,
    id: Double,
    invitation_team_url: String,
    inviter: TeamsListPendingInvitationsResponseItemInviter,
    login: String,
    role: String,
    team_count: Double
  ): TeamsListPendingInvitationsResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, email = email, id = id, invitation_team_url = invitation_team_url, inviter = inviter, login = login, role = role, team_count = team_count)
  
    __obj.asInstanceOf[TeamsListPendingInvitationsResponseItem]
  }
}

