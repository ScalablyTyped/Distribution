package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradient3Generic[TColor, TValue, TStrategy] extends js.Object {
  var max: RuleColorStopGeneric[TColor, TValue]
  var mid: RuleColorStopGeneric[TColor, TValue]
  var min: RuleColorStopGeneric[TColor, TValue]
  var nullColoringStrategy: js.UndefOr[NullColoringStrategyGeneric[TStrategy, TColor]] = js.undefined
}

object LinearGradient3Generic {
  @scala.inline
  def apply[TColor, TValue, TStrategy](
    max: RuleColorStopGeneric[TColor, TValue],
    mid: RuleColorStopGeneric[TColor, TValue],
    min: RuleColorStopGeneric[TColor, TValue],
    nullColoringStrategy: NullColoringStrategyGeneric[TStrategy, TColor] = null
  ): LinearGradient3Generic[TColor, TValue, TStrategy] = {
    val __obj = js.Dynamic.literal(max = max, mid = mid, min = min)
    if (nullColoringStrategy != null) __obj.updateDynamic("nullColoringStrategy")(nullColoringStrategy)
    __obj.asInstanceOf[LinearGradient3Generic[TColor, TValue, TStrategy]]
  }
}

