package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InRangeMax extends js.Object {
  var inRange: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_InRangeMax {
  @scala.inline
  def apply(inRange: java.lang.String = null, max: java.lang.String = null, min: java.lang.String = null): Anon_InRangeMax = {
    val __obj = js.Dynamic.literal()
    if (inRange != null) __obj.updateDynamic("inRange")(inRange)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[Anon_InRangeMax]
  }
}

