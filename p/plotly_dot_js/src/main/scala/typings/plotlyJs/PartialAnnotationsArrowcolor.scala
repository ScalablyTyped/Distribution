package typings.plotlyJs

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
trait PartialAnnotationsArrowcolor extends js.Object {
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
  var hoverlabel: js.UndefOr[PartialHoverLabel] = js.undefined
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

object PartialAnnotationsArrowcolor {
  @scala.inline
  def apply(
    align: left | center | right = null,
    arrowcolor: String = null,
    arrowhead: Int | Double = null,
    arrowside: end | start = null,
    arrowsize: Int | Double = null,
    arrowwidth: Int | Double = null,
    ax: Int | Double = null,
    axref: pixel = null,
    ay: Int | Double = null,
    ayref: pixel = null,
    bgcolor: String = null,
    bordercolor: String = null,
    borderpad: Int | Double = null,
    borderwidth: Int | Double = null,
    captureevents: js.UndefOr[Boolean] = js.undefined,
    clicktoshow: `false` | onoff | onout = null,
    font: PartialFont = null,
    height: Int | Double = null,
    hoverlabel: PartialHoverLabel = null,
    hovertext: String = null,
    opacity: Int | Double = null,
    showarrow: js.UndefOr[Boolean] = js.undefined,
    standoff: Int | Double = null,
    startarrowhead: Int | Double = null,
    startarrowsize: Int | Double = null,
    startstandoff: Int | Double = null,
    text: String = null,
    textangle: String = null,
    valign: top | middle | bottom = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Double | String = null,
    xanchor: auto | left | center | right = null,
    xclick: js.Any = null,
    xref: paper | x = null,
    xshift: Int | Double = null,
    y: Double | String = null,
    yanchor: auto | top | middle | bottom = null,
    yclick: js.Any = null,
    yref: paper | y = null,
    yshift: Int | Double = null
  ): PartialAnnotationsArrowcolor = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrowcolor != null) __obj.updateDynamic("arrowcolor")(arrowcolor.asInstanceOf[js.Any])
    if (arrowhead != null) __obj.updateDynamic("arrowhead")(arrowhead.asInstanceOf[js.Any])
    if (arrowside != null) __obj.updateDynamic("arrowside")(arrowside.asInstanceOf[js.Any])
    if (arrowsize != null) __obj.updateDynamic("arrowsize")(arrowsize.asInstanceOf[js.Any])
    if (arrowwidth != null) __obj.updateDynamic("arrowwidth")(arrowwidth.asInstanceOf[js.Any])
    if (ax != null) __obj.updateDynamic("ax")(ax.asInstanceOf[js.Any])
    if (axref != null) __obj.updateDynamic("axref")(axref.asInstanceOf[js.Any])
    if (ay != null) __obj.updateDynamic("ay")(ay.asInstanceOf[js.Any])
    if (ayref != null) __obj.updateDynamic("ayref")(ayref.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (borderpad != null) __obj.updateDynamic("borderpad")(borderpad.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(captureevents)) __obj.updateDynamic("captureevents")(captureevents.asInstanceOf[js.Any])
    if (clicktoshow != null) __obj.updateDynamic("clicktoshow")(clicktoshow.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverlabel != null) __obj.updateDynamic("hoverlabel")(hoverlabel.asInstanceOf[js.Any])
    if (hovertext != null) __obj.updateDynamic("hovertext")(hovertext.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(showarrow)) __obj.updateDynamic("showarrow")(showarrow.asInstanceOf[js.Any])
    if (standoff != null) __obj.updateDynamic("standoff")(standoff.asInstanceOf[js.Any])
    if (startarrowhead != null) __obj.updateDynamic("startarrowhead")(startarrowhead.asInstanceOf[js.Any])
    if (startarrowsize != null) __obj.updateDynamic("startarrowsize")(startarrowsize.asInstanceOf[js.Any])
    if (startstandoff != null) __obj.updateDynamic("startstandoff")(startstandoff.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textangle != null) __obj.updateDynamic("textangle")(textangle.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (xclick != null) __obj.updateDynamic("xclick")(xclick.asInstanceOf[js.Any])
    if (xref != null) __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    if (xshift != null) __obj.updateDynamic("xshift")(xshift.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    if (yclick != null) __obj.updateDynamic("yclick")(yclick.asInstanceOf[js.Any])
    if (yref != null) __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    if (yshift != null) __obj.updateDynamic("yshift")(yshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAnnotationsArrowcolor]
  }
}

