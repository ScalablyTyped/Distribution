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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorBar extends StObject {
  
  var bgcolor: Color = js.native
  
  var bordercolor: Color = js.native
  
  var borderwidth: Color = js.native
  
  var dtick: DTickValue = js.native
  
  var exponentformat: none | e_ | E | power | SI | B = js.native
  
  var len: Double = js.native
  
  var lenmode: fraction | pixels = js.native
  
  var nticks: Double = js.native
  
  var outlinecolor: Color = js.native
  
  var outlinewidth: Double = js.native
  
  var separatethousands: Boolean = js.native
  
  var showexponent: all | first | last | none = js.native
  
  var showticklabels: Boolean = js.native
  
  var showtickprefix: all | first | last | none = js.native
  
  var showticksuffix: all | first | last | none = js.native
  
  var thickness: Double = js.native
  
  var thicknessmode: fraction | pixels = js.native
  
  var tick0: Double | String = js.native
  
  var tickangle: Double = js.native
  
  var tickcolor: Color = js.native
  
  var tickfont: Font = js.native
  
  var tickformat: String = js.native
  
  var tickformatstops: js.Array[PartialTickFormatStop] = js.native
  
  var ticklen: Double = js.native
  
  var tickmode: auto | linear | array = js.native
  
  var tickprefix: String = js.native
  
  var ticks: outside | inside | _empty = js.native
  
  var ticksuffix: String = js.native
  
  var ticktext: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray = js.native
  
  var ticktextsrc: js.Any = js.native
  
  var tickvals: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray = js.native
  
  var tickvalssrc: js.Any = js.native
  
  var tickwidth: Double = js.native
  
  var title: String = js.native
  
  var titlefont: Font = js.native
  
  var titleside: right | top | bottom = js.native
  
  var x: Double = js.native
  
  var xanchor: left | center | right = js.native
  
  var xpad: Double = js.native
  
  var y: Double = js.native
  
  var yanchor: top | middle | bottom = js.native
  
  var ypad: Double = js.native
}
object ColorBar {
  
  @scala.inline
  def apply(
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
    tickangle: Double,
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
  
  @scala.inline
  implicit class ColorBarMutableBuilder[Self <: ColorBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: Color): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "borderwidth", js.Array(value :_*))
    
    @scala.inline
    def setDtick(value: DTickValue): Self = StObject.set(x, "dtick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentformat(value: none | e_ | E | power | SI | B): Self = StObject.set(x, "exponentformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNticks(value: Double): Self = StObject.set(x, "nticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinecolor(value: Color): Self = StObject.set(x, "outlinecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outlinecolor", js.Array(value :_*))
    
    @scala.inline
    def setOutlinewidth(value: Double): Self = StObject.set(x, "outlinewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatethousands(value: Boolean): Self = StObject.set(x, "separatethousands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowexponent(value: all | first | last | none): Self = StObject.set(x, "showexponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticklabels(value: Boolean): Self = StObject.set(x, "showticklabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowtickprefix(value: all | first | last | none): Self = StObject.set(x, "showtickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticksuffix(value: all | first | last | none): Self = StObject.set(x, "showticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessmode(value: fraction | pixels): Self = StObject.set(x, "thicknessmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTick0(value: Double | String): Self = StObject.set(x, "tick0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickangle(value: Double): Self = StObject.set(x, "tickangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolor(value: Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTickfont(value: Font): Self = StObject.set(x, "tickfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformat(value: String): Self = StObject.set(x, "tickformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformatstops(value: js.Array[PartialTickFormatStop]): Self = StObject.set(x, "tickformatstops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformatstopsVarargs(value: PartialTickFormatStop*): Self = StObject.set(x, "tickformatstops", js.Array(value :_*))
    
    @scala.inline
    def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickmode(value: auto | linear | array): Self = StObject.set(x, "tickmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickprefix(value: String): Self = StObject.set(x, "tickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks(value: outside | inside | _empty): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksuffix(value: String): Self = StObject.set(x, "ticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktext(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "ticktext", js.Array(value :_*))
    
    @scala.inline
    def setTicktextsrc(value: js.Any): Self = StObject.set(x, "ticktextsrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvals(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "tickvals", js.Array(value :_*))
    
    @scala.inline
    def setTickvalssrc(value: js.Any): Self = StObject.set(x, "tickvalssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlefont(value: Font): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleside(value: right | top | bottom): Self = StObject.set(x, "titleside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpad(value: Double): Self = StObject.set(x, "xpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchor(value: top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYpad(value: Double): Self = StObject.set(x, "ypad", value.asInstanceOf[js.Any])
  }
}
