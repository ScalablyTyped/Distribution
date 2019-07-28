package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExactRangeOverflowRangeUnderflow extends js.Object {
  var exact: js.UndefOr[String] = js.undefined
  var rangeOverflow: js.UndefOr[String] = js.undefined
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}

object Anon_ExactRangeOverflowRangeUnderflow {
  @scala.inline
  def apply(exact: String = null, rangeOverflow: String = null, rangeUnderflow: String = null): Anon_ExactRangeOverflowRangeUnderflow = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact)
    if (rangeOverflow != null) __obj.updateDynamic("rangeOverflow")(rangeOverflow)
    if (rangeUnderflow != null) __obj.updateDynamic("rangeUnderflow")(rangeUnderflow)
    __obj.asInstanceOf[Anon_ExactRangeOverflowRangeUnderflow]
  }
}

