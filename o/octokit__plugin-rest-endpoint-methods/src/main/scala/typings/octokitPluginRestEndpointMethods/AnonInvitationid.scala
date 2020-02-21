package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvitationid extends js.Object {
  var invitation_id: AnonRequired
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
}

object AnonInvitationid {
  @scala.inline
  def apply(invitation_id: AnonRequired, org: AnonRequired, page: AnonType, per_page: AnonType): AnonInvitationid = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInvitationid]
  }
}

