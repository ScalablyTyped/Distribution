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

object Axis {
  @scala.inline
  def apply(
    autorange: plotlyDotJsLib.plotlyDotJsLibNumbers.`true` | plotlyDotJsLib.plotlyDotJsLibNumbers.`false` | plotlyDotJsLib.plotlyDotJsLibStrings.reversed,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: plotlyDotJsLib.plotlyDotJsLibStrings.trace | (plotlyDotJsLib.plotlyDotJsLibStrings.`category ascending`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`category descending`) | plotlyDotJsLib.plotlyDotJsLibStrings.array,
    color: Color,
    dtick: scala.Double | java.lang.String,
    exponentformat: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.e | plotlyDotJsLib.plotlyDotJsLibStrings.E | plotlyDotJsLib.plotlyDotJsLibStrings.power | plotlyDotJsLib.plotlyDotJsLibStrings.SI | plotlyDotJsLib.plotlyDotJsLibStrings.B,
    gridcolor: Color,
    gridwidth: scala.Double,
    hoverformat: java.lang.String,
    linecolor: Color,
    linewidth: scala.Double,
    mirror: plotlyDotJsLib.plotlyDotJsLibNumbers.`true` | plotlyDotJsLib.plotlyDotJsLibStrings.ticks | plotlyDotJsLib.plotlyDotJsLibNumbers.`false` | plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.allticks,
    nticks: scala.Double,
    range: js.Array[_],
    rangemode: plotlyDotJsLib.plotlyDotJsLibStrings.normal | plotlyDotJsLib.plotlyDotJsLibStrings.tozero | plotlyDotJsLib.plotlyDotJsLibStrings.nonnegative,
    separatethousands: scala.Boolean,
    showexponent: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    showgrid: scala.Boolean,
    showline: scala.Boolean,
    showspikes: scala.Boolean,
    showticklabels: scala.Boolean,
    showtickprefix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    showticksuffix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    spikecolor: Color,
    spikethickness: scala.Double,
    tick0: scala.Double | java.lang.String,
    tickangle: scala.Double,
    tickcolor: Color,
    tickfont: stdLib.Partial[Font],
    tickformat: java.lang.String,
    ticklen: scala.Double,
    tickmode: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.array,
    tickprefix: java.lang.String,
    ticks: plotlyDotJsLib.plotlyDotJsLibStrings.outside | plotlyDotJsLib.plotlyDotJsLibStrings.inside | plotlyDotJsLib.plotlyDotJsLibStrings.Empty,
    ticksuffix: java.lang.String,
    ticktext: js.Array[java.lang.String],
    tickvals: js.Array[_],
    tickwidth: scala.Double,
    title: java.lang.String,
    titlefont: stdLib.Partial[Font],
    `type`: AxisType,
    visible: scala.Boolean,
    zeroline: scala.Boolean,
    zerolinecolor: Color,
    zerolinewidth: scala.Double
  ): Axis = {
    val __obj = js.Dynamic.literal(autorange = autorange.asInstanceOf[js.Any], calendar = calendar, categoryarray = categoryarray, categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth, hoverformat = hoverformat, linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth, mirror = mirror.asInstanceOf[js.Any], nticks = nticks, range = range, rangemode = rangemode.asInstanceOf[js.Any], separatethousands = separatethousands, showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid, showline = showline, showspikes = showspikes, showticklabels = showticklabels, showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikethickness = spikethickness, tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle, tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont, tickformat = tickformat, ticklen = ticklen, tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix, ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix, ticktext = ticktext, tickvals = tickvals, tickwidth = tickwidth, title = title, titlefont = titlefont, visible = visible, zeroline = zeroline, zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Axis]
  }
}

