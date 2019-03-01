package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExactInRange extends js.Object {
  var exact: js.UndefOr[java.lang.String] = js.undefined
  var inRange: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ExactInRange {
  @scala.inline
  def apply(
    exact: java.lang.String = null,
    inRange: java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null
  ): Anon_ExactInRange = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact)
    if (inRange != null) __obj.updateDynamic("inRange")(inRange)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[Anon_ExactInRange]
  }
}

