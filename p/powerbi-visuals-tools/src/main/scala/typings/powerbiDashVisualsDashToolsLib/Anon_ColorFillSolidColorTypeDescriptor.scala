package typings
package powerbiDashVisualsDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorFillSolidColorTypeDescriptor extends js.Object {
  var color: js.UndefOr[
    powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.FillSolidColorTypeDescriptor
  ] = js.undefined
}

object Anon_ColorFillSolidColorTypeDescriptor {
  @scala.inline
  def apply(
    color: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.FillSolidColorTypeDescriptor = null
  ): Anon_ColorFillSolidColorTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorFillSolidColorTypeDescriptor]
  }
}

