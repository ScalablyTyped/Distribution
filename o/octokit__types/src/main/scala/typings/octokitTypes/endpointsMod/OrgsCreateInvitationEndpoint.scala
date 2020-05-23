package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.billing_manager
import typings.octokitTypes.octokitTypesStrings.direct_member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateInvitationEndpoint extends js.Object {
  /**
    * **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * **Required unless you provide `email`**. GitHub user ID for the person you are inviting.
    */
  var invitee_id: js.UndefOr[Double] = js.undefined
  @JSName("org")
  var org_ : String
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

object OrgsCreateInvitationEndpoint {
  @scala.inline
  def apply(
    org_ : String,
    email: String = null,
    invitee_id: js.UndefOr[Double] = js.undefined,
    role: admin | direct_member | billing_manager = null,
    team_ids: js.Array[Double] = null
  ): OrgsCreateInvitationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(invitee_id)) __obj.updateDynamic("invitee_id")(invitee_id.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (team_ids != null) __obj.updateDynamic("team_ids")(team_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateInvitationEndpoint]
  }
}

