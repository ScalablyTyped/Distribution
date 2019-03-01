package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExactRangeOverflow extends js.Object {
  var exact: js.UndefOr[java.lang.String] = js.undefined
  var rangeOverflow: js.UndefOr[java.lang.String] = js.undefined
  var rangeUnderflow: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ExactRangeOverflow {
  @scala.inline
  def apply(
    exact: java.lang.String = null,
    rangeOverflow: java.lang.String = null,
    rangeUnderflow: java.lang.String = null
  ): Anon_ExactRangeOverflow = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact)
    if (rangeOverflow != null) __obj.updateDynamic("rangeOverflow")(rangeOverflow)
    if (rangeUnderflow != null) __obj.updateDynamic("rangeUnderflow")(rangeUnderflow)
    __obj.asInstanceOf[Anon_ExactRangeOverflow]
  }
}

