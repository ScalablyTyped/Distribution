package typings.microsoftDashGraph.microsoftDashGraphMod

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
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (upn != null) __obj.updateDynamic("upn")(upn)
    __obj.asInstanceOf[MeetingParticipantInfo]
  }
}

