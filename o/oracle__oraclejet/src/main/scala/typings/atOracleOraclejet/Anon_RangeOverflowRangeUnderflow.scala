package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RangeOverflowRangeUnderflow extends js.Object {
  var rangeOverflow: js.UndefOr[String] = js.undefined
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}

object Anon_RangeOverflowRangeUnderflow {
  @scala.inline
  def apply(rangeOverflow: String = null, rangeUnderflow: String = null): Anon_RangeOverflowRangeUnderflow = {
    val __obj = js.Dynamic.literal()
    if (rangeOverflow != null) __obj.updateDynamic("rangeOverflow")(rangeOverflow)
    if (rangeUnderflow != null) __obj.updateDynamic("rangeUnderflow")(rangeUnderflow)
    __obj.asInstanceOf[Anon_RangeOverflowRangeUnderflow]
  }
}

