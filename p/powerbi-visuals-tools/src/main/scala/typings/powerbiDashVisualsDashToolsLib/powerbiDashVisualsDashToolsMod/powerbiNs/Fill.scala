package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fill extends _StructuralObjectValue {
  var gradient: js.UndefOr[powerbiDashVisualsDashToolsLib.Anon_EndColor] = js.undefined
  var pattern: js.UndefOr[powerbiDashVisualsDashToolsLib.Anon_ColorPatternKind] = js.undefined
  var solid: js.UndefOr[powerbiDashVisualsDashToolsLib.Anon_Color] = js.undefined
}

object Fill {
  @scala.inline
  def apply(
    gradient: powerbiDashVisualsDashToolsLib.Anon_EndColor = null,
    pattern: powerbiDashVisualsDashToolsLib.Anon_ColorPatternKind = null,
    solid: powerbiDashVisualsDashToolsLib.Anon_Color = null
  ): Fill = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (solid != null) __obj.updateDynamic("solid")(solid)
    __obj.asInstanceOf[Fill]
  }
}

