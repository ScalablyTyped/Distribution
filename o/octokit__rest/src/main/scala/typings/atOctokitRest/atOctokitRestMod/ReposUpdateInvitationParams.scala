package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.admin
import typings.atOctokitRest.atOctokitRestStrings.read
import typings.atOctokitRest.atOctokitRestStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInvitationParams extends js.Object {
  var invitation_id: Double
  var owner: String
  /**
    * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, and `admin`.
    */
  var permissions: js.UndefOr[read | write | admin] = js.undefined
  var repo: String
}

object ReposUpdateInvitationParams {
  @scala.inline
  def apply(invitation_id: Double, owner: String, repo: String, permissions: read | write | admin = null): ReposUpdateInvitationParams = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInvitationParams]
  }
}

