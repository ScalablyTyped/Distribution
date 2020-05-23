package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsAddOrUpdateMembershipEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  /**
    * The role to give the user in the organization. Can be one of:
    * \* `admin` - The user will become an owner of the organization.
    * \* `member` - The user will become a non-owner member of the organization.
    */
  var role: js.UndefOr[admin | member] = js.undefined
  var username: String
}

object OrgsAddOrUpdateMembershipEndpoint {
  @scala.inline
  def apply(org_ : String, username: String, role: admin | member = null): OrgsAddOrUpdateMembershipEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsAddOrUpdateMembershipEndpoint]
  }
}

