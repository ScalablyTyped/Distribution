package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradient2Generic[TColor, TValue, TStrategy] extends js.Object {
  var max: RuleColorStopGeneric[TColor, TValue]
  var min: RuleColorStopGeneric[TColor, TValue]
  var nullColoringStrategy: js.UndefOr[NullColoringStrategyGeneric[TStrategy, TColor]] = js.undefined
}

object LinearGradient2Generic {
  @scala.inline
  def apply[TColor, TValue, TStrategy](
    max: RuleColorStopGeneric[TColor, TValue],
    min: RuleColorStopGeneric[TColor, TValue],
    nullColoringStrategy: NullColoringStrategyGeneric[TStrategy, TColor] = null
  ): LinearGradient2Generic[TColor, TValue, TStrategy] = {
    val __obj = js.Dynamic.literal(max = max, min = min)
    if (nullColoringStrategy != null) __obj.updateDynamic("nullColoringStrategy")(nullColoringStrategy)
    __obj.asInstanceOf[LinearGradient2Generic[TColor, TValue, TStrategy]]
  }
}

