package typings.plotlyJs.anon

import typings.plotlyJs.mod.DTickValue
import typings.plotlyJs.mod.Datum
import typings.plotlyJs.mod.TickFormatStop
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
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ColorBar> */
@js.native
trait PartialColorBarBgcolor extends js.Object {
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
  var tickformatstops: js.UndefOr[js.Array[Partial[TickFormatStop]]] = js.native
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
  implicit class PartialColorBarBgcolorOps[Self <: PartialColorBarBgcolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bgcolor", js.Array(value :_*))
    @scala.inline
    def setBgcolor(value: typings.plotlyJs.mod.Color): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bordercolor", js.Array(value :_*))
    @scala.inline
    def setBordercolor(value: typings.plotlyJs.mod.Color): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordercolor: Self = this.set("bordercolor", js.undefined)
    @scala.inline
    def setBorderwidthVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("borderwidth", js.Array(value :_*))
    @scala.inline
    def setBorderwidth(value: typings.plotlyJs.mod.Color): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderwidth: Self = this.set("borderwidth", js.undefined)
    @scala.inline
    def setDtick(value: DTickValue): Self = this.set("dtick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtick: Self = this.set("dtick", js.undefined)
    @scala.inline
    def setExponentformat(value: none | e_ | E | power | SI | B): Self = this.set("exponentformat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponentformat: Self = this.set("exponentformat", js.undefined)
    @scala.inline
    def setLen(value: Double): Self = this.set("len", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLen: Self = this.set("len", js.undefined)
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = this.set("lenmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLenmode: Self = this.set("lenmode", js.undefined)
    @scala.inline
    def setNticks(value: Double): Self = this.set("nticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNticks: Self = this.set("nticks", js.undefined)
    @scala.inline
    def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("outlinecolor", js.Array(value :_*))
    @scala.inline
    def setOutlinecolor(value: typings.plotlyJs.mod.Color): Self = this.set("outlinecolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlinecolor: Self = this.set("outlinecolor", js.undefined)
    @scala.inline
    def setOutlinewidth(value: Double): Self = this.set("outlinewidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlinewidth: Self = this.set("outlinewidth", js.undefined)
    @scala.inline
    def setSeparatethousands(value: Boolean): Self = this.set("separatethousands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparatethousands: Self = this.set("separatethousands", js.undefined)
    @scala.inline
    def setShowexponent(value: all | first | last | none): Self = this.set("showexponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowexponent: Self = this.set("showexponent", js.undefined)
    @scala.inline
    def setShowticklabels(value: Boolean): Self = this.set("showticklabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowticklabels: Self = this.set("showticklabels", js.undefined)
    @scala.inline
    def setShowtickprefix(value: all | first | last | none): Self = this.set("showtickprefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowtickprefix: Self = this.set("showtickprefix", js.undefined)
    @scala.inline
    def setShowticksuffix(value: all | first | last | none): Self = this.set("showticksuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowticksuffix: Self = this.set("showticksuffix", js.undefined)
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setThicknessmode(value: fraction | pixels): Self = this.set("thicknessmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThicknessmode: Self = this.set("thicknessmode", js.undefined)
    @scala.inline
    def setTick0(value: Double | String): Self = this.set("tick0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTick0: Self = this.set("tick0", js.undefined)
    @scala.inline
    def setTickangle(value: Double): Self = this.set("tickangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickangle: Self = this.set("tickangle", js.undefined)
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("tickcolor", js.Array(value :_*))
    @scala.inline
    def setTickcolor(value: typings.plotlyJs.mod.Color): Self = this.set("tickcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickcolor: Self = this.set("tickcolor", js.undefined)
    @scala.inline
    def setTickfont(value: typings.plotlyJs.mod.Font): Self = this.set("tickfont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickfont: Self = this.set("tickfont", js.undefined)
    @scala.inline
    def setTickformat(value: String): Self = this.set("tickformat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickformat: Self = this.set("tickformat", js.undefined)
    @scala.inline
    def setTickformatstopsVarargs(value: Partial[TickFormatStop]*): Self = this.set("tickformatstops", js.Array(value :_*))
    @scala.inline
    def setTickformatstops(value: js.Array[Partial[TickFormatStop]]): Self = this.set("tickformatstops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickformatstops: Self = this.set("tickformatstops", js.undefined)
    @scala.inline
    def setTicklen(value: Double): Self = this.set("ticklen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicklen: Self = this.set("ticklen", js.undefined)
    @scala.inline
    def setTickmode(value: auto | linear | array): Self = this.set("tickmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickmode: Self = this.set("tickmode", js.undefined)
    @scala.inline
    def setTickprefix(value: String): Self = this.set("tickprefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickprefix: Self = this.set("tickprefix", js.undefined)
    @scala.inline
    def setTicks(value: outside | inside | _empty): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    @scala.inline
    def setTicksuffix(value: String): Self = this.set("ticksuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicksuffix: Self = this.set("ticksuffix", js.undefined)
    @scala.inline
    def setTicktextVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = this.set("ticktext", js.Array(value :_*))
    @scala.inline
    def setTicktext(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicktext: Self = this.set("ticktext", js.undefined)
    @scala.inline
    def setTicktextsrc(value: js.Any): Self = this.set("ticktextsrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicktextsrc: Self = this.set("ticktextsrc", js.undefined)
    @scala.inline
    def setTickvalsVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = this.set("tickvals", js.Array(value :_*))
    @scala.inline
    def setTickvals(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickvals: Self = this.set("tickvals", js.undefined)
    @scala.inline
    def setTickvalssrc(value: js.Any): Self = this.set("tickvalssrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickvalssrc: Self = this.set("tickvalssrc", js.undefined)
    @scala.inline
    def setTickwidth(value: Double): Self = this.set("tickwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickwidth: Self = this.set("tickwidth", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitlefont(value: typings.plotlyJs.mod.Font): Self = this.set("titlefont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlefont: Self = this.set("titlefont", js.undefined)
    @scala.inline
    def setTitleside(value: right | top | bottom): Self = this.set("titleside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleside: Self = this.set("titleside", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setXanchor(value: left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXanchor: Self = this.set("xanchor", js.undefined)
    @scala.inline
    def setXpad(value: Double): Self = this.set("xpad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXpad: Self = this.set("xpad", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYanchor(value: top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYanchor: Self = this.set("yanchor", js.undefined)
    @scala.inline
    def setYpad(value: Double): Self = this.set("ypad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYpad: Self = this.set("ypad", js.undefined)
  }
  
}

