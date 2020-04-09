package typings.plotlyJs

import typings.plotlyJs.mod.AxisType
import typings.plotlyJs.mod.Calendar
import typings.plotlyJs.mod.Color
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsBooleans.`true`
import typings.plotlyJs.plotlyJsStrings.B
import typings.plotlyJs.plotlyJsStrings.E
import typings.plotlyJs.plotlyJsStrings.SI
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.`category ascending`
import typings.plotlyJs.plotlyJsStrings.`category descending`
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
import typings.plotlyJs.plotlyJsStrings.all
import typings.plotlyJs.plotlyJsStrings.allticks
import typings.plotlyJs.plotlyJsStrings.array
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.e_
import typings.plotlyJs.plotlyJsStrings.first
import typings.plotlyJs.plotlyJsStrings.inside
import typings.plotlyJs.plotlyJsStrings.last
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.nonnegative
import typings.plotlyJs.plotlyJsStrings.normal
import typings.plotlyJs.plotlyJsStrings.outside
import typings.plotlyJs.plotlyJsStrings.power
import typings.plotlyJs.plotlyJsStrings.reversed
import typings.plotlyJs.plotlyJsStrings.ticks
import typings.plotlyJs.plotlyJsStrings.tozero
import typings.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.SceneAxis> */
trait PartialSceneAxisAutorange extends js.Object {
  var autorange: js.UndefOr[`true` | `false` | reversed] = js.undefined
  var backgroundcolor: js.UndefOr[Color] = js.undefined
  var calendar: js.UndefOr[Calendar] = js.undefined
  var categoryarray: js.UndefOr[js.Array[_]] = js.undefined
  var categoryorder: js.UndefOr[
    trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
  ] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var dtick: js.UndefOr[Double | String] = js.undefined
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.undefined
  var gridcolor: js.UndefOr[Color] = js.undefined
  var gridwidth: js.UndefOr[Double] = js.undefined
  var hoverformat: js.UndefOr[String] = js.undefined
  var linecolor: js.UndefOr[Color] = js.undefined
  var linewidth: js.UndefOr[Double] = js.undefined
  var mirror: js.UndefOr[`true` | ticks | `false` | all | allticks] = js.undefined
  var nticks: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[js.Array[_]] = js.undefined
  var rangemode: js.UndefOr[normal | tozero | nonnegative] = js.undefined
  var separatethousands: js.UndefOr[Boolean] = js.undefined
  var showaxeslabels: js.UndefOr[Boolean] = js.undefined
  var showbackground: js.UndefOr[Boolean] = js.undefined
  var showexponent: js.UndefOr[all | first | last | none] = js.undefined
  var showgrid: js.UndefOr[Boolean] = js.undefined
  var showline: js.UndefOr[Boolean] = js.undefined
  var showspikes: js.UndefOr[Boolean] = js.undefined
  var showticklabels: js.UndefOr[Boolean] = js.undefined
  var showtickprefix: js.UndefOr[all | first | last | none] = js.undefined
  var showticksuffix: js.UndefOr[all | first | last | none] = js.undefined
  var spikecolor: js.UndefOr[Color] = js.undefined
  var spikesides: js.UndefOr[Boolean] = js.undefined
  var spikethickness: js.UndefOr[Double] = js.undefined
  var tick0: js.UndefOr[Double | String] = js.undefined
  var tickangle: js.UndefOr[Double] = js.undefined
  var tickcolor: js.UndefOr[Color] = js.undefined
  var tickfont: js.UndefOr[PartialFont] = js.undefined
  var tickformat: js.UndefOr[String] = js.undefined
  var ticklen: js.UndefOr[Double] = js.undefined
  var tickmode: js.UndefOr[auto | linear | array] = js.undefined
  var tickprefix: js.UndefOr[String] = js.undefined
  var ticks: js.UndefOr[outside | inside | _empty] = js.undefined
  var ticksuffix: js.UndefOr[String] = js.undefined
  var ticktext: js.UndefOr[js.Array[String]] = js.undefined
  var tickvals: js.UndefOr[js.Array[_]] = js.undefined
  var tickwidth: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String | PartialDataTitle] = js.undefined
  var titlefont: js.UndefOr[PartialFont] = js.undefined
  var `type`: js.UndefOr[AxisType] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zeroline: js.UndefOr[Boolean] = js.undefined
  var zerolinecolor: js.UndefOr[Color] = js.undefined
  var zerolinewidth: js.UndefOr[Double] = js.undefined
}

object PartialSceneAxisAutorange {
  @scala.inline
  def apply(
    autorange: `true` | `false` | reversed = null,
    backgroundcolor: Color = null,
    calendar: Calendar = null,
    categoryarray: js.Array[_] = null,
    categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`) = null,
    color: Color = null,
    dtick: Double | String = null,
    exponentformat: none | e_ | E | power | SI | B = null,
    gridcolor: Color = null,
    gridwidth: Int | Double = null,
    hoverformat: String = null,
    linecolor: Color = null,
    linewidth: Int | Double = null,
    mirror: `true` | ticks | `false` | all | allticks = null,
    nticks: Int | Double = null,
    range: js.Array[_] = null,
    rangemode: normal | tozero | nonnegative = null,
    separatethousands: js.UndefOr[Boolean] = js.undefined,
    showaxeslabels: js.UndefOr[Boolean] = js.undefined,
    showbackground: js.UndefOr[Boolean] = js.undefined,
    showexponent: all | first | last | none = null,
    showgrid: js.UndefOr[Boolean] = js.undefined,
    showline: js.UndefOr[Boolean] = js.undefined,
    showspikes: js.UndefOr[Boolean] = js.undefined,
    showticklabels: js.UndefOr[Boolean] = js.undefined,
    showtickprefix: all | first | last | none = null,
    showticksuffix: all | first | last | none = null,
    spikecolor: Color = null,
    spikesides: js.UndefOr[Boolean] = js.undefined,
    spikethickness: Int | Double = null,
    tick0: Double | String = null,
    tickangle: Int | Double = null,
    tickcolor: Color = null,
    tickfont: PartialFont = null,
    tickformat: String = null,
    ticklen: Int | Double = null,
    tickmode: auto | linear | array = null,
    tickprefix: String = null,
    ticks: outside | inside | _empty = null,
    ticksuffix: String = null,
    ticktext: js.Array[String] = null,
    tickvals: js.Array[_] = null,
    tickwidth: Int | Double = null,
    title: String | PartialDataTitle = null,
    titlefont: PartialFont = null,
    `type`: AxisType = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zeroline: js.UndefOr[Boolean] = js.undefined,
    zerolinecolor: Color = null,
    zerolinewidth: Int | Double = null
  ): PartialSceneAxisAutorange = {
    val __obj = js.Dynamic.literal()
    if (autorange != null) __obj.updateDynamic("autorange")(autorange.asInstanceOf[js.Any])
    if (backgroundcolor != null) __obj.updateDynamic("backgroundcolor")(backgroundcolor.asInstanceOf[js.Any])
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (categoryarray != null) __obj.updateDynamic("categoryarray")(categoryarray.asInstanceOf[js.Any])
    if (categoryorder != null) __obj.updateDynamic("categoryorder")(categoryorder.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dtick != null) __obj.updateDynamic("dtick")(dtick.asInstanceOf[js.Any])
    if (exponentformat != null) __obj.updateDynamic("exponentformat")(exponentformat.asInstanceOf[js.Any])
    if (gridcolor != null) __obj.updateDynamic("gridcolor")(gridcolor.asInstanceOf[js.Any])
    if (gridwidth != null) __obj.updateDynamic("gridwidth")(gridwidth.asInstanceOf[js.Any])
    if (hoverformat != null) __obj.updateDynamic("hoverformat")(hoverformat.asInstanceOf[js.Any])
    if (linecolor != null) __obj.updateDynamic("linecolor")(linecolor.asInstanceOf[js.Any])
    if (linewidth != null) __obj.updateDynamic("linewidth")(linewidth.asInstanceOf[js.Any])
    if (mirror != null) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (nticks != null) __obj.updateDynamic("nticks")(nticks.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rangemode != null) __obj.updateDynamic("rangemode")(rangemode.asInstanceOf[js.Any])
    if (!js.isUndefined(separatethousands)) __obj.updateDynamic("separatethousands")(separatethousands.asInstanceOf[js.Any])
    if (!js.isUndefined(showaxeslabels)) __obj.updateDynamic("showaxeslabels")(showaxeslabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showbackground)) __obj.updateDynamic("showbackground")(showbackground.asInstanceOf[js.Any])
    if (showexponent != null) __obj.updateDynamic("showexponent")(showexponent.asInstanceOf[js.Any])
    if (!js.isUndefined(showgrid)) __obj.updateDynamic("showgrid")(showgrid.asInstanceOf[js.Any])
    if (!js.isUndefined(showline)) __obj.updateDynamic("showline")(showline.asInstanceOf[js.Any])
    if (!js.isUndefined(showspikes)) __obj.updateDynamic("showspikes")(showspikes.asInstanceOf[js.Any])
    if (!js.isUndefined(showticklabels)) __obj.updateDynamic("showticklabels")(showticklabels.asInstanceOf[js.Any])
    if (showtickprefix != null) __obj.updateDynamic("showtickprefix")(showtickprefix.asInstanceOf[js.Any])
    if (showticksuffix != null) __obj.updateDynamic("showticksuffix")(showticksuffix.asInstanceOf[js.Any])
    if (spikecolor != null) __obj.updateDynamic("spikecolor")(spikecolor.asInstanceOf[js.Any])
    if (!js.isUndefined(spikesides)) __obj.updateDynamic("spikesides")(spikesides.asInstanceOf[js.Any])
    if (spikethickness != null) __obj.updateDynamic("spikethickness")(spikethickness.asInstanceOf[js.Any])
    if (tick0 != null) __obj.updateDynamic("tick0")(tick0.asInstanceOf[js.Any])
    if (tickangle != null) __obj.updateDynamic("tickangle")(tickangle.asInstanceOf[js.Any])
    if (tickcolor != null) __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    if (tickfont != null) __obj.updateDynamic("tickfont")(tickfont.asInstanceOf[js.Any])
    if (tickformat != null) __obj.updateDynamic("tickformat")(tickformat.asInstanceOf[js.Any])
    if (ticklen != null) __obj.updateDynamic("ticklen")(ticklen.asInstanceOf[js.Any])
    if (tickmode != null) __obj.updateDynamic("tickmode")(tickmode.asInstanceOf[js.Any])
    if (tickprefix != null) __obj.updateDynamic("tickprefix")(tickprefix.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (ticksuffix != null) __obj.updateDynamic("ticksuffix")(ticksuffix.asInstanceOf[js.Any])
    if (ticktext != null) __obj.updateDynamic("ticktext")(ticktext.asInstanceOf[js.Any])
    if (tickvals != null) __obj.updateDynamic("tickvals")(tickvals.asInstanceOf[js.Any])
    if (tickwidth != null) __obj.updateDynamic("tickwidth")(tickwidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlefont != null) __obj.updateDynamic("titlefont")(titlefont.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroline)) __obj.updateDynamic("zeroline")(zeroline.asInstanceOf[js.Any])
    if (zerolinecolor != null) __obj.updateDynamic("zerolinecolor")(zerolinecolor.asInstanceOf[js.Any])
    if (zerolinewidth != null) __obj.updateDynamic("zerolinewidth")(zerolinewidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSceneAxisAutorange]
  }
}

