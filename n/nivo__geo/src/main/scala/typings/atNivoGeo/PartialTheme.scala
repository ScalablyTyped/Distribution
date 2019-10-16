package typings.atNivoGeo

import typings.atNivoCore.PartialcontainerPartialCSSPropertiesbasicPartialCS
import typings.atNivoCore.PartialdomainPartiallinePartialCSSPropertiesticksP
import typings.atNivoCore.PartiallineColorstringlineStrokeWidthnumbertextCol
import typings.atNivoCore.PartiallinePartialCSSProperties
import typings.atNivoCore.PartialtextPartialCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nivo/core.@nivo/core.Theme> */
trait PartialTheme extends js.Object {
  var axis: js.UndefOr[PartialdomainPartiallinePartialCSSPropertiesticksP] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var dots: js.UndefOr[PartialtextPartialCSSProperties] = js.undefined
  var grid: js.UndefOr[PartiallinePartialCSSProperties] = js.undefined
  var labels: js.UndefOr[PartialtextPartialCSSProperties] = js.undefined
  var legends: js.UndefOr[PartialtextPartialCSSProperties] = js.undefined
  var markers: js.UndefOr[PartiallineColorstringlineStrokeWidthnumbertextCol] = js.undefined
  var tooltip: js.UndefOr[PartialcontainerPartialCSSPropertiesbasicPartialCS] = js.undefined
}

object PartialTheme {
  @scala.inline
  def apply(
    axis: PartialdomainPartiallinePartialCSSPropertiesticksP = null,
    background: String = null,
    dots: PartialtextPartialCSSProperties = null,
    grid: PartiallinePartialCSSProperties = null,
    labels: PartialtextPartialCSSProperties = null,
    legends: PartialtextPartialCSSProperties = null,
    markers: PartiallineColorstringlineStrokeWidthnumbertextCol = null,
    tooltip: PartialcontainerPartialCSSPropertiesbasicPartialCS = null
  ): PartialTheme = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (background != null) __obj.updateDynamic("background")(background)
    if (dots != null) __obj.updateDynamic("dots")(dots)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[PartialTheme]
  }
}

