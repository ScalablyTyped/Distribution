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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("autorange")(autorange.asInstanceOf[js.Any])
    __obj.updateDynamic("calendar")(calendar)
    __obj.updateDynamic("categoryarray")(categoryarray)
    __obj.updateDynamic("categoryorder")(categoryorder.asInstanceOf[js.Any])
    __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.updateDynamic("dtick")(dtick.asInstanceOf[js.Any])
    __obj.updateDynamic("exponentformat")(exponentformat.asInstanceOf[js.Any])
    __obj.updateDynamic("gridcolor")(gridcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("gridwidth")(gridwidth)
    __obj.updateDynamic("hoverformat")(hoverformat)
    __obj.updateDynamic("linecolor")(linecolor.asInstanceOf[js.Any])
    __obj.updateDynamic("linewidth")(linewidth)
    __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    __obj.updateDynamic("nticks")(nticks)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("rangemode")(rangemode.asInstanceOf[js.Any])
    __obj.updateDynamic("separatethousands")(separatethousands)
    __obj.updateDynamic("showexponent")(showexponent.asInstanceOf[js.Any])
    __obj.updateDynamic("showgrid")(showgrid)
    __obj.updateDynamic("showline")(showline)
    __obj.updateDynamic("showspikes")(showspikes)
    __obj.updateDynamic("showticklabels")(showticklabels)
    __obj.updateDynamic("showtickprefix")(showtickprefix.asInstanceOf[js.Any])
    __obj.updateDynamic("showticksuffix")(showticksuffix.asInstanceOf[js.Any])
    __obj.updateDynamic("spikecolor")(spikecolor.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Axis]
  }
}

