package typings.pdfmake.interfacesMod

import typings.pdfmake.AnonLength
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
    dash: AnonLength = null,
    fillOpacity: Int | Double = null,
    lineColor: String = null,
    lineWidth: Int | Double = null,
    linearGradient: js.Array[String] = null,
    r: Int | Double = null
  ): CanvasRect = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRect]
  }
}

