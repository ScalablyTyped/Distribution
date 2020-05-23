package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HintMessageDetail extends js.Object {
  var hint: js.UndefOr[Exact] = js.undefined
  var messageDetail: js.UndefOr[RangeUnderflow] = js.undefined
  var messageSummary: js.UndefOr[RangeOverflow] = js.undefined
}

object HintMessageDetail {
  @scala.inline
  def apply(hint: Exact = null, messageDetail: RangeUnderflow = null, messageSummary: RangeOverflow = null): HintMessageDetail = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintMessageDetail]
  }
}

