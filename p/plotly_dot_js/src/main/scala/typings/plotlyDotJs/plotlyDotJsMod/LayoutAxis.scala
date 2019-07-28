package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsNumbers.`false`
import typings.plotlyDotJs.plotlyDotJsNumbers.`true`
import typings.plotlyDotJs.plotlyDotJsStrings.B
import typings.plotlyDotJs.plotlyDotJsStrings.E
import typings.plotlyDotJs.plotlyDotJsStrings.Empty
import typings.plotlyDotJs.plotlyDotJsStrings.SI
import typings.plotlyDotJs.plotlyDotJsStrings.`above traces`
import typings.plotlyDotJs.plotlyDotJsStrings.`below traces`
import typings.plotlyDotJs.plotlyDotJsStrings.`category ascending`
import typings.plotlyDotJs.plotlyDotJsStrings.`category descending`
import typings.plotlyDotJs.plotlyDotJsStrings.all
import typings.plotlyDotJs.plotlyDotJsStrings.allticks
import typings.plotlyDotJs.plotlyDotJsStrings.array
import typings.plotlyDotJs.plotlyDotJsStrings.auto
import typings.plotlyDotJs.plotlyDotJsStrings.bottom
import typings.plotlyDotJs.plotlyDotJsStrings.center
import typings.plotlyDotJs.plotlyDotJsStrings.domain
import typings.plotlyDotJs.plotlyDotJsStrings.e
import typings.plotlyDotJs.plotlyDotJsStrings.first
import typings.plotlyDotJs.plotlyDotJsStrings.free
import typings.plotlyDotJs.plotlyDotJsStrings.inside
import typings.plotlyDotJs.plotlyDotJsStrings.last
import typings.plotlyDotJs.plotlyDotJsStrings.left
import typings.plotlyDotJs.plotlyDotJsStrings.linear
import typings.plotlyDotJs.plotlyDotJsStrings.middle
import typings.plotlyDotJs.plotlyDotJsStrings.none
import typings.plotlyDotJs.plotlyDotJsStrings.nonnegative
import typings.plotlyDotJs.plotlyDotJsStrings.normal
import typings.plotlyDotJs.plotlyDotJsStrings.outside
import typings.plotlyDotJs.plotlyDotJsStrings.power
import typings.plotlyDotJs.plotlyDotJsStrings.range
import typings.plotlyDotJs.plotlyDotJsStrings.reversed
import typings.plotlyDotJs.plotlyDotJsStrings.right
import typings.plotlyDotJs.plotlyDotJsStrings.ticks
import typings.plotlyDotJs.plotlyDotJsStrings.top
import typings.plotlyDotJs.plotlyDotJsStrings.tozero
import typings.plotlyDotJs.plotlyDotJsStrings.trace
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAxis extends Axis {
  var anchor: free | AxisName
  var automargin: Boolean
  var constrain: range | domain
  var constraintoward: left | center | right | top | middle | bottom
  var domain: js.Array[Double]
  var fixedrange: Boolean
  var layer: (`above traces`) | (`below traces`)
  var overlaying: free | AxisName
  var position: Double
  var rangeselector: Partial[RangeSelector]
  var rangeslider: Partial[RangeSlider]
  var scaleanchor: AxisName
  var scaleratio: Double
  var side: top | bottom | left | right
  var spikedash: String
  var spikemode: String
}

object LayoutAxis {
  @scala.inline
  def apply(
    anchor: free | AxisName,
    automargin: Boolean,
    autorange: `true` | `false` | reversed,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array,
    color: Color,
    constrain: range | domain,
    constraintoward: left | center | right | top | middle | bottom,
    domain: js.Array[Double],
    dtick: Double | String,
    exponentformat: none | e | E | power | SI | B,
    fixedrange: Boolean,
    gridcolor: Color,
    gridwidth: Double,
    hoverformat: String,
    layer: (`above traces`) | (`below traces`),
    linecolor: Color,
    linewidth: Double,
    mirror: `true` | ticks | `false` | all | allticks,
    nticks: Double,
    overlaying: free | AxisName,
    position: Double,
    range: js.Array[_],
    rangemode: normal | tozero | nonnegative,
    rangeselector: Partial[RangeSelector],
    rangeslider: Partial[RangeSlider],
    scaleanchor: AxisName,
    scaleratio: Double,
    separatethousands: Boolean,
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    side: top | bottom | left | right,
    spikecolor: Color,
    spikedash: String,
    spikemode: String,
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
  ): LayoutAxis = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], automargin = automargin, autorange = autorange.asInstanceOf[js.Any], calendar = calendar, categoryarray = categoryarray, categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constrain = constrain.asInstanceOf[js.Any], constraintoward = constraintoward.asInstanceOf[js.Any], domain = domain, dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], fixedrange = fixedrange, gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth, hoverformat = hoverformat, layer = layer.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth, mirror = mirror.asInstanceOf[js.Any], nticks = nticks, overlaying = overlaying.asInstanceOf[js.Any], position = position, range = range, rangemode = rangemode.asInstanceOf[js.Any], rangeselector = rangeselector, rangeslider = rangeslider, scaleanchor = scaleanchor, scaleratio = scaleratio, separatethousands = separatethousands, showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid, showline = showline, showspikes = showspikes, showticklabels = showticklabels, showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikedash = spikedash, spikemode = spikemode, spikethickness = spikethickness, tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle, tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont, tickformat = tickformat, ticklen = ticklen, tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix, ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix, ticktext = ticktext, tickvals = tickvals, tickwidth = tickwidth, title = title, titlefont = titlefont, visible = visible, zeroline = zeroline, zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayoutAxis]
  }
}

