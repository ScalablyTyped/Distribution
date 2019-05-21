package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateInvitationEndpoint extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var invitee_id: js.UndefOr[scala.Double] = js.undefined
  var org: java.lang.String
  var role: js.UndefOr[java.lang.String] = js.undefined
  var team_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object OrgsCreateInvitationEndpoint {
  @scala.inline
  def apply(
    org: java.lang.String,
    email: java.lang.String = null,
    invitee_id: scala.Int | scala.Double = null,
    role: java.lang.String = null,
    team_ids: js.Array[scala.Double] = null
  ): OrgsCreateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(org = org)
    if (email != null) __obj.updateDynamic("email")(email)
    if (invitee_id != null) __obj.updateDynamic("invitee_id")(invitee_id.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (team_ids != null) __obj.updateDynamic("team_ids")(team_ids)
    __obj.asInstanceOf[OrgsCreateInvitationEndpoint]
  }
}

