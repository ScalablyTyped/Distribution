package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRangeOverflowRangeUnderflow extends js.Object {
  var rangeOverflow: js.UndefOr[String] = js.undefined
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}

object AnonRangeOverflowRangeUnderflow {
  @scala.inline
  def apply(rangeOverflow: String = null, rangeUnderflow: String = null): AnonRangeOverflowRangeUnderflow = {
    val __obj = js.Dynamic.literal()
    if (rangeOverflow != null) __obj.updateDynamic("rangeOverflow")(rangeOverflow.asInstanceOf[js.Any])
    if (rangeUnderflow != null) __obj.updateDynamic("rangeUnderflow")(rangeUnderflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRangeOverflowRangeUnderflow]
  }
}

