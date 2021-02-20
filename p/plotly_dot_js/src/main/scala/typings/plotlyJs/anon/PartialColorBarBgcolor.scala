package typings.plotlyJs.anon

import typings.plotlyJs.mod.DTickValue
import typings.plotlyJs.mod.Datum
import typings.plotlyJs.mod.TypedArray
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

/* Inlined std.Partial<plotly.js.plotly.js.ColorBar> */
@js.native
trait PartialColorBarBgcolor extends StObject {
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var borderwidth: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var dtick: js.UndefOr[DTickValue] = js.native
  
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.native
  
  var len: js.UndefOr[Double] = js.native
  
  var lenmode: js.UndefOr[fraction | pixels] = js.native
  
  var nticks: js.UndefOr[Double] = js.native
  
  var outlinecolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var outlinewidth: js.UndefOr[Double] = js.native
  
  var separatethousands: js.UndefOr[Boolean] = js.native
  
  var showexponent: js.UndefOr[all | first | last | none] = js.native
  
  var showticklabels: js.UndefOr[Boolean] = js.native
  
  var showtickprefix: js.UndefOr[all | first | last | none] = js.native
  
  var showticksuffix: js.UndefOr[all | first | last | none] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
  
  var thicknessmode: js.UndefOr[fraction | pixels] = js.native
  
  var tick0: js.UndefOr[Double | String] = js.native
  
  var tickangle: js.UndefOr[Double] = js.native
  
  var tickcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var tickfont: js.UndefOr[typings.plotlyJs.mod.Font] = js.native
  
  var tickformat: js.UndefOr[String] = js.native
  
  var tickformatstops: js.UndefOr[js.Array[PartialTickFormatStop]] = js.native
  
  var ticklen: js.UndefOr[Double] = js.native
  
  var tickmode: js.UndefOr[auto | linear | array] = js.native
  
  var tickprefix: js.UndefOr[String] = js.native
  
  var ticks: js.UndefOr[outside | inside | _empty] = js.native
  
  var ticksuffix: js.UndefOr[String] = js.native
  
  var ticktext: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.native
  
  var ticktextsrc: js.UndefOr[js.Any] = js.native
  
  var tickvals: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.native
  
  var tickvalssrc: js.UndefOr[js.Any] = js.native
  
  var tickwidth: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titlefont: js.UndefOr[typings.plotlyJs.mod.Font] = js.native
  
  var titleside: js.UndefOr[right | top | bottom] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xanchor: js.UndefOr[left | center | right] = js.native
  
  var xpad: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yanchor: js.UndefOr[top | middle | bottom] = js.native
  
  var ypad: js.UndefOr[Double] = js.native
}
object PartialColorBarBgcolor {
  
  @scala.inline
  def apply(): PartialColorBarBgcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColorBarBgcolor]
  }
  
  @scala.inline
  implicit class PartialColorBarBgcolorMutableBuilder[Self <: PartialColorBarBgcolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    @scala.inline
    def setBorderwidthVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "borderwidth", js.Array(value :_*))
    
    @scala.inline
    def setDtick(value: DTickValue): Self = StObject.set(x, "dtick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtickUndefined: Self = StObject.set(x, "dtick", js.undefined)
    
    @scala.inline
    def setExponentformat(value: none | e_ | E | power | SI | B): Self = StObject.set(x, "exponentformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentformatUndefined: Self = StObject.set(x, "exponentformat", js.undefined)
    
    @scala.inline
    def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenmodeUndefined: Self = StObject.set(x, "lenmode", js.undefined)
    
    @scala.inline
    def setNticks(value: Double): Self = StObject.set(x, "nticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNticksUndefined: Self = StObject.set(x, "nticks", js.undefined)
    
    @scala.inline
    def setOutlinecolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "outlinecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinecolorUndefined: Self = StObject.set(x, "outlinecolor", js.undefined)
    
    @scala.inline
    def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outlinecolor", js.Array(value :_*))
    
    @scala.inline
    def setOutlinewidth(value: Double): Self = StObject.set(x, "outlinewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinewidthUndefined: Self = StObject.set(x, "outlinewidth", js.undefined)
    
    @scala.inline
    def setSeparatethousands(value: Boolean): Self = StObject.set(x, "separatethousands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatethousandsUndefined: Self = StObject.set(x, "separatethousands", js.undefined)
    
    @scala.inline
    def setShowexponent(value: all | first | last | none): Self = StObject.set(x, "showexponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowexponentUndefined: Self = StObject.set(x, "showexponent", js.undefined)
    
    @scala.inline
    def setShowticklabels(value: Boolean): Self = StObject.set(x, "showticklabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticklabelsUndefined: Self = StObject.set(x, "showticklabels", js.undefined)
    
    @scala.inline
    def setShowtickprefix(value: all | first | last | none): Self = StObject.set(x, "showtickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowtickprefixUndefined: Self = StObject.set(x, "showtickprefix", js.undefined)
    
    @scala.inline
    def setShowticksuffix(value: all | first | last | none): Self = StObject.set(x, "showticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticksuffixUndefined: Self = StObject.set(x, "showticksuffix", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setThicknessmode(value: fraction | pixels): Self = StObject.set(x, "thicknessmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessmodeUndefined: Self = StObject.set(x, "thicknessmode", js.undefined)
    
    @scala.inline
    def setTick0(value: Double | String): Self = StObject.set(x, "tick0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTick0Undefined: Self = StObject.set(x, "tick0", js.undefined)
    
    @scala.inline
    def setTickangle(value: Double): Self = StObject.set(x, "tickangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickangleUndefined: Self = StObject.set(x, "tickangle", js.undefined)
    
    @scala.inline
    def setTickcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolorUndefined: Self = StObject.set(x, "tickcolor", js.undefined)
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTickfont(value: typings.plotlyJs.mod.Font): Self = StObject.set(x, "tickfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickfontUndefined: Self = StObject.set(x, "tickfont", js.undefined)
    
    @scala.inline
    def setTickformat(value: String): Self = StObject.set(x, "tickformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformatUndefined: Self = StObject.set(x, "tickformat", js.undefined)
    
    @scala.inline
    def setTickformatstops(value: js.Array[PartialTickFormatStop]): Self = StObject.set(x, "tickformatstops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformatstopsUndefined: Self = StObject.set(x, "tickformatstops", js.undefined)
    
    @scala.inline
    def setTickformatstopsVarargs(value: PartialTickFormatStop*): Self = StObject.set(x, "tickformatstops", js.Array(value :_*))
    
    @scala.inline
    def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicklenUndefined: Self = StObject.set(x, "ticklen", js.undefined)
    
    @scala.inline
    def setTickmode(value: auto | linear | array): Self = StObject.set(x, "tickmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickmodeUndefined: Self = StObject.set(x, "tickmode", js.undefined)
    
    @scala.inline
    def setTickprefix(value: String): Self = StObject.set(x, "tickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickprefixUndefined: Self = StObject.set(x, "tickprefix", js.undefined)
    
    @scala.inline
    def setTicks(value: outside | inside | _empty): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksuffix(value: String): Self = StObject.set(x, "ticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksuffixUndefined: Self = StObject.set(x, "ticksuffix", js.undefined)
    
    @scala.inline
    def setTicktext(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextUndefined: Self = StObject.set(x, "ticktext", js.undefined)
    
    @scala.inline
    def setTicktextVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "ticktext", js.Array(value :_*))
    
    @scala.inline
    def setTicktextsrc(value: js.Any): Self = StObject.set(x, "ticktextsrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextsrcUndefined: Self = StObject.set(x, "ticktextsrc", js.undefined)
    
    @scala.inline
    def setTickvals(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsUndefined: Self = StObject.set(x, "tickvals", js.undefined)
    
    @scala.inline
    def setTickvalsVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "tickvals", js.Array(value :_*))
    
    @scala.inline
    def setTickvalssrc(value: js.Any): Self = StObject.set(x, "tickvalssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalssrcUndefined: Self = StObject.set(x, "tickvalssrc", js.undefined)
    
    @scala.inline
    def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickwidthUndefined: Self = StObject.set(x, "tickwidth", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitlefont(value: typings.plotlyJs.mod.Font): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlefontUndefined: Self = StObject.set(x, "titlefont", js.undefined)
    
    @scala.inline
    def setTitleside(value: right | top | bottom): Self = StObject.set(x, "titleside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlesideUndefined: Self = StObject.set(x, "titleside", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setXpad(value: Double): Self = StObject.set(x, "xpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpadUndefined: Self = StObject.set(x, "xpad", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYanchor(value: top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
    
    @scala.inline
    def setYpad(value: Double): Self = StObject.set(x, "ypad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYpadUndefined: Self = StObject.set(x, "ypad", js.undefined)
  }
}
