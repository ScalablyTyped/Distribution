package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.billing_manager
import typings.octokitTypes.octokitTypesStrings.direct_member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsCreateInvitationEndpoint extends js.Object {
  /**
    * **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * **Required unless you provide `email`**. GitHub user ID for the person you are inviting.
    */
  var invitee_id: js.UndefOr[Double] = js.native
  @JSName("org")
  var org_ : String = js.native
  /**
    * Specify role for new member. Can be one of:
    * \* `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.
    * \* `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.
    * \* `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.
    */
  var role: js.UndefOr[admin | direct_member | billing_manager] = js.native
  /**
    * Specify IDs for the teams you want to invite new members to.
    */
  var team_ids: js.UndefOr[js.Array[Double]] = js.native
}

object OrgsCreateInvitationEndpoint {
  @scala.inline
  def apply(org_ : String): OrgsCreateInvitationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateInvitationEndpoint]
  }
  @scala.inline
  implicit class OrgsCreateInvitationEndpointOps[Self <: OrgsCreateInvitationEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setInvitee_id(value: Double): Self = this.set("invitee_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitee_id: Self = this.set("invitee_id", js.undefined)
    @scala.inline
    def setRole(value: admin | direct_member | billing_manager): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setTeam_idsVarargs(value: Double*): Self = this.set("team_ids", js.Array(value :_*))
    @scala.inline
    def setTeam_ids(value: js.Array[Double]): Self = this.set("team_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam_ids: Self = this.set("team_ids", js.undefined)
  }
  
}

