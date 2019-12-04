package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HintMessageDetailMessageSummary extends js.Object {
  var hint: js.UndefOr[Anon_Exact] = js.undefined
  var messageDetail: js.UndefOr[Anon_ExactRangeOverflow] = js.undefined
  var messageSummary: js.UndefOr[Anon_RangeOverflow] = js.undefined
}

object Anon_HintMessageDetailMessageSummary {
  @scala.inline
  def apply(
    hint: Anon_Exact = null,
    messageDetail: Anon_ExactRangeOverflow = null,
    messageSummary: Anon_RangeOverflow = null
  ): Anon_HintMessageDetailMessageSummary = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HintMessageDetailMessageSummary]
  }
}

