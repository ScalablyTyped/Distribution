package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillTypeDescriptor extends js.Object {
  var gradient: js.UndefOr[powerbiDashVisualsDashToolsLib.Anon_EndColorStartColor] = js.undefined
  var pattern: js.UndefOr[powerbiDashVisualsDashToolsLib.Anon_ColorPatternKindBoolean] = js.undefined
  var solid: js.UndefOr[powerbiDashVisualsDashToolsLib.Anon_ColorFillSolidColorTypeDescriptor] = js.undefined
}

object FillTypeDescriptor {
  @scala.inline
  def apply(
    gradient: powerbiDashVisualsDashToolsLib.Anon_EndColorStartColor = null,
    pattern: powerbiDashVisualsDashToolsLib.Anon_ColorPatternKindBoolean = null,
    solid: powerbiDashVisualsDashToolsLib.Anon_ColorFillSolidColorTypeDescriptor = null
  ): FillTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (solid != null) __obj.updateDynamic("solid")(solid)
    __obj.asInstanceOf[FillTypeDescriptor]
  }
}

