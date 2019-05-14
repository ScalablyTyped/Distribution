package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInvitation_Options extends js.Object {
  var invitation_id: scala.Double
  var owner: java.lang.String
  var permissions: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
}

object ReposUpdateInvitation_Options {
  @scala.inline
  def apply(
    invitation_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    permissions: java.lang.String = null
  ): ReposUpdateInvitation_Options = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id, owner = owner, repo = repo)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[ReposUpdateInvitation_Options]
  }
}

