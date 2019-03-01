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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    __obj.updateDynamic("automargin")(automargin)
    __obj.updateDynamic("autorange")(autorange.asInstanceOf[js.Any])
    __obj.updateDynamic("calendar")(calendar)
    __obj.updateDynamic("categoryarray")(categoryarray)
    __obj.updateDynamic("categoryorder")(categoryorder.asInstanceOf[js.Any])
    __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.updateDynamic("constrain")(constrain.asInstanceOf[js.Any])
    __obj.updateDynamic("constraintoward")(constraintoward.asInstanceOf[js.Any])
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("dtick")(dtick.asInstanceOf[js.Any])
    __obj.updateDynamic("exponentformat")(exponentformat.asInstanceOf[js.Any])
    __obj.updateDynamic("fixedrange")(fixedrange)
    __obj.updateDynamic("gridcolor")(gridcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("gridwidth")(gridwidth)
    __obj.updateDynamic("hoverformat")(hoverformat)
    __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.updateDynamic("linecolor")(linecolor.asInstanceOf[js.Any])
    __obj.updateDynamic("linewidth")(linewidth)
    __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    __obj.updateDynamic("nticks")(nticks)
    __obj.updateDynamic("overlaying")(overlaying.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("rangemode")(rangemode.asInstanceOf[js.Any])
    __obj.updateDynamic("rangeselector")(rangeselector)
    __obj.updateDynamic("rangeslider")(rangeslider)
    __obj.updateDynamic("scaleanchor")(scaleanchor)
    __obj.updateDynamic("scaleratio")(scaleratio)
    __obj.updateDynamic("separatethousands")(separatethousands)
    __obj.updateDynamic("showexponent")(showexponent.asInstanceOf[js.Any])
    __obj.updateDynamic("showgrid")(showgrid)
    __obj.updateDynamic("showline")(showline)
    __obj.updateDynamic("showspikes")(showspikes)
    __obj.updateDynamic("showticklabels")(showticklabels)
    __obj.updateDynamic("showtickprefix")(showtickprefix.asInstanceOf[js.Any])
    __obj.updateDynamic("showticksuffix")(showticksuffix.asInstanceOf[js.Any])
    __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    __obj.updateDynamic("spikecolor")(spikecolor.asInstanceOf[js.Any])
    __obj.updateDynamic("spikedash")(spikedash)
    __obj.updateDynamic("spikemode")(spikemode)
    __obj.updateDynamic("spikethickness")(spikethickness)
    __obj.updateDynamic("tick0")(tick0.asInstanceOf[js.Any])
    __obj.updateDynamic("tickangle")(tickangle)
    __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("tickfont")(tickfont)
    __obj.updateDynamic("tickformat")(tickformat)
    __obj.updateDynamic("ticklen")(ticklen)
    __obj.updateDynamic("tickmode")(tickmode.asInstanceOf[js.Any])
    __obj.updateDynamic("tickprefix")(tickprefix)
    __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.updateDynamic("ticksuffix")(ticksuffix)
    __obj.updateDynamic("ticktext")(ticktext)
    __obj.updateDynamic("tickvals")(tickvals)
    __obj.updateDynamic("tickwidth")(tickwidth)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titlefont")(titlefont)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("zeroline")(zeroline)
    __obj.updateDynamic("zerolinecolor")(zerolinecolor.asInstanceOf[js.Any])
    __obj.updateDynamic("zerolinewidth")(zerolinewidth)
    __obj.asInstanceOf[LayoutAxis]
  }
}

