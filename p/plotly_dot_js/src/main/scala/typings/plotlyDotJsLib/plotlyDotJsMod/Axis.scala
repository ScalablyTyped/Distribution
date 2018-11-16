package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Axis extends js.Object {
  var autorange: plotlyDotJsLib.plotlyDotJsLibNumbers.`true` | plotlyDotJsLib.plotlyDotJsLibNumbers.`false` | plotlyDotJsLib.plotlyDotJsLibStrings.reversed
  var calendar: Calendar
  var categoryarray: js.Array[_]
  var categoryorder: plotlyDotJsLib.plotlyDotJsLibStrings.trace | (plotlyDotJsLib.plotlyDotJsLibStrings.`category ascending`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`category descending`) | plotlyDotJsLib.plotlyDotJsLibStrings.array
  var color: Color
  var dtick: scala.Double | java.lang.String
  var exponentformat: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.e | plotlyDotJsLib.plotlyDotJsLibStrings.E | plotlyDotJsLib.plotlyDotJsLibStrings.power | plotlyDotJsLib.plotlyDotJsLibStrings.SI | plotlyDotJsLib.plotlyDotJsLibStrings.B
  var gridcolor: Color
  var gridwidth: scala.Double
  var hoverformat: java.lang.String
  var linecolor: Color
  var linewidth: scala.Double
  var mirror: plotlyDotJsLib.plotlyDotJsLibNumbers.`true` | plotlyDotJsLib.plotlyDotJsLibStrings.ticks | plotlyDotJsLib.plotlyDotJsLibNumbers.`false` | plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.allticks
  var nticks: scala.Double
  var range: js.Array[_]
  var rangemode: plotlyDotJsLib.plotlyDotJsLibStrings.normal | plotlyDotJsLib.plotlyDotJsLibStrings.tozero | plotlyDotJsLib.plotlyDotJsLibStrings.nonnegative
  var separatethousands: scala.Boolean
  var showexponent: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var showgrid: scala.Boolean
  var showline: scala.Boolean
  var showspikes: scala.Boolean
  var showticklabels: scala.Boolean
  var showtickprefix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var showticksuffix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var spikecolor: Color
  var spikethickness: scala.Double
  var tick0: scala.Double | java.lang.String
  var tickangle: scala.Double
  var tickcolor: Color
  var tickfont: stdLib.Partial[Font]
  var tickformat: java.lang.String
  var ticklen: scala.Double
  var tickmode: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.array
  var tickprefix: java.lang.String
  var ticks: plotlyDotJsLib.plotlyDotJsLibStrings.outside | plotlyDotJsLib.plotlyDotJsLibStrings.inside | plotlyDotJsLib.plotlyDotJsLibStrings.Empty
  var ticksuffix: java.lang.String
  var ticktext: js.Array[java.lang.String]
  var tickvals: js.Array[_]
  var tickwidth: scala.Double
  var title: java.lang.String
  var titlefont: stdLib.Partial[Font]
  var `type`: AxisType
  var visible: scala.Boolean
  var zeroline: scala.Boolean
  var zerolinecolor: Color
  var zerolinewidth: scala.Double
}

