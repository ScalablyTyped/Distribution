package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHintMessageDetailMessageSummary extends js.Object {
  var hint: js.UndefOr[AnonExact] = js.undefined
  var messageDetail: js.UndefOr[AnonExactRangeOverflow] = js.undefined
  var messageSummary: js.UndefOr[AnonRangeOverflow] = js.undefined
}

object AnonHintMessageDetailMessageSummary {
  @scala.inline
  def apply(
    hint: AnonExact = null,
    messageDetail: AnonExactRangeOverflow = null,
    messageSummary: AnonRangeOverflow = null
  ): AnonHintMessageDetailMessageSummary = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHintMessageDetailMessageSummary]
  }
}

