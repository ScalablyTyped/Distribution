package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExactRangeOverflow extends js.Object {
  var exact: js.UndefOr[String] = js.undefined
  var rangeOverflow: js.UndefOr[String] = js.undefined
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}

object Anon_ExactRangeOverflow {
  @scala.inline
  def apply(exact: String = null, rangeOverflow: String = null, rangeUnderflow: String = null): Anon_ExactRangeOverflow = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (rangeOverflow != null) __obj.updateDynamic("rangeOverflow")(rangeOverflow.asInstanceOf[js.Any])
    if (rangeUnderflow != null) __obj.updateDynamic("rangeUnderflow")(rangeUnderflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExactRangeOverflow]
  }
}

