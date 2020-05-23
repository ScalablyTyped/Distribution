package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.Length
import typings.pdfmake.pdfmakeStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRect
  extends CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  var h: Double
  var r: js.UndefOr[Double] = js.undefined
  var `type`: rect
  var w: Double
  var x: Double
  var y: Double
}

object CanvasRect {
  @scala.inline
  def apply(
    h: Double,
    `type`: rect,
    w: Double,
    x: Double,
    y: Double,
    color: String = null,
    dash: Length = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    lineColor: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    linearGradient: js.Array[String] = null,
    r: js.UndefOr[Double] = js.undefined
  ): CanvasRect = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRect]
  }
}

