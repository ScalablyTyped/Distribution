package typings.plotlyJs

import typings.plotlyJs.mod.Color
import typings.plotlyJs.mod.Datum
import typings.plotlyJs.mod.Font
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ColorBar> */
trait PartialColorBar extends js.Object {
  var bgcolor: js.UndefOr[Color] = js.undefined
  var bordercolor: js.UndefOr[Color] = js.undefined
  var borderwidth: js.UndefOr[Color] = js.undefined
  var dtick: js.UndefOr[Double | String] = js.undefined
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.undefined
  var len: js.UndefOr[Double] = js.undefined
  var lenmode: js.UndefOr[fraction | pixels] = js.undefined
  var nticks: js.UndefOr[Double] = js.undefined
  var outlinecolor: js.UndefOr[Color] = js.undefined
  var outlinewidth: js.UndefOr[Double] = js.undefined
  var separatethousands: js.UndefOr[Boolean] = js.undefined
  var showexponent: js.UndefOr[all | first | last | none] = js.undefined
  var showticklabels: js.UndefOr[Boolean] = js.undefined
  var showtickprefix: js.UndefOr[all | first | last | none] = js.undefined
  var showticksuffix: js.UndefOr[all | first | last | none] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var thicknessmode: js.UndefOr[fraction | pixels] = js.undefined
  var tick0: js.UndefOr[Double | String] = js.undefined
  var tickangle: js.UndefOr[Double] = js.undefined
  var tickcolor: js.UndefOr[Color] = js.undefined
  var tickfont: js.UndefOr[Font] = js.undefined
  var tickformat: js.UndefOr[String] = js.undefined
  var tickformatstops: js.UndefOr[AnonDtickrange] = js.undefined
  var ticklen: js.UndefOr[Double] = js.undefined
  var tickmode: js.UndefOr[auto | linear | array] = js.undefined
  var tickprefix: js.UndefOr[String] = js.undefined
  var ticks: js.UndefOr[outside | inside | _empty] = js.undefined
  var ticksuffix: js.UndefOr[String] = js.undefined
  var ticktext: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.undefined
  var ticktextsrc: js.UndefOr[js.Any] = js.undefined
  var tickvals: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.undefined
  var tickvalssrc: js.UndefOr[js.Any] = js.undefined
  var tickwidth: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlefont: js.UndefOr[Font] = js.undefined
  var titleside: js.UndefOr[right | top | bottom] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xanchor: js.UndefOr[left | center | right] = js.undefined
  var xpad: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yanchor: js.UndefOr[top | middle | bottom] = js.undefined
  var ypad: js.UndefOr[Double] = js.undefined
}

object PartialColorBar {
  @scala.inline
  def apply(
    bgcolor: Color = null,
    bordercolor: Color = null,
    borderwidth: Color = null,
    dtick: Double | String = null,
    exponentformat: none | e_ | E | power | SI | B = null,
    len: Int | Double = null,
    lenmode: fraction | pixels = null,
    nticks: Int | Double = null,
    outlinecolor: Color = null,
    outlinewidth: Int | Double = null,
    separatethousands: js.UndefOr[Boolean] = js.undefined,
    showexponent: all | first | last | none = null,
    showticklabels: js.UndefOr[Boolean] = js.undefined,
    showtickprefix: all | first | last | none = null,
    showticksuffix: all | first | last | none = null,
    thickness: Int | Double = null,
    thicknessmode: fraction | pixels = null,
    tick0: Double | String = null,
    tickangle: Int | Double = null,
    tickcolor: Color = null,
    tickfont: Font = null,
    tickformat: String = null,
    tickformatstops: AnonDtickrange = null,
    ticklen: Int | Double = null,
    tickmode: auto | linear | array = null,
    tickprefix: String = null,
    ticks: outside | inside | _empty = null,
    ticksuffix: String = null,
    ticktext: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray = null,
    ticktextsrc: js.Any = null,
    tickvals: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray = null,
    tickvalssrc: js.Any = null,
    tickwidth: Int | Double = null,
    title: String = null,
    titlefont: Font = null,
    titleside: right | top | bottom = null,
    x: Int | Double = null,
    xanchor: left | center | right = null,
    xpad: Int | Double = null,
    y: Int | Double = null,
    yanchor: top | middle | bottom = null,
    ypad: Int | Double = null
  ): PartialColorBar = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (dtick != null) __obj.updateDynamic("dtick")(dtick.asInstanceOf[js.Any])
    if (exponentformat != null) __obj.updateDynamic("exponentformat")(exponentformat.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (lenmode != null) __obj.updateDynamic("lenmode")(lenmode.asInstanceOf[js.Any])
    if (nticks != null) __obj.updateDynamic("nticks")(nticks.asInstanceOf[js.Any])
    if (outlinecolor != null) __obj.updateDynamic("outlinecolor")(outlinecolor.asInstanceOf[js.Any])
    if (outlinewidth != null) __obj.updateDynamic("outlinewidth")(outlinewidth.asInstanceOf[js.Any])
    if (!js.isUndefined(separatethousands)) __obj.updateDynamic("separatethousands")(separatethousands.asInstanceOf[js.Any])
    if (showexponent != null) __obj.updateDynamic("showexponent")(showexponent.asInstanceOf[js.Any])
    if (!js.isUndefined(showticklabels)) __obj.updateDynamic("showticklabels")(showticklabels.asInstanceOf[js.Any])
    if (showtickprefix != null) __obj.updateDynamic("showtickprefix")(showtickprefix.asInstanceOf[js.Any])
    if (showticksuffix != null) __obj.updateDynamic("showticksuffix")(showticksuffix.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (thicknessmode != null) __obj.updateDynamic("thicknessmode")(thicknessmode.asInstanceOf[js.Any])
    if (tick0 != null) __obj.updateDynamic("tick0")(tick0.asInstanceOf[js.Any])
    if (tickangle != null) __obj.updateDynamic("tickangle")(tickangle.asInstanceOf[js.Any])
    if (tickcolor != null) __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    if (tickfont != null) __obj.updateDynamic("tickfont")(tickfont.asInstanceOf[js.Any])
    if (tickformat != null) __obj.updateDynamic("tickformat")(tickformat.asInstanceOf[js.Any])
    if (tickformatstops != null) __obj.updateDynamic("tickformatstops")(tickformatstops.asInstanceOf[js.Any])
    if (ticklen != null) __obj.updateDynamic("ticklen")(ticklen.asInstanceOf[js.Any])
    if (tickmode != null) __obj.updateDynamic("tickmode")(tickmode.asInstanceOf[js.Any])
    if (tickprefix != null) __obj.updateDynamic("tickprefix")(tickprefix.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (ticksuffix != null) __obj.updateDynamic("ticksuffix")(ticksuffix.asInstanceOf[js.Any])
    if (ticktext != null) __obj.updateDynamic("ticktext")(ticktext.asInstanceOf[js.Any])
    if (ticktextsrc != null) __obj.updateDynamic("ticktextsrc")(ticktextsrc.asInstanceOf[js.Any])
    if (tickvals != null) __obj.updateDynamic("tickvals")(tickvals.asInstanceOf[js.Any])
    if (tickvalssrc != null) __obj.updateDynamic("tickvalssrc")(tickvalssrc.asInstanceOf[js.Any])
    if (tickwidth != null) __obj.updateDynamic("tickwidth")(tickwidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlefont != null) __obj.updateDynamic("titlefont")(titlefont.asInstanceOf[js.Any])
    if (titleside != null) __obj.updateDynamic("titleside")(titleside.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (xpad != null) __obj.updateDynamic("xpad")(xpad.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    if (ypad != null) __obj.updateDynamic("ypad")(ypad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialColorBar]
  }
}

