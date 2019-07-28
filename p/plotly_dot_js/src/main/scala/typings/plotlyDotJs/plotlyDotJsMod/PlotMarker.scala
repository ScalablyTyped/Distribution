package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_Color
import typings.plotlyDotJs.plotlyDotJsStrings.area
import typings.plotlyDotJs.plotlyDotJsStrings.diameter
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMarker extends js.Object {
  var autocolorscale: Boolean
  var cauto: Boolean
  var cmax: Double
  var cmin: Double
   // Drawing.symbolList
  var color: Color | js.Array[Color]
  var colorbar: Partial[ColorBar]
  var colors: js.Array[Color]
  var colorscale: String | (js.Array[(js.Array[String | Double]) | String])
  var gradient: Anon_Color
  var line: Partial[ScatterMarkerLine]
  var maxdisplayed: Double
  var opacity: Double | js.Array[Double]
  var reversescale: Boolean
  var showscale: Boolean
  var size: Double | js.Array[Double]
  var sizemax: Double
  var sizemin: Double
  var sizemode: diameter | area
  var sizeref: Double
  var symbol: String | js.Array[String]
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
    colorbar: Partial[ColorBar],
    colors: js.Array[Color],
    colorscale: String | (js.Array[(js.Array[String | Double]) | String]),
    gradient: Anon_Color,
    line: Partial[ScatterMarkerLine],
    maxdisplayed: Double,
    opacity: Double | js.Array[Double],
    reversescale: Boolean,
    showscale: Boolean,
    size: Double | js.Array[Double],
    sizemax: Double,
    sizemin: Double,
    sizemode: diameter | area,
    sizeref: Double,
    symbol: String | js.Array[String],
    width: Double
  ): PlotMarker = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale, cauto = cauto, cmax = cmax, cmin = cmin, color = color.asInstanceOf[js.Any], colorbar = colorbar, colors = colors, colorscale = colorscale.asInstanceOf[js.Any], gradient = gradient, line = line, maxdisplayed = maxdisplayed, opacity = opacity.asInstanceOf[js.Any], reversescale = reversescale, showscale = showscale, size = size.asInstanceOf[js.Any], sizemax = sizemax, sizemin = sizemin, sizemode = sizemode.asInstanceOf[js.Any], sizeref = sizeref, symbol = symbol.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[PlotMarker]
  }
}

