package typings.plotlyJs.mod

import typings.plotlyJs.AnonDtickrange
import typings.plotlyJs.plotlyJsStrings.B
import typings.plotlyJs.plotlyJsStrings.E
import typings.plotlyJs.plotlyJsStrings.SI
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.all
import typings.plotlyJs.plotlyJsStrings.array
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.e_
import typings.plotlyJs.plotlyJsStrings.first
import typings.plotlyJs.plotlyJsStrings.fraction
import typings.plotlyJs.plotlyJsStrings.inside
import typings.plotlyJs.plotlyJsStrings.last
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.outside
import typings.plotlyJs.plotlyJsStrings.pixels
import typings.plotlyJs.plotlyJsStrings.power
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorBar extends js.Object {
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Color
  var dtick: Double | String
  var exponentformat: none | e_ | E | power | SI | B
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
  var tickformatstops: AnonDtickrange
  var ticklen: Double
  var tickmode: auto | linear | array
  var tickprefix: String
  var ticks: outside | inside | _empty
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
    exponentformat: none | e_ | E | power | SI | B,
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
    tickformatstops: AnonDtickrange,
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | _empty,
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
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], lenmode = lenmode.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], outlinecolor = outlinecolor.asInstanceOf[js.Any], outlinewidth = outlinewidth.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], thicknessmode = thicknessmode.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], tickformatstops = tickformatstops.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], ticktextsrc = ticktextsrc.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickvalssrc = tickvalssrc.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], titleside = titleside.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xpad = xpad.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], ypad = ypad.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorBar]
  }
}

