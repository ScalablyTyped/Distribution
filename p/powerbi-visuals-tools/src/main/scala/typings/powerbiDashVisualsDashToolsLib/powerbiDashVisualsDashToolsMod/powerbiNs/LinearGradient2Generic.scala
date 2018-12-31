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

