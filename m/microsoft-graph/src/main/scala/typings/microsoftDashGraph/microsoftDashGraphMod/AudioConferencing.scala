package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioConferencing extends js.Object {
  var conferenceId: js.UndefOr[String] = js.undefined
  var dialinUrl: js.UndefOr[String] = js.undefined
  var tollFreeNumber: js.UndefOr[String] = js.undefined
  var tollNumber: js.UndefOr[String] = js.undefined
}

object AudioConferencing {
  @scala.inline
  def apply(
    conferenceId: String = null,
    dialinUrl: String = null,
    tollFreeNumber: String = null,
    tollNumber: String = null
  ): AudioConferencing = {
    val __obj = js.Dynamic.literal()
    if (conferenceId != null) __obj.updateDynamic("conferenceId")(conferenceId)
    if (dialinUrl != null) __obj.updateDynamic("dialinUrl")(dialinUrl)
    if (tollFreeNumber != null) __obj.updateDynamic("tollFreeNumber")(tollFreeNumber)
    if (tollNumber != null) __obj.updateDynamic("tollNumber")(tollNumber)
    __obj.asInstanceOf[AudioConferencing]
  }
}

