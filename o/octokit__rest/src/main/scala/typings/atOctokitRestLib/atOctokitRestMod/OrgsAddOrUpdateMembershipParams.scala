package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsAddOrUpdateMembershipParams extends js.Object {
  var org: java.lang.String
  /**
    * The role to give the user in the organization. Can be one of:
    * \* `admin` - The user will become an owner of the organization.
    * \* `member` - The user will become a non-owner member of the organization.
    */
  var role: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.admin | atOctokitRestLib.atOctokitRestLibStrings.member
  ] = js.undefined
  var username: java.lang.String
}

object OrgsAddOrUpdateMembershipParams {
  @scala.inline
  def apply(
    org: java.lang.String,
    username: java.lang.String,
    role: atOctokitRestLib.atOctokitRestLibStrings.admin | atOctokitRestLib.atOctokitRestLibStrings.member = null
  ): OrgsAddOrUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsAddOrUpdateMembershipParams]
  }
}

