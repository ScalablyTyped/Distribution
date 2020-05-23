package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeOverflowRangeUnderflow extends js.Object {
  var rangeOverflow: js.UndefOr[String] = js.undefined
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}

object RangeOverflowRangeUnderflow {
  @scala.inline
  def apply(rangeOverflow: String = null, rangeUnderflow: String = null): RangeOverflowRangeUnderflow = {
    val __obj = js.Dynamic.literal()
    if (rangeOverflow != null) __obj.updateDynamic("rangeOverflow")(rangeOverflow.asInstanceOf[js.Any])
    if (rangeUnderflow != null) __obj.updateDynamic("rangeUnderflow")(rangeUnderflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOverflowRangeUnderflow]
  }
}

