package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListInvitationTeamsParams extends js.Object {
  var invitation_id: Double
  var org: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}

object OrgsListInvitationTeamsParams {
  @scala.inline
  def apply(invitation_id: Double, org: String, page: Int | Double = null, per_page: Int | Double = null): OrgsListInvitationTeamsParams = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListInvitationTeamsParams]
  }
}

