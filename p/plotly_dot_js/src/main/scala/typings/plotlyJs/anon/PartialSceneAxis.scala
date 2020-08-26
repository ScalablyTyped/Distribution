package typings.plotlyJs.anon

import typings.plotlyJs.mod.AxisType
import typings.plotlyJs.mod.Calendar
import typings.plotlyJs.mod.DTickValue
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsBooleans.`true`
import typings.plotlyJs.plotlyJsStrings.B
import typings.plotlyJs.plotlyJsStrings.E
import typings.plotlyJs.plotlyJsStrings.SI
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.`category ascending`
import typings.plotlyJs.plotlyJsStrings.`category descending`
import typings.plotlyJs.plotlyJsStrings.`hovered data`
import typings.plotlyJs.plotlyJsStrings.`max ascending`
import typings.plotlyJs.plotlyJsStrings.`max descending`
import typings.plotlyJs.plotlyJsStrings.`mean ascending`
import typings.plotlyJs.plotlyJsStrings.`mean descending`
import typings.plotlyJs.plotlyJsStrings.`median ascending`
import typings.plotlyJs.plotlyJsStrings.`median descending`
import typings.plotlyJs.plotlyJsStrings.`min ascending`
import typings.plotlyJs.plotlyJsStrings.`min descending`
import typings.plotlyJs.plotlyJsStrings.`sum ascending`
import typings.plotlyJs.plotlyJsStrings.`sum descending`
import typings.plotlyJs.plotlyJsStrings.`total ascending`
import typings.plotlyJs.plotlyJsStrings.`total descending`
import typings.plotlyJs.plotlyJsStrings.across
import typings.plotlyJs.plotlyJsStrings.acrossPlussignmarker
import typings.plotlyJs.plotlyJsStrings.all
import typings.plotlyJs.plotlyJsStrings.allticks
import typings.plotlyJs.plotlyJsStrings.array
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.cursor
import typings.plotlyJs.plotlyJsStrings.data
import typings.plotlyJs.plotlyJsStrings.e_
import typings.plotlyJs.plotlyJsStrings.first
import typings.plotlyJs.plotlyJsStrings.inside
import typings.plotlyJs.plotlyJsStrings.last
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.marker
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.nonnegative
import typings.plotlyJs.plotlyJsStrings.normal
import typings.plotlyJs.plotlyJsStrings.outside
import typings.plotlyJs.plotlyJsStrings.power
import typings.plotlyJs.plotlyJsStrings.reversed
import typings.plotlyJs.plotlyJsStrings.ticks
import typings.plotlyJs.plotlyJsStrings.toaxis
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignacross
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignacrossPlussignmarker
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignmarker
import typings.plotlyJs.plotlyJsStrings.tozero
import typings.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.SceneAxis> */
@js.native
trait PartialSceneAxis extends js.Object {
  var autorange: js.UndefOr[`true` | `false` | reversed] = js.native
  var backgroundcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var calendar: js.UndefOr[Calendar] = js.native
  var categoryarray: js.UndefOr[js.Array[_]] = js.native
  var categoryorder: js.UndefOr[
    trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
  ] = js.native
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var dividercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var dividerwidth: js.UndefOr[Double] = js.native
  var dtick: js.UndefOr[DTickValue] = js.native
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.native
  var fixedrange: js.UndefOr[Boolean] = js.native
  var gridcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var gridwidth: js.UndefOr[Double] = js.native
  var hoverformat: js.UndefOr[String] = js.native
  var linecolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var linewidth: js.UndefOr[Double] = js.native
  var mirror: js.UndefOr[`true` | ticks | `false` | all | allticks] = js.native
  var nticks: js.UndefOr[Double] = js.native
  var range: js.UndefOr[js.Array[_]] = js.native
  var rangemode: js.UndefOr[normal | tozero | nonnegative] = js.native
  var separatethousands: js.UndefOr[Boolean] = js.native
  var showaxeslabels: js.UndefOr[Boolean] = js.native
  var showbackground: js.UndefOr[Boolean] = js.native
  var showdividers: js.UndefOr[Boolean] = js.native
  var showexponent: js.UndefOr[all | first | last | none] = js.native
  var showgrid: js.UndefOr[Boolean] = js.native
  var showline: js.UndefOr[Boolean] = js.native
  var showspikes: js.UndefOr[Boolean] = js.native
  var showticklabels: js.UndefOr[Boolean] = js.native
  var showtickprefix: js.UndefOr[all | first | last | none] = js.native
  var showticksuffix: js.UndefOr[all | first | last | none] = js.native
  var spikecolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var spikedash: js.UndefOr[String] = js.native
  var spikemode: js.UndefOr[
    toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker
  ] = js.native
  var spikesides: js.UndefOr[Boolean] = js.native
  var spikesnap: js.UndefOr[data | cursor | (`hovered data`)] = js.native
  var spikethickness: js.UndefOr[Double] = js.native
  var tick0: js.UndefOr[Double | String] = js.native
  var tickangle: js.UndefOr[Double] = js.native
  var tickcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var tickfont: js.UndefOr[PartialFont] = js.native
  var tickformat: js.UndefOr[String] = js.native
  var tickformatstops: js.UndefOr[js.Array[PartialTickFormatStop]] = js.native
  var ticklen: js.UndefOr[Double] = js.native
  var tickmode: js.UndefOr[auto | linear | array] = js.native
  var tickprefix: js.UndefOr[String] = js.native
  var ticks: js.UndefOr[outside | inside | _empty] = js.native
  var ticksuffix: js.UndefOr[String] = js.native
  var ticktext: js.UndefOr[js.Array[String]] = js.native
  var tickvals: js.UndefOr[js.Array[_]] = js.native
  var tickwidth: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String | PartialDataTitle] = js.native
  var titlefont: js.UndefOr[PartialFont] = js.native
  var `type`: js.UndefOr[AxisType] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zeroline: js.UndefOr[Boolean] = js.native
  var zerolinecolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var zerolinewidth: js.UndefOr[Double] = js.native
}

object PartialSceneAxis {
  @scala.inline
  def apply(): PartialSceneAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSceneAxis]
  }
  @scala.inline
  implicit class PartialSceneAxisOps[Self <: PartialSceneAxis] (val x: Self) extends AnyVal {
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
    def setAutorange(value: `true` | `false` | reversed): Self = this.set("autorange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutorange: Self = this.set("autorange", js.undefined)
    @scala.inline
    def setBackgroundcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("backgroundcolor", js.Array(value :_*))
    @scala.inline
    def setBackgroundcolor(value: typings.plotlyJs.mod.Color): Self = this.set("backgroundcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundcolor: Self = this.set("backgroundcolor", js.undefined)
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setCategoryarrayVarargs(value: js.Any*): Self = this.set("categoryarray", js.Array(value :_*))
    @scala.inline
    def setCategoryarray(value: js.Array[_]): Self = this.set("categoryarray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryarray: Self = this.set("categoryarray", js.undefined)
    @scala.inline
    def setCategoryorder(
      value: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
    ): Self = this.set("categoryorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryorder: Self = this.set("categoryorder", js.undefined)
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDividercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("dividercolor", js.Array(value :_*))
    @scala.inline
    def setDividercolor(value: typings.plotlyJs.mod.Color): Self = this.set("dividercolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividercolor: Self = this.set("dividercolor", js.undefined)
    @scala.inline
    def setDividerwidth(value: Double): Self = this.set("dividerwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividerwidth: Self = this.set("dividerwidth", js.undefined)
    @scala.inline
    def setDtick(value: DTickValue): Self = this.set("dtick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtick: Self = this.set("dtick", js.undefined)
    @scala.inline
    def setExponentformat(value: none | e_ | E | power | SI | B): Self = this.set("exponentformat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponentformat: Self = this.set("exponentformat", js.undefined)
    @scala.inline
    def setFixedrange(value: Boolean): Self = this.set("fixedrange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedrange: Self = this.set("fixedrange", js.undefined)
    @scala.inline
    def setGridcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("gridcolor", js.Array(value :_*))
    @scala.inline
    def setGridcolor(value: typings.plotlyJs.mod.Color): Self = this.set("gridcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridcolor: Self = this.set("gridcolor", js.undefined)
    @scala.inline
    def setGridwidth(value: Double): Self = this.set("gridwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridwidth: Self = this.set("gridwidth", js.undefined)
    @scala.inline
    def setHoverformat(value: String): Self = this.set("hoverformat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverformat: Self = this.set("hoverformat", js.undefined)
    @scala.inline
    def setLinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("linecolor", js.Array(value :_*))
    @scala.inline
    def setLinecolor(value: typings.plotlyJs.mod.Color): Self = this.set("linecolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinecolor: Self = this.set("linecolor", js.undefined)
    @scala.inline
    def setLinewidth(value: Double): Self = this.set("linewidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinewidth: Self = this.set("linewidth", js.undefined)
    @scala.inline
    def setMirror(value: `true` | ticks | `false` | all | allticks): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setNticks(value: Double): Self = this.set("nticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNticks: Self = this.set("nticks", js.undefined)
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[_]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRangemode(value: normal | tozero | nonnegative): Self = this.set("rangemode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangemode: Self = this.set("rangemode", js.undefined)
    @scala.inline
    def setSeparatethousands(value: Boolean): Self = this.set("separatethousands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparatethousands: Self = this.set("separatethousands", js.undefined)
    @scala.inline
    def setShowaxeslabels(value: Boolean): Self = this.set("showaxeslabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowaxeslabels: Self = this.set("showaxeslabels", js.undefined)
    @scala.inline
    def setShowbackground(value: Boolean): Self = this.set("showbackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowbackground: Self = this.set("showbackground", js.undefined)
    @scala.inline
    def setShowdividers(value: Boolean): Self = this.set("showdividers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowdividers: Self = this.set("showdividers", js.undefined)
    @scala.inline
    def setShowexponent(value: all | first | last | none): Self = this.set("showexponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowexponent: Self = this.set("showexponent", js.undefined)
    @scala.inline
    def setShowgrid(value: Boolean): Self = this.set("showgrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowgrid: Self = this.set("showgrid", js.undefined)
    @scala.inline
    def setShowline(value: Boolean): Self = this.set("showline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowline: Self = this.set("showline", js.undefined)
    @scala.inline
    def setShowspikes(value: Boolean): Self = this.set("showspikes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowspikes: Self = this.set("showspikes", js.undefined)
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
    def setSpikecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("spikecolor", js.Array(value :_*))
    @scala.inline
    def setSpikecolor(value: typings.plotlyJs.mod.Color): Self = this.set("spikecolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpikecolor: Self = this.set("spikecolor", js.undefined)
    @scala.inline
    def setSpikedash(value: String): Self = this.set("spikedash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpikedash: Self = this.set("spikedash", js.undefined)
    @scala.inline
    def setSpikemode(
      value: toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker
    ): Self = this.set("spikemode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpikemode: Self = this.set("spikemode", js.undefined)
    @scala.inline
    def setSpikesides(value: Boolean): Self = this.set("spikesides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpikesides: Self = this.set("spikesides", js.undefined)
    @scala.inline
    def setSpikesnap(value: data | cursor | (`hovered data`)): Self = this.set("spikesnap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpikesnap: Self = this.set("spikesnap", js.undefined)
    @scala.inline
    def setSpikethickness(value: Double): Self = this.set("spikethickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpikethickness: Self = this.set("spikethickness", js.undefined)
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
    def setTickfont(value: PartialFont): Self = this.set("tickfont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickfont: Self = this.set("tickfont", js.undefined)
    @scala.inline
    def setTickformat(value: String): Self = this.set("tickformat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickformat: Self = this.set("tickformat", js.undefined)
    @scala.inline
    def setTickformatstopsVarargs(value: PartialTickFormatStop*): Self = this.set("tickformatstops", js.Array(value :_*))
    @scala.inline
    def setTickformatstops(value: js.Array[PartialTickFormatStop]): Self = this.set("tickformatstops", value.asInstanceOf[js.Any])
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
    def setTicktextVarargs(value: String*): Self = this.set("ticktext", js.Array(value :_*))
    @scala.inline
    def setTicktext(value: js.Array[String]): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicktext: Self = this.set("ticktext", js.undefined)
    @scala.inline
    def setTickvalsVarargs(value: js.Any*): Self = this.set("tickvals", js.Array(value :_*))
    @scala.inline
    def setTickvals(value: js.Array[_]): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickvals: Self = this.set("tickvals", js.undefined)
    @scala.inline
    def setTickwidth(value: Double): Self = this.set("tickwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickwidth: Self = this.set("tickwidth", js.undefined)
    @scala.inline
    def setTitle(value: String | PartialDataTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitlefont(value: PartialFont): Self = this.set("titlefont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlefont: Self = this.set("titlefont", js.undefined)
    @scala.inline
    def setType(value: AxisType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZeroline(value: Boolean): Self = this.set("zeroline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZeroline: Self = this.set("zeroline", js.undefined)
    @scala.inline
    def setZerolinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("zerolinecolor", js.Array(value :_*))
    @scala.inline
    def setZerolinecolor(value: typings.plotlyJs.mod.Color): Self = this.set("zerolinecolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZerolinecolor: Self = this.set("zerolinecolor", js.undefined)
    @scala.inline
    def setZerolinewidth(value: Double): Self = this.set("zerolinewidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZerolinewidth: Self = this.set("zerolinewidth", js.undefined)
  }
  
}

