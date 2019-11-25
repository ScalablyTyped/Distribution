package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationParticipantInfo extends ParticipantInfo {
  var replacesCallId: js.UndefOr[String] = js.undefined
}

object InvitationParticipantInfo {
  @scala.inline
  def apply(
    identity: IdentitySet = null,
    languageId: String = null,
    region: String = null,
    replacesCallId: String = null
  ): InvitationParticipantInfo = {
    val __obj = js.Dynamic.literal()
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (languageId != null) __obj.updateDynamic("languageId")(languageId.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (replacesCallId != null) __obj.updateDynamic("replacesCallId")(replacesCallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationParticipantInfo]
  }
}

