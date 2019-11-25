package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.admin
import typings.atOctokitRest.atOctokitRestStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsAddOrUpdateMembershipParams extends js.Object {
  var org: String
  /**
    * The role to give the user in the organization. Can be one of:
    * \* `admin` - The user will become an owner of the organization.
    * \* `member` - The user will become a non-owner member of the organization.
    */
  var role: js.UndefOr[admin | member] = js.undefined
  var username: String
}

object OrgsAddOrUpdateMembershipParams {
  @scala.inline
  def apply(org: String, username: String, role: admin | member = null): OrgsAddOrUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsAddOrUpdateMembershipParams]
  }
}

