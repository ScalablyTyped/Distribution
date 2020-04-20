package typings.plotlyJs.mod

import typings.plotlyJs.PartialDataTitle
import typings.plotlyJs.PartialFont
import typings.plotlyJs.PartialRangeSelector
import typings.plotlyJs.PartialRangeSlider
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsBooleans.`true`
import typings.plotlyJs.plotlyJsStrings.B
import typings.plotlyJs.plotlyJsStrings.E
import typings.plotlyJs.plotlyJsStrings.SI
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.`above traces`
import typings.plotlyJs.plotlyJsStrings.`below traces`
import typings.plotlyJs.plotlyJsStrings.`category ascending`
import typings.plotlyJs.plotlyJsStrings.`category descending`
import typings.plotlyJs.plotlyJsStrings.`max ascending`
import typings.plotlyJs.plotlyJsStrings.`max descending`
import typings.plotlyJs.plotlyJsStrings.`mean ascending`
import typings.plotlyJs.plotlyJsStrings.`mean descending`
import typings.plotlyJs.plotlyJsStrings.`median ascending`
import typings.plotlyJs.plotlyJsStrings.`median descending`
import typings.plotlyJs.plotlyJsStrings.`min ascending`
import typings.plotlyJs.plotlyJsStrings.`min descending`
import typings.plotlyJs.plotlyJsStrings.`sum ascending`
import typings.plotlyJs.plotlyJsStrings.`sum descending`
import typings.plotlyJs.plotlyJsStrings.`total ascending`
import typings.plotlyJs.plotlyJsStrings.`total descending`
import typings.plotlyJs.plotlyJsStrings.all
import typings.plotlyJs.plotlyJsStrings.allticks
import typings.plotlyJs.plotlyJsStrings.array
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.clockwise
import typings.plotlyJs.plotlyJsStrings.counterclockwise
import typings.plotlyJs.plotlyJsStrings.domain
import typings.plotlyJs.plotlyJsStrings.e_
import typings.plotlyJs.plotlyJsStrings.first
import typings.plotlyJs.plotlyJsStrings.free
import typings.plotlyJs.plotlyJsStrings.inside
import typings.plotlyJs.plotlyJsStrings.last
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.nonnegative
import typings.plotlyJs.plotlyJsStrings.normal
import typings.plotlyJs.plotlyJsStrings.outside
import typings.plotlyJs.plotlyJsStrings.power
import typings.plotlyJs.plotlyJsStrings.range
import typings.plotlyJs.plotlyJsStrings.reversed
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.ticks
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.tozero
import typings.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAxis extends Axis {
  var anchor: free | AxisName
  var angle: js.Any
  var automargin: Boolean
  var autotick: Boolean
  var constrain: range | domain
  var constraintoward: left | center | right | top | middle | bottom
  var domain: js.Array[Double]
  var fixedrange: Boolean
  var layer: (`above traces`) | (`below traces`)
  var overlaying: free | AxisName
  var position: Double
  var rangeselector: PartialRangeSelector
  var rangeslider: PartialRangeSlider
  var scaleanchor: AxisName
  var scaleratio: Double
  var side: top | bottom | left | right | clockwise | counterclockwise
  var spikedash: String
  var spikemode: String
}

object LayoutAxis {
  @scala.inline
  def apply(
    anchor: free | AxisName,
    angle: js.Any,
    automargin: Boolean,
    autorange: `true` | `false` | reversed,
    autotick: Boolean,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`),
    color: Color,
    constrain: range | domain,
    constraintoward: left | center | right | top | middle | bottom,
    domain: js.Array[Double],
    dtick: Double | String,
    exponentformat: none | e_ | E | power | SI | B,
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
    rangeselector: PartialRangeSelector,
    rangeslider: PartialRangeSlider,
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
    side: top | bottom | left | right | clockwise | counterclockwise,
    spikecolor: Color,
    spikedash: String,
    spikemode: String,
    spikethickness: Double,
    tick0: Double | String,
    tickangle: Double,
    tickcolor: Color,
    tickfont: PartialFont,
    tickformat: String,
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | _empty,
    ticksuffix: String,
    ticktext: js.Array[String],
    tickvals: js.Array[_],
    tickwidth: Double,
    title: String | PartialDataTitle,
    titlefont: PartialFont,
    `type`: AxisType,
    visible: Boolean,
    zeroline: Boolean,
    zerolinecolor: Color,
    zerolinewidth: Double
  ): LayoutAxis = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], automargin = automargin.asInstanceOf[js.Any], autorange = autorange.asInstanceOf[js.Any], autotick = autotick.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], categoryarray = categoryarray.asInstanceOf[js.Any], categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constrain = constrain.asInstanceOf[js.Any], constraintoward = constraintoward.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], fixedrange = fixedrange.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth.asInstanceOf[js.Any], hoverformat = hoverformat.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], overlaying = overlaying.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangemode = rangemode.asInstanceOf[js.Any], rangeselector = rangeselector.asInstanceOf[js.Any], rangeslider = rangeslider.asInstanceOf[js.Any], scaleanchor = scaleanchor.asInstanceOf[js.Any], scaleratio = scaleratio.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid.asInstanceOf[js.Any], showline = showline.asInstanceOf[js.Any], showspikes = showspikes.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikedash = spikedash.asInstanceOf[js.Any], spikemode = spikemode.asInstanceOf[js.Any], spikethickness = spikethickness.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zeroline = zeroline.asInstanceOf[js.Any], zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAxis]
  }
}

