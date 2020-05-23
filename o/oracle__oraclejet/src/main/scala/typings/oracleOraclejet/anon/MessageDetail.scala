package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDetail extends js.Object {
  var hint: js.UndefOr[InRange] = js.undefined
  var messageDetail: js.UndefOr[RangeOverflow] = js.undefined
  var messageSummary: js.UndefOr[RangeOverflow] = js.undefined
}

object MessageDetail {
  @scala.inline
  def apply(hint: InRange = null, messageDetail: RangeOverflow = null, messageSummary: RangeOverflow = null): MessageDetail = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDetail]
  }
}

