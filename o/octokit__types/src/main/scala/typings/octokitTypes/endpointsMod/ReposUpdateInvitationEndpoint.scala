package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.maintain
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.triage
import typings.octokitTypes.octokitTypesStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInvitationEndpoint extends js.Object {
  var invitation_id: Double
  var owner: String
  /**
    * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`.
    */
  var permissions: js.UndefOr[read | write | maintain | triage | admin] = js.undefined
  var repo: String
}

object ReposUpdateInvitationEndpoint {
  @scala.inline
  def apply(
    invitation_id: Double,
    owner: String,
    repo: String,
    permissions: read | write | maintain | triage | admin = null
  ): ReposUpdateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInvitationEndpoint]
  }
}

