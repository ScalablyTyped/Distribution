package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticipantInfo extends js.Object {
  var identity: js.UndefOr[IdentitySet] = js.undefined
  var languageId: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object ParticipantInfo {
  @scala.inline
  def apply(identity: IdentitySet = null, languageId: String = null, region: String = null): ParticipantInfo = {
    val __obj = js.Dynamic.literal()
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (languageId != null) __obj.updateDynamic("languageId")(languageId)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[ParticipantInfo]
  }
}

