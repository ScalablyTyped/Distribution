package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListInvitationTeamsEndpoint extends js.Object {
  var invitation_id: Double
  var org: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object OrgsListInvitationTeamsEndpoint {
  @scala.inline
  def apply(invitation_id: Double, org: String, page: Int | Double = null, per_page: Int | Double = null): OrgsListInvitationTeamsEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id, org = org)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListInvitationTeamsEndpoint]
  }
}

