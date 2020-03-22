package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.admin
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.billing_manager
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.direct_member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateInvitationParams extends js.Object {
  /**
    * **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * **Required unless you provide `email`**. GitHub user ID for the person you are inviting.
    */
  var invitee_id: js.UndefOr[Double] = js.undefined
  var org: String
  /**
    * Specify role for new member. Can be one of:
    * \* `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.
    * \* `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.
    * \* `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.
    */
  var role: js.UndefOr[admin | direct_member | billing_manager] = js.undefined
  /**
    * Specify IDs for the teams you want to invite new members to.
    */
  var team_ids: js.UndefOr[js.Array[Double]] = js.undefined
}

object OrgsCreateInvitationParams {
  @scala.inline
  def apply(
    org: String,
    email: String = null,
    invitee_id: Int | Double = null,
    role: admin | direct_member | billing_manager = null,
    team_ids: js.Array[Double] = null
  ): OrgsCreateInvitationParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (invitee_id != null) __obj.updateDynamic("invitee_id")(invitee_id.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (team_ids != null) __obj.updateDynamic("team_ids")(team_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateInvitationParams]
  }
}

