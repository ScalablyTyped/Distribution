package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMarker extends js.Object {
  var autocolorscale: scala.Boolean
  var cauto: scala.Boolean
  var cmax: scala.Double
  var cmin: scala.Double
   // Drawing.symbolList
  var color: Color | js.Array[Color]
  var colorbar: stdLib.Partial[ColorBar]
  var colors: js.Array[Color]
  var colorscale: java.lang.String | js.Array[java.lang.String] | (js.Array[js.Array[java.lang.String | scala.Double]])
  var gradient: plotlyDotJsLib.Anon_Color
  var line: stdLib.Partial[ScatterMarkerLine]
  var maxdisplayed: scala.Double
  var opacity: scala.Double | js.Array[scala.Double]
  var reversescale: scala.Boolean
  var showscale: scala.Boolean
  var size: scala.Double | js.Array[scala.Double]
  var sizemax: scala.Double
  var sizemin: scala.Double
  var sizemode: plotlyDotJsLib.plotlyDotJsLibStrings.diameter | plotlyDotJsLib.plotlyDotJsLibStrings.area
  var sizeref: scala.Double
  var symbol: java.lang.String | js.Array[java.lang.String]
  var width: scala.Double
}

object PlotMarker {
  @scala.inline
  def apply(
    autocolorscale: scala.Boolean,
    cauto: scala.Boolean,
    cmax: scala.Double,
    cmin: scala.Double,
    color: Color | js.Array[Color],
    colorbar: stdLib.Partial[ColorBar],
    colors: js.Array[Color],
    colorscale: java.lang.String | js.Array[java.lang.String] | (js.Array[js.Array[java.lang.String | scala.Double]]),
    gradient: plotlyDotJsLib.Anon_Color,
    line: stdLib.Partial[ScatterMarkerLine],
    maxdisplayed: scala.Double,
    opacity: scala.Double | js.Array[scala.Double],
    reversescale: scala.Boolean,
    showscale: scala.Boolean,
    size: scala.Double | js.Array[scala.Double],
    sizemax: scala.Double,
    sizemin: scala.Double,
    sizemode: plotlyDotJsLib.plotlyDotJsLibStrings.diameter | plotlyDotJsLib.plotlyDotJsLibStrings.area,
    sizeref: scala.Double,
    symbol: java.lang.String | js.Array[java.lang.String],
    width: scala.Double
  ): PlotMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autocolorscale")(autocolorscale)
    __obj.updateDynamic("cauto")(cauto)
    __obj.updateDynamic("cmax")(cmax)
    __obj.updateDynamic("cmin")(cmin)
    __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.updateDynamic("colorbar")(colorbar)
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("colorscale")(colorscale.asInstanceOf[js.Any])
    __obj.updateDynamic("gradient")(gradient)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("maxdisplayed")(maxdisplayed)
    __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.updateDynamic("reversescale")(reversescale)
    __obj.updateDynamic("showscale")(showscale)
    __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.updateDynamic("sizemax")(sizemax)
    __obj.updateDynamic("sizemin")(sizemin)
    __obj.updateDynamic("sizemode")(sizemode.asInstanceOf[js.Any])
    __obj.updateDynamic("sizeref")(sizeref)
    __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlotMarker]
  }
}

