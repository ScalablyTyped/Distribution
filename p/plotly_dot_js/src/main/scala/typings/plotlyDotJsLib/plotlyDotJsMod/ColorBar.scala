package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorBar extends js.Object {
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Color
  var dtick: scala.Double | java.lang.String
  var exponentformat: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.e | plotlyDotJsLib.plotlyDotJsLibStrings.E | plotlyDotJsLib.plotlyDotJsLibStrings.power | plotlyDotJsLib.plotlyDotJsLibStrings.SI | plotlyDotJsLib.plotlyDotJsLibStrings.B
  var len: scala.Double
  var lenmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels
  var nticks: scala.Double
  var outlinecolor: Color
  var outlinewidth: scala.Double
  var separatethousands: scala.Boolean
  var showexponent: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var showticklabels: scala.Boolean
  var showtickprefix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var showticksuffix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var thickness: scala.Double
  var thicknessmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels
  var tick0: scala.Double | java.lang.String
  var tickangle: scala.Double
  var tickcolor: Color
  var tickfont: Font
  var tickformat: java.lang.String
  var tickformatstops: plotlyDotJsLib.Anon_Dtickrange
  var ticklen: scala.Double
  var tickmode: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.array
  var tickprefix: java.lang.String
  var ticks: plotlyDotJsLib.plotlyDotJsLibStrings.outside | plotlyDotJsLib.plotlyDotJsLibStrings.inside | plotlyDotJsLib.plotlyDotJsLibStrings.Empty
  var ticksuffix: java.lang.String
  var ticktext: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray
  var ticktextsrc: js.Any
  var tickvals: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray
  var tickvalssrc: js.Any
  var tickwidth: scala.Double
  var title: java.lang.String
  var titlefont: Font
  var titleside: plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  var x: scala.Double
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  var xpad: scala.Double
  var y: scala.Double
  var yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  var ypad: scala.Double
}

object ColorBar {
  @scala.inline
  def apply(
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Color,
    dtick: scala.Double | java.lang.String,
    exponentformat: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.e | plotlyDotJsLib.plotlyDotJsLibStrings.E | plotlyDotJsLib.plotlyDotJsLibStrings.power | plotlyDotJsLib.plotlyDotJsLibStrings.SI | plotlyDotJsLib.plotlyDotJsLibStrings.B,
    len: scala.Double,
    lenmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels,
    nticks: scala.Double,
    outlinecolor: Color,
    outlinewidth: scala.Double,
    separatethousands: scala.Boolean,
    showexponent: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    showticklabels: scala.Boolean,
    showtickprefix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    showticksuffix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    thickness: scala.Double,
    thicknessmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels,
    tick0: scala.Double | java.lang.String,
    tickangle: scala.Double,
    tickcolor: Color,
    tickfont: Font,
    tickformat: java.lang.String,
    tickformatstops: plotlyDotJsLib.Anon_Dtickrange,
    ticklen: scala.Double,
    tickmode: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.array,
    tickprefix: java.lang.String,
    ticks: plotlyDotJsLib.plotlyDotJsLibStrings.outside | plotlyDotJsLib.plotlyDotJsLibStrings.inside | plotlyDotJsLib.plotlyDotJsLibStrings.Empty,
    ticksuffix: java.lang.String,
    ticktext: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray,
    ticktextsrc: js.Any,
    tickvals: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray,
    tickvalssrc: js.Any,
    tickwidth: scala.Double,
    title: java.lang.String,
    titlefont: Font,
    titleside: plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.bottom,
    x: scala.Double,
    xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right,
    xpad: scala.Double,
    y: scala.Double,
    yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom,
    ypad: scala.Double
  ): ColorBar = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], len = len, lenmode = lenmode.asInstanceOf[js.Any], nticks = nticks, outlinecolor = outlinecolor.asInstanceOf[js.Any], outlinewidth = outlinewidth, separatethousands = separatethousands, showexponent = showexponent.asInstanceOf[js.Any], showticklabels = showticklabels, showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], thickness = thickness, thicknessmode = thicknessmode.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle, tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont, tickformat = tickformat, tickformatstops = tickformatstops, ticklen = ticklen, tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix, ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix, ticktext = ticktext.asInstanceOf[js.Any], ticktextsrc = ticktextsrc, tickvals = tickvals.asInstanceOf[js.Any], tickvalssrc = tickvalssrc, tickwidth = tickwidth, title = title, titlefont = titlefont, titleside = titleside.asInstanceOf[js.Any], x = x, xanchor = xanchor.asInstanceOf[js.Any], xpad = xpad, y = y, yanchor = yanchor.asInstanceOf[js.Any], ypad = ypad)
  
    __obj.asInstanceOf[ColorBar]
  }
}

