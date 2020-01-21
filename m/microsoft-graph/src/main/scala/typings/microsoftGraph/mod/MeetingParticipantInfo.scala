package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeetingParticipantInfo extends js.Object {
  var identity: js.UndefOr[IdentitySet] = js.undefined
  var upn: js.UndefOr[String] = js.undefined
}

object MeetingParticipantInfo {
  @scala.inline
  def apply(identity: IdentitySet = null, upn: String = null): MeetingParticipantInfo = {
    val __obj = js.Dynamic.literal()
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (upn != null) __obj.updateDynamic("upn")(upn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingParticipantInfo]
  }
}

