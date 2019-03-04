package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAxis extends Axis {
  var anchor: plotlyDotJsLib.plotlyDotJsLibStrings.free | AxisName
  var automargin: scala.Boolean
  var constrain: plotlyDotJsLib.plotlyDotJsLibStrings.range | plotlyDotJsLib.plotlyDotJsLibStrings.domain
  var constraintoward: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  var domain: js.Array[scala.Double]
  var fixedrange: scala.Boolean
  var layer: (plotlyDotJsLib.plotlyDotJsLibStrings.`above traces`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`below traces`)
  var overlaying: plotlyDotJsLib.plotlyDotJsLibStrings.free | AxisName
  var position: scala.Double
  var rangeselector: stdLib.Partial[RangeSelector]
  var rangeslider: stdLib.Partial[RangeSlider]
  var scaleanchor: AxisName
  var scaleratio: scala.Double
  var side: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.bottom | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.right
  var spikedash: java.lang.String
  var spikemode: java.lang.String
}

object LayoutAxis {
  @scala.inline
  def apply(
    anchor: plotlyDotJsLib.plotlyDotJsLibStrings.free | AxisName,
    automargin: scala.Boolean,
    autorange: plotlyDotJsLib.plotlyDotJsLibNumbers.`true` | plotlyDotJsLib.plotlyDotJsLibNumbers.`false` | plotlyDotJsLib.plotlyDotJsLibStrings.reversed,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: plotlyDotJsLib.plotlyDotJsLibStrings.trace | (plotlyDotJsLib.plotlyDotJsLibStrings.`category ascending`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`category descending`) | plotlyDotJsLib.plotlyDotJsLibStrings.array,
    color: Color,
    constrain: plotlyDotJsLib.plotlyDotJsLibStrings.range | plotlyDotJsLib.plotlyDotJsLibStrings.domain,
    constraintoward: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom,
    domain: js.Array[scala.Double],
    dtick: scala.Double | java.lang.String,
    exponentformat: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.e | plotlyDotJsLib.plotlyDotJsLibStrings.E | plotlyDotJsLib.plotlyDotJsLibStrings.power | plotlyDotJsLib.plotlyDotJsLibStrings.SI | plotlyDotJsLib.plotlyDotJsLibStrings.B,
    fixedrange: scala.Boolean,
    gridcolor: Color,
    gridwidth: scala.Double,
    hoverformat: java.lang.String,
    layer: (plotlyDotJsLib.plotlyDotJsLibStrings.`above traces`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`below traces`),
    linecolor: Color,
    linewidth: scala.Double,
    mirror: plotlyDotJsLib.plotlyDotJsLibNumbers.`true` | plotlyDotJsLib.plotlyDotJsLibStrings.ticks | plotlyDotJsLib.plotlyDotJsLibNumbers.`false` | plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.allticks,
    nticks: scala.Double,
    overlaying: plotlyDotJsLib.plotlyDotJsLibStrings.free | AxisName,
    position: scala.Double,
    range: js.Array[_],
    rangemode: plotlyDotJsLib.plotlyDotJsLibStrings.normal | plotlyDotJsLib.plotlyDotJsLibStrings.tozero | plotlyDotJsLib.plotlyDotJsLibStrings.nonnegative,
    rangeselector: stdLib.Partial[RangeSelector],
    rangeslider: stdLib.Partial[RangeSlider],
    scaleanchor: AxisName,
    scaleratio: scala.Double,
    separatethousands: scala.Boolean,
    showexponent: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    showgrid: scala.Boolean,
    showline: scala.Boolean,
    showspikes: scala.Boolean,
    showticklabels: scala.Boolean,
    showtickprefix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    showticksuffix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    side: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.bottom | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.right,
    spikecolor: Color,
    spikedash: java.lang.String,
    spikemode: java.lang.String,
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
  ): LayoutAxis = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], automargin = automargin, autorange = autorange.asInstanceOf[js.Any], calendar = calendar, categoryarray = categoryarray, categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constrain = constrain.asInstanceOf[js.Any], constraintoward = constraintoward.asInstanceOf[js.Any], domain = domain, dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], fixedrange = fixedrange, gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth, hoverformat = hoverformat, layer = layer.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth, mirror = mirror.asInstanceOf[js.Any], nticks = nticks, overlaying = overlaying.asInstanceOf[js.Any], position = position, range = range, rangemode = rangemode.asInstanceOf[js.Any], rangeselector = rangeselector, rangeslider = rangeslider, scaleanchor = scaleanchor, scaleratio = scaleratio, separatethousands = separatethousands, showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid, showline = showline, showspikes = showspikes, showticklabels = showticklabels, showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikedash = spikedash, spikemode = spikemode, spikethickness = spikethickness, tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle, tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont, tickformat = tickformat, ticklen = ticklen, tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix, ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix, ticktext = ticktext, tickvals = tickvals, tickwidth = tickwidth, title = title, titlefont = titlefont, visible = visible, zeroline = zeroline, zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayoutAxis]
  }
}

