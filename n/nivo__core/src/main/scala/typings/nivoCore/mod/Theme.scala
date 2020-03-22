package typings.nivoCore.mod

import typings.nivoCore.PartialcontainerPartialCS
import typings.nivoCore.PartialdomainPartiallineP
import typings.nivoCore.PartiallineColorstringlin
import typings.nivoCore.PartiallinePartialCSSProp
import typings.nivoCore.PartialtextPartialCSSProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  background  :string,   axis  :std.Partial<{  domain  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>}>,   ticks  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>,   text  :std.Partial<react.react.CSSProperties>}>,   legend  :std.Partial<{  text  :std.Partial<react.react.CSSProperties>}>}>,   grid  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>}>,   legends  :std.Partial<{  text  :std.Partial<react.react.CSSProperties>}>,   labels  :std.Partial<{  text  :std.Partial<react.react.CSSProperties>}>,   markers  :std.Partial<{  lineColor  :string,   lineStrokeWidth  :number,   textColor  :string,   fontSize  :string | 0}>,   dots  :std.Partial<{  text  :std.Partial<react.react.CSSProperties>}>,   tooltip  :std.Partial<{  container  :std.Partial<react.react.CSSProperties>,   basic  :std.Partial<react.react.CSSProperties>,   chip  :std.Partial<react.react.CSSProperties>,   table  :std.Partial<react.react.CSSProperties>,   tableCell  :std.Partial<react.react.CSSProperties>}>}> */
trait Theme extends js.Object {
  var axis: js.UndefOr[PartialdomainPartiallineP] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var dots: js.UndefOr[PartialtextPartialCSSProp] = js.undefined
  var grid: js.UndefOr[PartiallinePartialCSSProp] = js.undefined
  var labels: js.UndefOr[PartialtextPartialCSSProp] = js.undefined
  var legends: js.UndefOr[PartialtextPartialCSSProp] = js.undefined
  var markers: js.UndefOr[PartiallineColorstringlin] = js.undefined
  var tooltip: js.UndefOr[PartialcontainerPartialCS] = js.undefined
}

object Theme {
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
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

