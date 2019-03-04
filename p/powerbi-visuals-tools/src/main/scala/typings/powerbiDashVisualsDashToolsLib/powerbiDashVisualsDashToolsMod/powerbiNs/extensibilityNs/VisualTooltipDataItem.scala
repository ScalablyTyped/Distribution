package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.extensibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualTooltipDataItem extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var displayName: java.lang.String
  var header: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object VisualTooltipDataItem {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    value: java.lang.String,
    color: java.lang.String = null,
    header: java.lang.String = null,
    opacity: java.lang.String = null
  ): VisualTooltipDataItem = {
    val __obj = js.Dynamic.literal(displayName = displayName, value = value)
    if (color != null) __obj.updateDynamic("color")(color)
    if (header != null) __obj.updateDynamic("header")(header)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[VisualTooltipDataItem]
  }
}

