package typings.nivoGeo.anon

import typings.nivoCore.anon.PartialcontainerPartialCS
import typings.nivoCore.anon.PartialdomainPartiallineP
import typings.nivoCore.anon.PartiallineColorstringlin
import typings.nivoCore.anon.PartiallinePartialCSSProp
import typings.nivoCore.anon.PartialtextPartialCSSProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nivo/core.@nivo/core.Theme> */
trait PartialTheme extends js.Object {
  var axis: js.UndefOr[PartialdomainPartiallineP] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var dots: js.UndefOr[PartialtextPartialCSSProp] = js.undefined
  var grid: js.UndefOr[PartiallinePartialCSSProp] = js.undefined
  var labels: js.UndefOr[PartialtextPartialCSSProp] = js.undefined
  var legends: js.UndefOr[PartialtextPartialCSSProp] = js.undefined
  var markers: js.UndefOr[PartiallineColorstringlin] = js.undefined
  var tooltip: js.UndefOr[PartialcontainerPartialCS] = js.undefined
}

object PartialTheme {
  @scala.inline
  def apply(
    axis: PartialdomainPartiallineP = null,
    background: String = null,
    dots: PartialtextPartialCSSProp = null,
    grid: PartiallinePartialCSSProp = null,
    labels: PartialtextPartialCSSProp = null,
    legends: PartialtextPartialCSSProp = null,
    markers: PartiallineColorstringlin = null,
    tooltip: PartialcontainerPartialCS = null
  ): PartialTheme = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTheme]
  }
}

