package typings.plotlyJs

import typings.plotlyJs.mod.Color
import typings.plotlyJs.mod.ColorScale
import typings.plotlyJs.mod.MarkerSymbol
import typings.plotlyJs.plotlyJsStrings.area
import typings.plotlyJs.plotlyJsStrings.diameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PlotMarker> */
trait PartialPlotMarker extends js.Object {
  var autocolorscale: js.UndefOr[Boolean] = js.undefined
  var cauto: js.UndefOr[Boolean] = js.undefined
  var cmax: js.UndefOr[Double] = js.undefined
  var cmin: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color | js.Array[Color]] = js.undefined
  var colorbar: js.UndefOr[PartialColorBar] = js.undefined
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var colorscale: js.UndefOr[ColorScale] = js.undefined
  var gradient: js.UndefOr[AnonColorsrc] = js.undefined
  var line: js.UndefOr[PartialScatterMarkerLine] = js.undefined
  var maxdisplayed: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var pad: js.UndefOr[PartialPadding] = js.undefined
  var reversescale: js.UndefOr[Boolean] = js.undefined
  var showscale: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var sizemax: js.UndefOr[Double] = js.undefined
  var sizemin: js.UndefOr[Double] = js.undefined
  var sizemode: js.UndefOr[diameter | area] = js.undefined
  var sizeref: js.UndefOr[Double] = js.undefined
  var symbol: js.UndefOr[MarkerSymbol] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialPlotMarker {
  @scala.inline
  def apply(
    autocolorscale: js.UndefOr[Boolean] = js.undefined,
    cauto: js.UndefOr[Boolean] = js.undefined,
    cmax: Int | Double = null,
    cmin: Int | Double = null,
    color: Color | js.Array[Color] = null,
    colorbar: PartialColorBar = null,
    colors: js.Array[Color] = null,
    colorscale: ColorScale = null,
    gradient: AnonColorsrc = null,
    line: PartialScatterMarkerLine = null,
    maxdisplayed: Int | Double = null,
    opacity: Double | js.Array[Double] = null,
    pad: PartialPadding = null,
    reversescale: js.UndefOr[Boolean] = js.undefined,
    showscale: js.UndefOr[Boolean] = js.undefined,
    size: Double | js.Array[Double] = null,
    sizemax: Int | Double = null,
    sizemin: Int | Double = null,
    sizemode: diameter | area = null,
    sizeref: Int | Double = null,
    symbol: MarkerSymbol = null,
    width: Int | Double = null
  ): PartialPlotMarker = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autocolorscale)) __obj.updateDynamic("autocolorscale")(autocolorscale.asInstanceOf[js.Any])
    if (!js.isUndefined(cauto)) __obj.updateDynamic("cauto")(cauto.asInstanceOf[js.Any])
    if (cmax != null) __obj.updateDynamic("cmax")(cmax.asInstanceOf[js.Any])
    if (cmin != null) __obj.updateDynamic("cmin")(cmin.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorbar != null) __obj.updateDynamic("colorbar")(colorbar.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (colorscale != null) __obj.updateDynamic("colorscale")(colorscale.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (maxdisplayed != null) __obj.updateDynamic("maxdisplayed")(maxdisplayed.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (!js.isUndefined(reversescale)) __obj.updateDynamic("reversescale")(reversescale.asInstanceOf[js.Any])
    if (!js.isUndefined(showscale)) __obj.updateDynamic("showscale")(showscale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizemax != null) __obj.updateDynamic("sizemax")(sizemax.asInstanceOf[js.Any])
    if (sizemin != null) __obj.updateDynamic("sizemin")(sizemin.asInstanceOf[js.Any])
    if (sizemode != null) __obj.updateDynamic("sizemode")(sizemode.asInstanceOf[js.Any])
    if (sizeref != null) __obj.updateDynamic("sizeref")(sizeref.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPlotMarker]
  }
}

