package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HintMessageDetail extends js.Object {
  var hint: js.UndefOr[Anon_InRange] = js.undefined
  var messageDetail: js.UndefOr[Anon_RangeOverflow] = js.undefined
  var messageSummary: js.UndefOr[Anon_RangeOverflow] = js.undefined
}

object Anon_HintMessageDetail {
  @scala.inline
  def apply(
    hint: Anon_InRange = null,
    messageDetail: Anon_RangeOverflow = null,
    messageSummary: Anon_RangeOverflow = null
  ): Anon_HintMessageDetail = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary)
    __obj.asInstanceOf[Anon_HintMessageDetail]
  }
}

