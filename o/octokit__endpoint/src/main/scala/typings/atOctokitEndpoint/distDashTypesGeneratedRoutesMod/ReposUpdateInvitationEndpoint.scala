package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInvitationEndpoint extends js.Object {
  var invitation_id: Double
  var owner: String
  var permissions: js.UndefOr[String] = js.undefined
  var repo: String
}

object ReposUpdateInvitationEndpoint {
  @scala.inline
  def apply(invitation_id: Double, owner: String, repo: String, permissions: String = null): ReposUpdateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id, owner = owner, repo = repo)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[ReposUpdateInvitationEndpoint]
  }
}

