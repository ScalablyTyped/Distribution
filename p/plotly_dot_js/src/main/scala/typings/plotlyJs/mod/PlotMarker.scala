package typings.plotlyJs.mod

import typings.plotlyJs.AnonColorsrc
import typings.plotlyJs.PartialColorBar
import typings.plotlyJs.PartialPadding
import typings.plotlyJs.PartialScatterMarkerLine
import typings.plotlyJs.plotlyJsStrings.area
import typings.plotlyJs.plotlyJsStrings.diameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMarker extends js.Object {
  var autocolorscale: Boolean
  var cauto: Boolean
  var cmax: Double
  var cmin: Double
  var color: Color | js.Array[Color]
  var colorbar: PartialColorBar
  var colors: js.Array[Color]
  var colorscale: ColorScale
  var gradient: AnonColorsrc
  var line: PartialScatterMarkerLine
  var maxdisplayed: Double
  var opacity: Double | js.Array[Double]
  var pad: PartialPadding
  var reversescale: Boolean
  var showscale: Boolean
  var size: Double | js.Array[Double]
  var sizemax: Double
  var sizemin: Double
  var sizemode: diameter | area
  var sizeref: Double
  var symbol: MarkerSymbol
  var width: Double
}

object PlotMarker {
  @scala.inline
  def apply(
    autocolorscale: Boolean,
    cauto: Boolean,
    cmax: Double,
    cmin: Double,
    color: Color | js.Array[Color],
    colorbar: PartialColorBar,
    colors: js.Array[Color],
    colorscale: ColorScale,
    gradient: AnonColorsrc,
    line: PartialScatterMarkerLine,
    maxdisplayed: Double,
    opacity: Double | js.Array[Double],
    pad: PartialPadding,
    reversescale: Boolean,
    showscale: Boolean,
    size: Double | js.Array[Double],
    sizemax: Double,
    sizemin: Double,
    sizemode: diameter | area,
    sizeref: Double,
    symbol: MarkerSymbol,
    width: Double
  ): PlotMarker = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale.asInstanceOf[js.Any], cauto = cauto.asInstanceOf[js.Any], cmax = cmax.asInstanceOf[js.Any], cmin = cmin.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorbar = colorbar.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], maxdisplayed = maxdisplayed.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], reversescale = reversescale.asInstanceOf[js.Any], showscale = showscale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizemax = sizemax.asInstanceOf[js.Any], sizemin = sizemin.asInstanceOf[js.Any], sizemode = sizemode.asInstanceOf[js.Any], sizeref = sizeref.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMarker]
  }
}

