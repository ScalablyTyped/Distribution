package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageDetail extends js.Object {
  var hint: js.UndefOr[AnonInRange] = js.undefined
  var messageDetail: js.UndefOr[AnonRangeOverflow] = js.undefined
  var messageSummary: js.UndefOr[AnonRangeOverflow] = js.undefined
}

object AnonMessageDetail {
  @scala.inline
  def apply(
    hint: AnonInRange = null,
    messageDetail: AnonRangeOverflow = null,
    messageSummary: AnonRangeOverflow = null
  ): AnonMessageDetail = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageDetail]
  }
}

