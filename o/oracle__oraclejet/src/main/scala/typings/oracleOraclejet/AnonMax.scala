package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var exact: js.UndefOr[String] = js.undefined
  var inRange: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
}

object AnonMax {
  @scala.inline
  def apply(exact: String = null, inRange: String = null, max: String = null, min: String = null): AnonMax = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (inRange != null) __obj.updateDynamic("inRange")(inRange.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

