package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotData extends js.Object {
  var autobinx: scala.Boolean
  var boxmean: scala.Boolean | plotlyDotJsLib.plotlyDotJsLibStrings.sd
  var colorscale: java.lang.String | (js.Array[js.Tuple2[scala.Double, java.lang.String]])
  var connectgaps: scala.Boolean
  var error_x: ErrorBar
  var error_y: ErrorBar
  var fill: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.tozeroy | plotlyDotJsLib.plotlyDotJsLibStrings.tozerox | plotlyDotJsLib.plotlyDotJsLibStrings.tonexty | plotlyDotJsLib.plotlyDotJsLibStrings.tonextx | plotlyDotJsLib.plotlyDotJsLibStrings.toself | plotlyDotJsLib.plotlyDotJsLibStrings.tonext
  var fillcolor: java.lang.String
  var hoverinfo: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.name | plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.skip | plotlyDotJsLib.plotlyDotJsLibStrings.text | plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.`x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y+name`
  var hoverlabel: stdLib.Partial[Label]
  var hoveron: plotlyDotJsLib.plotlyDotJsLibStrings.points | plotlyDotJsLib.plotlyDotJsLibStrings.fills
  var legendgroup: java.lang.String
  var line: stdLib.Partial[ScatterLine]
  var `line.color`: Color
  var `line.dash`: Dash
  var `line.shape`: plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.spline | plotlyDotJsLib.plotlyDotJsLibStrings.hv | plotlyDotJsLib.plotlyDotJsLibStrings.vh | plotlyDotJsLib.plotlyDotJsLibStrings.hvh | plotlyDotJsLib.plotlyDotJsLibStrings.vhv
  var `line.simplify`: scala.Boolean
  var `line.smoothing`: scala.Double
  var `line.width`: scala.Double
  var marker: stdLib.Partial[PlotMarker]
   // Drawing.symbolList
  var `marker.color`: Color
  var `marker.line`: stdLib.Partial[ScatterMarkerLine]
  var `marker.maxdisplayed`: scala.Double
  var `marker.opacity`: scala.Double | js.Array[scala.Double]
  var `marker.showscale`: scala.Boolean
  var `marker.size`: scala.Double | js.Array[scala.Double]
  var `marker.sizemax`: scala.Double
  var `marker.sizemin`: scala.Double
  var `marker.sizemode`: plotlyDotJsLib.plotlyDotJsLibStrings.diameter | plotlyDotJsLib.plotlyDotJsLibStrings.area
  var `marker.sizeref`: scala.Double
  var `marker.symbol`: java.lang.String | js.Array[java.lang.String]
   // TODO
  var mode: plotlyDotJsLib.plotlyDotJsLibStrings.lines | plotlyDotJsLib.plotlyDotJsLibStrings.markers | plotlyDotJsLib.plotlyDotJsLibStrings.text | plotlyDotJsLib.plotlyDotJsLibStrings.`lines+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+lines` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+lines+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var name: java.lang.String
  var orientation: plotlyDotJsLib.plotlyDotJsLibStrings.v | plotlyDotJsLib.plotlyDotJsLibStrings.h
  var text: java.lang.String | js.Array[java.lang.String]
  var transforms: js.Array[DataTransform]
  var transpose: scala.Boolean
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.bar | plotlyDotJsLib.plotlyDotJsLibStrings.box | plotlyDotJsLib.plotlyDotJsLibStrings.candlestick | plotlyDotJsLib.plotlyDotJsLibStrings.choropleth | plotlyDotJsLib.plotlyDotJsLibStrings.contour | plotlyDotJsLib.plotlyDotJsLibStrings.heatmap | plotlyDotJsLib.plotlyDotJsLibStrings.histogram | plotlyDotJsLib.plotlyDotJsLibStrings.mesh3d | plotlyDotJsLib.plotlyDotJsLibStrings.ohlc | plotlyDotJsLib.plotlyDotJsLibStrings.parcoords | plotlyDotJsLib.plotlyDotJsLibStrings.pointcloud | plotlyDotJsLib.plotlyDotJsLibStrings.scatter | plotlyDotJsLib.plotlyDotJsLibStrings.scatter3d | plotlyDotJsLib.plotlyDotJsLibStrings.scattergeo | plotlyDotJsLib.plotlyDotJsLibStrings.scattergl | plotlyDotJsLib.plotlyDotJsLibStrings.scatterternary | plotlyDotJsLib.plotlyDotJsLibStrings.surface
  var visible: scala.Boolean | plotlyDotJsLib.plotlyDotJsLibStrings.legendonly
  var x: js.Array[Datum] | js.Array[js.Array[Datum]] | TypedArray
  var xaxis: java.lang.String
  var xbins: plotlyDotJsLib.Anon_End
  var xgap: scala.Double
  var xy: stdLib.Float32Array
  var y: js.Array[Datum] | js.Array[js.Array[Datum]] | TypedArray
  var yaxis: java.lang.String
  var ygap: scala.Double
  var z: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray
  var zsmooth: plotlyDotJsLib.plotlyDotJsLibStrings.fast | plotlyDotJsLib.plotlyDotJsLibStrings.best | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
}

