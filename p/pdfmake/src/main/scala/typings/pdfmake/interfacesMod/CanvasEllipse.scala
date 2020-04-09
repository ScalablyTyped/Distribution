package typings.pdfmake.interfacesMod

import typings.pdfmake.AnonLength
import typings.pdfmake.pdfmakeStrings.ellipse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasEllipse
  extends CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  var r1: Double
  var r2: js.UndefOr[Double] = js.undefined
  var `type`: ellipse
  var x: Double
  var y: Double
}

object CanvasEllipse {
  @scala.inline
  def apply(
    r1: Double,
    `type`: ellipse,
    x: Double,
    y: Double,
    color: String = null,
    dash: AnonLength = null,
    fillOpacity: Int | Double = null,
    lineColor: String = null,
    lineWidth: Int | Double = null,
    linearGradient: js.Array[String] = null,
    r2: Int | Double = null
  ): CanvasEllipse = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    if (r2 != null) __obj.updateDynamic("r2")(r2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasEllipse]
  }
}

