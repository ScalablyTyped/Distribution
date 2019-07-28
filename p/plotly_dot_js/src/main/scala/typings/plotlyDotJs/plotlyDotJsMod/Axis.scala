package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsNumbers.`false`
import typings.plotlyDotJs.plotlyDotJsNumbers.`true`
import typings.plotlyDotJs.plotlyDotJsStrings.B
import typings.plotlyDotJs.plotlyDotJsStrings.E
import typings.plotlyDotJs.plotlyDotJsStrings.Empty
import typings.plotlyDotJs.plotlyDotJsStrings.SI
import typings.plotlyDotJs.plotlyDotJsStrings.`category ascending`
import typings.plotlyDotJs.plotlyDotJsStrings.`category descending`
import typings.plotlyDotJs.plotlyDotJsStrings.all
import typings.plotlyDotJs.plotlyDotJsStrings.allticks
import typings.plotlyDotJs.plotlyDotJsStrings.array
import typings.plotlyDotJs.plotlyDotJsStrings.auto
import typings.plotlyDotJs.plotlyDotJsStrings.e
import typings.plotlyDotJs.plotlyDotJsStrings.first
import typings.plotlyDotJs.plotlyDotJsStrings.inside
import typings.plotlyDotJs.plotlyDotJsStrings.last
import typings.plotlyDotJs.plotlyDotJsStrings.linear
import typings.plotlyDotJs.plotlyDotJsStrings.none
import typings.plotlyDotJs.plotlyDotJsStrings.nonnegative
import typings.plotlyDotJs.plotlyDotJsStrings.normal
import typings.plotlyDotJs.plotlyDotJsStrings.outside
import typings.plotlyDotJs.plotlyDotJsStrings.power
import typings.plotlyDotJs.plotlyDotJsStrings.reversed
import typings.plotlyDotJs.plotlyDotJsStrings.ticks
import typings.plotlyDotJs.plotlyDotJsStrings.tozero
import typings.plotlyDotJs.plotlyDotJsStrings.trace
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
  var autorange: `true` | `false` | reversed
  var calendar: Calendar
  var categoryarray: js.Array[_]
  var categoryorder: trace | (`category ascending`) | (`category descending`) | array
  var color: Color
  var dtick: Double | String
  var exponentformat: none | e | E | power | SI | B
  var gridcolor: Color
  var gridwidth: Double
  var hoverformat: String
  var linecolor: Color
  var linewidth: Double
  var mirror: `true` | ticks | `false` | all | allticks
  var nticks: Double
  var range: js.Array[_]
  var rangemode: normal | tozero | nonnegative
  var separatethousands: Boolean
  var showexponent: all | first | last | none
  var showgrid: Boolean
  var showline: Boolean
  var showspikes: Boolean
  var showticklabels: Boolean
  var showtickprefix: all | first | last | none
  var showticksuffix: all | first | last | none
  var spikecolor: Color
  var spikethickness: Double
  var tick0: Double | String
  var tickangle: Double
  var tickcolor: Color
  var tickfont: Partial[Font]
  var tickformat: String
  var ticklen: Double
  var tickmode: auto | linear | array
  var tickprefix: String
  var ticks: outside | inside | Empty
  var ticksuffix: String
  var ticktext: js.Array[String]
  var tickvals: js.Array[_]
  var tickwidth: Double
  var title: String
  var titlefont: Partial[Font]
  var `type`: AxisType
  var visible: Boolean
  var zeroline: Boolean
  var zerolinecolor: Color
  var zerolinewidth: Double
}

object Axis {
  @scala.inline
  def apply(
    autorange: `true` | `false` | reversed,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array,
    color: Color,
    dtick: Double | String,
    exponentformat: none | e | E | power | SI | B,
    gridcolor: Color,
    gridwidth: Double,
    hoverformat: String,
    linecolor: Color,
    linewidth: Double,
    mirror: `true` | ticks | `false` | all | allticks,
    nticks: Double,
    range: js.Array[_],
    rangemode: normal | tozero | nonnegative,
    separatethousands: Boolean,
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    spikecolor: Color,
    spikethickness: Double,
    tick0: Double | String,
    tickangle: Double,
    tickcolor: Color,
    tickfont: Partial[Font],
    tickformat: String,
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | Empty,
    ticksuffix: String,
    ticktext: js.Array[String],
    tickvals: js.Array[_],
    tickwidth: Double,
    title: String,
    titlefont: Partial[Font],
    `type`: AxisType,
    visible: Boolean,
    zeroline: Boolean,
    zerolinecolor: Color,
    zerolinewidth: Double
  ): Axis = {
    val __obj = js.Dynamic.literal(autorange = autorange.asInstanceOf[js.Any], calendar = calendar, categoryarray = categoryarray, categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth, hoverformat = hoverformat, linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth, mirror = mirror.asInstanceOf[js.Any], nticks = nticks, range = range, rangemode = rangemode.asInstanceOf[js.Any], separatethousands = separatethousands, showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid, showline = showline, showspikes = showspikes, showticklabels = showticklabels, showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikethickness = spikethickness, tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle, tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont, tickformat = tickformat, ticklen = ticklen, tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix, ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix, ticktext = ticktext, tickvals = tickvals, tickwidth = tickwidth, title = title, titlefont = titlefont, visible = visible, zeroline = zeroline, zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Axis]
  }
}

