package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.end
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.onoff
import typings.plotlyJs.plotlyJsStrings.onout
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.pixel
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.start
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.x
import typings.plotlyJs.plotlyJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Annotations> */
trait PartialAnnotations extends js.Object {
  var align: js.UndefOr[left | center | right] = js.undefined
  var arrowcolor: js.UndefOr[String] = js.undefined
  var arrowhead: js.UndefOr[Double] = js.undefined
  var arrowside: js.UndefOr[end | start] = js.undefined
  var arrowsize: js.UndefOr[Double] = js.undefined
  var arrowwidth: js.UndefOr[Double] = js.undefined
  var ax: js.UndefOr[Double] = js.undefined
  var axref: js.UndefOr[pixel] = js.undefined
  var ay: js.UndefOr[Double] = js.undefined
  var ayref: js.UndefOr[pixel] = js.undefined
  var bgcolor: js.UndefOr[String] = js.undefined
  var bordercolor: js.UndefOr[String] = js.undefined
  var borderpad: js.UndefOr[Double] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var captureevents: js.UndefOr[Boolean] = js.undefined
  var clicktoshow: js.UndefOr[`false` | onoff | onout] = js.undefined
  var font: js.UndefOr[PartialFont] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverlabel: js.UndefOr[PartialHoverLabelAlign] = js.undefined
  var hovertext: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var showarrow: js.UndefOr[Boolean] = js.undefined
  var standoff: js.UndefOr[Double] = js.undefined
  var startarrowhead: js.UndefOr[Double] = js.undefined
  var startarrowsize: js.UndefOr[Double] = js.undefined
  var startstandoff: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textangle: js.UndefOr[String] = js.undefined
  var valign: js.UndefOr[top | middle | bottom] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double | String] = js.undefined
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  var xclick: js.UndefOr[js.Any] = js.undefined
  var xref: js.UndefOr[paper | x] = js.undefined
  var xshift: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double | String] = js.undefined
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
  var yclick: js.UndefOr[js.Any] = js.undefined
  var yref: js.UndefOr[paper | y] = js.undefined
  var yshift: js.UndefOr[Double] = js.undefined
}

object PartialAnnotations {
  @scala.inline
  def apply(
    align: left | center | right = null,
    arrowcolor: String = null,
    arrowhead: js.UndefOr[Double] = js.undefined,
    arrowside: end | start = null,
    arrowsize: js.UndefOr[Double] = js.undefined,
    arrowwidth: js.UndefOr[Double] = js.undefined,
    ax: js.UndefOr[Double] = js.undefined,
    axref: pixel = null,
    ay: js.UndefOr[Double] = js.undefined,
    ayref: pixel = null,
    bgcolor: String = null,
    bordercolor: String = null,
    borderpad: js.UndefOr[Double] = js.undefined,
    borderwidth: js.UndefOr[Double] = js.undefined,
    captureevents: js.UndefOr[Boolean] = js.undefined,
    clicktoshow: `false` | onoff | onout = null,
    font: PartialFont = null,
    height: js.UndefOr[Double] = js.undefined,
    hoverlabel: PartialHoverLabelAlign = null,
    hovertext: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    showarrow: js.UndefOr[Boolean] = js.undefined,
    standoff: js.UndefOr[Double] = js.undefined,
    startarrowhead: js.UndefOr[Double] = js.undefined,
    startarrowsize: js.UndefOr[Double] = js.undefined,
    startstandoff: js.UndefOr[Double] = js.undefined,
    text: String = null,
    textangle: String = null,
    valign: top | middle | bottom = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: Double | String = null,
    xanchor: auto | left | center | right = null,
    xclick: js.Any = null,
    xref: paper | x = null,
    xshift: js.UndefOr[Double] = js.undefined,
    y: Double | String = null,
    yanchor: auto | top | middle | bottom = null,
    yclick: js.Any = null,
    yref: paper | y = null,
    yshift: js.UndefOr[Double] = js.undefined
  ): PartialAnnotations = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrowcolor != null) __obj.updateDynamic("arrowcolor")(arrowcolor.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowhead)) __obj.updateDynamic("arrowhead")(arrowhead.get.asInstanceOf[js.Any])
    if (arrowside != null) __obj.updateDynamic("arrowside")(arrowside.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowsize)) __obj.updateDynamic("arrowsize")(arrowsize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowwidth)) __obj.updateDynamic("arrowwidth")(arrowwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ax)) __obj.updateDynamic("ax")(ax.get.asInstanceOf[js.Any])
    if (axref != null) __obj.updateDynamic("axref")(axref.asInstanceOf[js.Any])
    if (!js.isUndefined(ay)) __obj.updateDynamic("ay")(ay.get.asInstanceOf[js.Any])
    if (ayref != null) __obj.updateDynamic("ayref")(ayref.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderpad)) __obj.updateDynamic("borderpad")(borderpad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderwidth)) __obj.updateDynamic("borderwidth")(borderwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureevents)) __obj.updateDynamic("captureevents")(captureevents.get.asInstanceOf[js.Any])
    if (clicktoshow != null) __obj.updateDynamic("clicktoshow")(clicktoshow.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hoverlabel != null) __obj.updateDynamic("hoverlabel")(hoverlabel.asInstanceOf[js.Any])
    if (hovertext != null) __obj.updateDynamic("hovertext")(hovertext.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showarrow)) __obj.updateDynamic("showarrow")(showarrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(standoff)) __obj.updateDynamic("standoff")(standoff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startarrowhead)) __obj.updateDynamic("startarrowhead")(startarrowhead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startarrowsize)) __obj.updateDynamic("startarrowsize")(startarrowsize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startstandoff)) __obj.updateDynamic("startstandoff")(startstandoff.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textangle != null) __obj.updateDynamic("textangle")(textangle.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (xclick != null) __obj.updateDynamic("xclick")(xclick.asInstanceOf[js.Any])
    if (xref != null) __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    if (!js.isUndefined(xshift)) __obj.updateDynamic("xshift")(xshift.get.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    if (yclick != null) __obj.updateDynamic("yclick")(yclick.asInstanceOf[js.Any])
    if (yref != null) __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    if (!js.isUndefined(yshift)) __obj.updateDynamic("yshift")(yshift.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAnnotations]
  }
}

