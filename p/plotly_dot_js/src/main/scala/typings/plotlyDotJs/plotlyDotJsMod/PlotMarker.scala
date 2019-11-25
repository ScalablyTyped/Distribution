package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_ColorColorsrc
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
  var colorscale: ColorScale
  var gradient: Anon_ColorColorsrc
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
    colorscale: ColorScale,
    gradient: Anon_ColorColorsrc,
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
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale.asInstanceOf[js.Any], cauto = cauto.asInstanceOf[js.Any], cmax = cmax.asInstanceOf[js.Any], cmin = cmin.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorbar = colorbar.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], maxdisplayed = maxdisplayed.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], reversescale = reversescale.asInstanceOf[js.Any], showscale = showscale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizemax = sizemax.asInstanceOf[js.Any], sizemin = sizemin.asInstanceOf[js.Any], sizemode = sizemode.asInstanceOf[js.Any], sizeref = sizeref.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlotMarker]
  }
}

