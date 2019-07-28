package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_Dtickrange
import typings.plotlyDotJs.plotlyDotJsStrings.B
import typings.plotlyDotJs.plotlyDotJsStrings.E
import typings.plotlyDotJs.plotlyDotJsStrings.Empty
import typings.plotlyDotJs.plotlyDotJsStrings.SI
import typings.plotlyDotJs.plotlyDotJsStrings.all
import typings.plotlyDotJs.plotlyDotJsStrings.array
import typings.plotlyDotJs.plotlyDotJsStrings.auto
import typings.plotlyDotJs.plotlyDotJsStrings.bottom
import typings.plotlyDotJs.plotlyDotJsStrings.center
import typings.plotlyDotJs.plotlyDotJsStrings.e
import typings.plotlyDotJs.plotlyDotJsStrings.first
import typings.plotlyDotJs.plotlyDotJsStrings.fraction
import typings.plotlyDotJs.plotlyDotJsStrings.inside
import typings.plotlyDotJs.plotlyDotJsStrings.last
import typings.plotlyDotJs.plotlyDotJsStrings.left
import typings.plotlyDotJs.plotlyDotJsStrings.linear
import typings.plotlyDotJs.plotlyDotJsStrings.middle
import typings.plotlyDotJs.plotlyDotJsStrings.none
import typings.plotlyDotJs.plotlyDotJsStrings.outside
import typings.plotlyDotJs.plotlyDotJsStrings.pixels
import typings.plotlyDotJs.plotlyDotJsStrings.power
import typings.plotlyDotJs.plotlyDotJsStrings.right
import typings.plotlyDotJs.plotlyDotJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorBar extends js.Object {
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Color
  var dtick: Double | String
  var exponentformat: none | e | E | power | SI | B
  var len: Double
  var lenmode: fraction | pixels
  var nticks: Double
  var outlinecolor: Color
  var outlinewidth: Double
  var separatethousands: Boolean
  var showexponent: all | first | last | none
  var showticklabels: Boolean
  var showtickprefix: all | first | last | none
  var showticksuffix: all | first | last | none
  var thickness: Double
  var thicknessmode: fraction | pixels
  var tick0: Double | String
  var tickangle: Double
  var tickcolor: Color
  var tickfont: Font
  var tickformat: String
  var tickformatstops: Anon_Dtickrange
  var ticklen: Double
  var tickmode: auto | linear | array
  var tickprefix: String
  var ticks: outside | inside | Empty
  var ticksuffix: String
  var ticktext: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray
  var ticktextsrc: js.Any
  var tickvals: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray
  var tickvalssrc: js.Any
  var tickwidth: Double
  var title: String
  var titlefont: Font
  var titleside: right | top | bottom
  var x: Double
  var xanchor: left | center | right
  var xpad: Double
  var y: Double
  var yanchor: top | middle | bottom
  var ypad: Double
}

object ColorBar {
  @scala.inline
  def apply(
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Color,
    dtick: Double | String,
    exponentformat: none | e | E | power | SI | B,
    len: Double,
    lenmode: fraction | pixels,
    nticks: Double,
    outlinecolor: Color,
    outlinewidth: Double,
    separatethousands: Boolean,
    showexponent: all | first | last | none,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    thickness: Double,
    thicknessmode: fraction | pixels,
    tick0: Double | String,
    tickangle: Double,
    tickcolor: Color,
    tickfont: Font,
    tickformat: String,
    tickformatstops: Anon_Dtickrange,
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | Empty,
    ticksuffix: String,
    ticktext: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray,
    ticktextsrc: js.Any,
    tickvals: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray,
    tickvalssrc: js.Any,
    tickwidth: Double,
    title: String,
    titlefont: Font,
    titleside: right | top | bottom,
    x: Double,
    xanchor: left | center | right,
    xpad: Double,
    y: Double,
    yanchor: top | middle | bottom,
    ypad: Double
  ): ColorBar = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], len = len, lenmode = lenmode.asInstanceOf[js.Any], nticks = nticks, outlinecolor = outlinecolor.asInstanceOf[js.Any], outlinewidth = outlinewidth, separatethousands = separatethousands, showexponent = showexponent.asInstanceOf[js.Any], showticklabels = showticklabels, showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], thickness = thickness, thicknessmode = thicknessmode.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle, tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont, tickformat = tickformat, tickformatstops = tickformatstops, ticklen = ticklen, tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix, ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix, ticktext = ticktext.asInstanceOf[js.Any], ticktextsrc = ticktextsrc, tickvals = tickvals.asInstanceOf[js.Any], tickvalssrc = tickvalssrc, tickwidth = tickwidth, title = title, titlefont = titlefont, titleside = titleside.asInstanceOf[js.Any], x = x, xanchor = xanchor.asInstanceOf[js.Any], xpad = xpad, y = y, yanchor = yanchor.asInstanceOf[js.Any], ypad = ypad)
  
    __obj.asInstanceOf[ColorBar]
  }
}

