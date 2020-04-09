package typings.pdfmake.interfacesMod

import typings.pdfmake.AnonLength
import typings.pdfmake.AnonX
import typings.pdfmake.pdfmakeStrings.ellipse
import typings.pdfmake.pdfmakeStrings.line
import typings.pdfmake.pdfmakeStrings.polyline
import typings.pdfmake.pdfmakeStrings.rect
import typings.pdfmake.pdfmakeStrings.round
import typings.pdfmake.pdfmakeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.interfacesMod.CanvasRect
  - typings.pdfmake.interfacesMod.CanvasPolyline
  - typings.pdfmake.interfacesMod.CanvasLine
  - typings.pdfmake.interfacesMod.CanvasEllipse
*/
trait CanvasElement extends js.Object

object CanvasElement {
  @scala.inline
  def CanvasRect(
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
  ): CanvasElement = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasElement]
  }
  @scala.inline
  def CanvasPolyline(
    points: js.Array[AnonX],
    `type`: polyline,
    closePath: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dash: AnonLength = null,
    fillOpacity: Int | Double = null,
    lineCap: round | square = null,
    lineColor: String = null,
    lineWidth: Int | Double = null,
    linearGradient: js.Array[String] = null
  ): CanvasElement = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(closePath)) __obj.updateDynamic("closePath")(closePath.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasElement]
  }
  @scala.inline
  def CanvasLine(
    `type`: line,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double,
    dash: AnonLength = null,
    lineCap: round | square = null,
    lineColor: String = null,
    lineWidth: Int | Double = null
  ): CanvasElement = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasElement]
  }
  @scala.inline
  def CanvasEllipse(
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
  ): CanvasElement = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    if (r2 != null) __obj.updateDynamic("r2")(r2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasElement]
  }
}

