package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var annotations: js.Array[stdLib.Partial[Annotations]]
  var autosize: scala.Boolean
  var barmode: plotlyDotJsLib.plotlyDotJsLibStrings.stack | plotlyDotJsLib.plotlyDotJsLibStrings.group | plotlyDotJsLib.plotlyDotJsLibStrings.overlay | plotlyDotJsLib.plotlyDotJsLibStrings.relative
  var calendar: Calendar
   // TODO
  var direction: plotlyDotJsLib.plotlyDotJsLibStrings.clockwise | plotlyDotJsLib.plotlyDotJsLibStrings.counterclockwise
  var dragmode: plotlyDotJsLib.plotlyDotJsLibStrings.zoom | plotlyDotJsLib.plotlyDotJsLibStrings.pan | plotlyDotJsLib.plotlyDotJsLibStrings.select | plotlyDotJsLib.plotlyDotJsLibStrings.lasso | plotlyDotJsLib.plotlyDotJsLibStrings.orbit | plotlyDotJsLib.plotlyDotJsLibStrings.turntable
  var font: stdLib.Partial[Font]
  var height: scala.Double
  var hidesources: scala.Boolean
  var hoverlabel: stdLib.Partial[Label]
  var hovermode: plotlyDotJsLib.plotlyDotJsLibStrings.closest | plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.y | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
  var images: js.Array[stdLib.Partial[Image]]
  var legend: stdLib.Partial[Legend]
  var margin: stdLib.Partial[Margin]
  var orientation: scala.Double
  var paper_bgcolor: Color
  var plot_bgcolor: Color
   // TODO
  var radialaxis: stdLib.Partial[Axis]
  var scene: stdLib.Partial[Scene]
  var separators: java.lang.String
  var shapes: js.Array[stdLib.Partial[Shape]]
  var showlegend: scala.Boolean
   // TODO
  var sliders: js.Array[stdLib.Partial[Slider]]
  var title: java.lang.String
  var titlefont: stdLib.Partial[Font]
  var width: scala.Double
  var xaxis: stdLib.Partial[LayoutAxis]
  var `xaxis.autorange`: scala.Boolean
  var `xaxis.range`: js.Tuple2[Datum, Datum]
  var `xaxis.range[0]`: Datum
  var `xaxis.range[1]`: Datum
  var `xaxis.type`: AxisType
  var xaxis2: stdLib.Partial[LayoutAxis]
  var xaxis3: stdLib.Partial[LayoutAxis]
  var xaxis4: stdLib.Partial[LayoutAxis]
  var xaxis5: stdLib.Partial[LayoutAxis]
  var xaxis6: stdLib.Partial[LayoutAxis]
  var xaxis7: stdLib.Partial[LayoutAxis]
  var xaxis8: stdLib.Partial[LayoutAxis]
  var xaxis9: stdLib.Partial[LayoutAxis]
  var yaxis: stdLib.Partial[LayoutAxis]
  var `yaxis.autorange`: scala.Boolean
  var `yaxis.range`: js.Tuple2[Datum, Datum]
  var `yaxis.range[0]`: Datum
  var `yaxis.range[1]`: Datum
  var `yaxis.type`: AxisType
  var yaxis2: stdLib.Partial[LayoutAxis]
  var yaxis3: stdLib.Partial[LayoutAxis]
  var yaxis4: stdLib.Partial[LayoutAxis]
  var yaxis5: stdLib.Partial[LayoutAxis]
  var yaxis6: stdLib.Partial[LayoutAxis]
  var yaxis7: stdLib.Partial[LayoutAxis]
  var yaxis8: stdLib.Partial[LayoutAxis]
  var yaxis9: stdLib.Partial[LayoutAxis]
}

