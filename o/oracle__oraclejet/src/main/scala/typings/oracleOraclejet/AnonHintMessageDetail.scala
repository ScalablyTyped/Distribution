package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHintMessageDetail extends js.Object {
  var hint: js.UndefOr[AnonExact] = js.undefined
  var messageDetail: js.UndefOr[AnonRangeUnderflow] = js.undefined
  var messageSummary: js.UndefOr[AnonRangeOverflow] = js.undefined
}

object AnonHintMessageDetail {
  @scala.inline
  def apply(
    hint: AnonExact = null,
    messageDetail: AnonRangeUnderflow = null,
    messageSummary: AnonRangeOverflow = null
  ): AnonHintMessageDetail = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHintMessageDetail]
  }
}

