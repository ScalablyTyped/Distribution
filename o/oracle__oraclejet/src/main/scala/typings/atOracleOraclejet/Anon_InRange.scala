package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InRange extends js.Object {
  var inRange: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
}

object Anon_InRange {
  @scala.inline
  def apply(inRange: String = null, max: String = null, min: String = null): Anon_InRange = {
    val __obj = js.Dynamic.literal()
    if (inRange != null) __obj.updateDynamic("inRange")(inRange)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[Anon_InRange]
  }
}

