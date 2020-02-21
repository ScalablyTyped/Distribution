package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: AnonType
  var invitee_id: AnonType
  var org: AnonRequired
  var role: AnonEnum
  var team_ids: AnonType
}

object AnonEmail {
  @scala.inline
  def apply(email: AnonType, invitee_id: AnonType, org: AnonRequired, role: AnonEnum, team_ids: AnonType): AnonEmail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], invitee_id = invitee_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_ids = team_ids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmail]
  }
}

