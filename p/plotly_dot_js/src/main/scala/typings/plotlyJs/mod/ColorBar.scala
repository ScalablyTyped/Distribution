package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialTickFormatStop
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorBar extends StObject {
  
  var bgcolor: Color
  
  var bordercolor: Color
  
  var borderwidth: Color
  
  var dtick: DTickValue
  
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
  
  var tickangle: auto | Double
  
  var tickcolor: Color
  
  var tickfont: Font
  
  var tickformat: String
  
  var tickformatstops: js.Array[PartialTickFormatStop]
  
  var ticklen: Double
  
  var tickmode: auto | linear | array
  
  var tickprefix: String
  
  var ticks: outside | inside | _empty
  
  var ticksuffix: String
  
  var ticktext: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray
  
  var ticktextsrc: Any
  
  var tickvals: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray
  
  var tickvalssrc: Any
  
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
  
  inline def apply(
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Color,
    dtick: DTickValue,
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
    tickangle: auto | Double,
    tickcolor: Color,
    tickfont: Font,
    tickformat: String,
    tickformatstops: js.Array[PartialTickFormatStop],
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | _empty,
    ticksuffix: String,
    ticktext: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray,
    ticktextsrc: Any,
    tickvals: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray,
    tickvalssrc: Any,
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
  
  extension [Self <: ColorBar](x: Self) {
    
    inline def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setBorderwidth(value: Color): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "borderwidth", js.Array(value*))
    
    inline def setDtick(value: DTickValue): Self = StObject.set(x, "dtick", value.asInstanceOf[js.Any])
    
    inline def setExponentformat(value: none | e_ | E | power | SI | B): Self = StObject.set(x, "exponentformat", value.asInstanceOf[js.Any])
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    inline def setNticks(value: Double): Self = StObject.set(x, "nticks", value.asInstanceOf[js.Any])
    
    inline def setOutlinecolor(value: Color): Self = StObject.set(x, "outlinecolor", value.asInstanceOf[js.Any])
    
    inline def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outlinecolor", js.Array(value*))
    
    inline def setOutlinewidth(value: Double): Self = StObject.set(x, "outlinewidth", value.asInstanceOf[js.Any])
    
    inline def setSeparatethousands(value: Boolean): Self = StObject.set(x, "separatethousands", value.asInstanceOf[js.Any])
    
    inline def setShowexponent(value: all | first | last | none): Self = StObject.set(x, "showexponent", value.asInstanceOf[js.Any])
    
    inline def setShowticklabels(value: Boolean): Self = StObject.set(x, "showticklabels", value.asInstanceOf[js.Any])
    
    inline def setShowtickprefix(value: all | first | last | none): Self = StObject.set(x, "showtickprefix", value.asInstanceOf[js.Any])
    
    inline def setShowticksuffix(value: all | first | last | none): Self = StObject.set(x, "showticksuffix", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessmode(value: fraction | pixels): Self = StObject.set(x, "thicknessmode", value.asInstanceOf[js.Any])
    
    inline def setTick0(value: Double | String): Self = StObject.set(x, "tick0", value.asInstanceOf[js.Any])
    
    inline def setTickangle(value: auto | Double): Self = StObject.set(x, "tickangle", value.asInstanceOf[js.Any])
    
    inline def setTickcolor(value: Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    inline def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value*))
    
    inline def setTickfont(value: Font): Self = StObject.set(x, "tickfont", value.asInstanceOf[js.Any])
    
    inline def setTickformat(value: String): Self = StObject.set(x, "tickformat", value.asInstanceOf[js.Any])
    
    inline def setTickformatstops(value: js.Array[PartialTickFormatStop]): Self = StObject.set(x, "tickformatstops", value.asInstanceOf[js.Any])
    
    inline def setTickformatstopsVarargs(value: PartialTickFormatStop*): Self = StObject.set(x, "tickformatstops", js.Array(value*))
    
    inline def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    inline def setTickmode(value: auto | linear | array): Self = StObject.set(x, "tickmode", value.asInstanceOf[js.Any])
    
    inline def setTickprefix(value: String): Self = StObject.set(x, "tickprefix", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: outside | inside | _empty): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksuffix(value: String): Self = StObject.set(x, "ticksuffix", value.asInstanceOf[js.Any])
    
    inline def setTicktext(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "ticktext", value.asInstanceOf[js.Any])
    
    inline def setTicktextVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "ticktext", js.Array(value*))
    
    inline def setTicktextsrc(value: Any): Self = StObject.set(x, "ticktextsrc", value.asInstanceOf[js.Any])
    
    inline def setTickvals(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "tickvals", value.asInstanceOf[js.Any])
    
    inline def setTickvalsVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "tickvals", js.Array(value*))
    
    inline def setTickvalssrc(value: Any): Self = StObject.set(x, "tickvalssrc", value.asInstanceOf[js.Any])
    
    inline def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitlefont(value: Font): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    inline def setTitleside(value: right | top | bottom): Self = StObject.set(x, "titleside", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXpad(value: Double): Self = StObject.set(x, "xpad", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYanchor(value: top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    inline def setYpad(value: Double): Self = StObject.set(x, "ypad", value.asInstanceOf[js.Any])
  }
}
