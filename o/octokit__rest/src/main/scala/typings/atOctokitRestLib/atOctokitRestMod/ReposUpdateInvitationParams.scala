package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInvitationParams extends js.Object {
  var invitation_id: scala.Double
  var owner: java.lang.String
  /**
    * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, and `admin`.
    */
  var permissions: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.read | atOctokitRestLib.atOctokitRestLibStrings.write | atOctokitRestLib.atOctokitRestLibStrings.admin
  ] = js.undefined
  var repo: java.lang.String
}

object ReposUpdateInvitationParams {
  @scala.inline
  def apply(
    invitation_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    permissions: atOctokitRestLib.atOctokitRestLibStrings.read | atOctokitRestLib.atOctokitRestLibStrings.write | atOctokitRestLib.atOctokitRestLibStrings.admin = null
  ): ReposUpdateInvitationParams = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id, owner = owner, repo = repo)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInvitationParams]
  }
}

