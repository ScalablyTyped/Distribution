package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
import typings.plotlyJs.plotlyJsStrings.above
import typings.plotlyJs.plotlyJsStrings.below
import typings.plotlyJs.plotlyJsStrings.circle
import typings.plotlyJs.plotlyJsStrings.line
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.path
import typings.plotlyJs.plotlyJsStrings.pixel
import typings.plotlyJs.plotlyJsStrings.rect
import typings.plotlyJs.plotlyJsStrings.scaled
import typings.plotlyJs.plotlyJsStrings.x
import typings.plotlyJs.plotlyJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Shape> */
trait PartialShape extends js.Object {
  var fillcolor: js.UndefOr[String] = js.undefined
  var layer: js.UndefOr[below | above] = js.undefined
  var line: js.UndefOr[PartialShapeLine] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var templateitemname: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[rect | circle | line | path] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var x0: js.UndefOr[Datum] = js.undefined
  var x1: js.UndefOr[Datum] = js.undefined
  var xanchor: js.UndefOr[Double | String] = js.undefined
  var xref: js.UndefOr[x | paper] = js.undefined
  var xsizemode: js.UndefOr[scaled | pixel] = js.undefined
  var y0: js.UndefOr[Datum] = js.undefined
  var y1: js.UndefOr[Datum] = js.undefined
  var yanchor: js.UndefOr[Double | String] = js.undefined
  var yref: js.UndefOr[paper | y] = js.undefined
  var ysizemode: js.UndefOr[scaled | pixel] = js.undefined
}

object PartialShape {
  @scala.inline
  def apply(
    fillcolor: String = null,
    layer: below | above = null,
    line: PartialShapeLine = null,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    path: String = null,
    templateitemname: String = null,
    `type`: rect | circle | line | path = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x0: js.UndefOr[Null | Datum] = js.undefined,
    x1: js.UndefOr[Null | Datum] = js.undefined,
    xanchor: Double | String = null,
    xref: x | paper = null,
    xsizemode: scaled | pixel = null,
    y0: js.UndefOr[Null | Datum] = js.undefined,
    y1: js.UndefOr[Null | Datum] = js.undefined,
    yanchor: Double | String = null,
    yref: paper | y = null,
    ysizemode: scaled | pixel = null
  ): PartialShape = {
    val __obj = js.Dynamic.literal()
    if (fillcolor != null) __obj.updateDynamic("fillcolor")(fillcolor.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (templateitemname != null) __obj.updateDynamic("templateitemname")(templateitemname.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x0)) __obj.updateDynamic("x0")(x0.asInstanceOf[js.Any])
    if (!js.isUndefined(x1)) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (xref != null) __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    if (xsizemode != null) __obj.updateDynamic("xsizemode")(xsizemode.asInstanceOf[js.Any])
    if (!js.isUndefined(y0)) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    if (yref != null) __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    if (ysizemode != null) __obj.updateDynamic("ysizemode")(ysizemode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialShape]
  }
}

