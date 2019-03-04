package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleColorStopGeneric[TColor, TValue] extends js.Object {
  var color: TColor
  var value: js.UndefOr[TValue] = js.undefined
}

object RuleColorStopGeneric {
  @scala.inline
  def apply[TColor, TValue](color: TColor, value: TValue = null): RuleColorStopGeneric[TColor, TValue] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleColorStopGeneric[TColor, TValue]]
  }
}

