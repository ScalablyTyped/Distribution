package typings.microsoftGraph.mod

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
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (languageId != null) __obj.updateDynamic("languageId")(languageId.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantInfo]
  }
}

