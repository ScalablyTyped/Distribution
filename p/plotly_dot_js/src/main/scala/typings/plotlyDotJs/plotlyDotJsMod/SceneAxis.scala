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

trait SceneAxis extends Axis {
  var backgroundcolor: Color
  var showaxeslabels: Boolean
  var showbackground: Boolean
  var spikesides: Boolean
}

object SceneAxis {
  @scala.inline
  def apply(
    autorange: `true` | `false` | reversed,
    backgroundcolor: Color,
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
    showaxeslabels: Boolean,
    showbackground: Boolean,
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    spikecolor: Color,
    spikesides: Boolean,
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
  ): SceneAxis = {
    val __obj = js.Dynamic.literal(autorange = autorange.asInstanceOf[js.Any], backgroundcolor = backgroundcolor.asInstanceOf[js.Any], calendar = calendar, categoryarray = categoryarray, categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth, hoverformat = hoverformat, linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth, mirror = mirror.asInstanceOf[js.Any], nticks = nticks, range = range, rangemode = rangemode.asInstanceOf[js.Any], separatethousands = separatethousands, showaxeslabels = showaxeslabels, showbackground = showbackground, showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid, showline = showline, showspikes = showspikes, showticklabels = showticklabels, showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikesides = spikesides, spikethickness = spikethickness, tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle, tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont, tickformat = tickformat, ticklen = ticklen, tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix, ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix, ticktext = ticktext, tickvals = tickvals, tickwidth = tickwidth, title = title, titlefont = titlefont, visible = visible, zeroline = zeroline, zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SceneAxis]
  }
}

