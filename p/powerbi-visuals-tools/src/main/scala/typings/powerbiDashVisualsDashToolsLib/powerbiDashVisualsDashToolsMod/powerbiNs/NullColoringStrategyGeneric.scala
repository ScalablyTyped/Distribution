package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullColoringStrategyGeneric[TStrategy, TColor] extends js.Object {
  /**
    * Only used if strategy is specificColor
    */
  var color: js.UndefOr[TColor] = js.undefined
  var strategy: TStrategy
}

object NullColoringStrategyGeneric {
  @scala.inline
  def apply[TStrategy, TColor](strategy: TStrategy, color: TColor = null): NullColoringStrategyGeneric[TStrategy, TColor] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullColoringStrategyGeneric[TStrategy, TColor]]
  }
}

