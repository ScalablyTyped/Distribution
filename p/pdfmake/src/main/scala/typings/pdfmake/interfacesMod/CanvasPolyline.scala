package typings.pdfmake.interfacesMod

import typings.pdfmake.AnonLength
import typings.pdfmake.AnonX
import typings.pdfmake.pdfmakeStrings.polyline
import typings.pdfmake.pdfmakeStrings.round
import typings.pdfmake.pdfmakeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPolyline
  extends CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  var closePath: js.UndefOr[Boolean] = js.undefined
  var lineCap: js.UndefOr[round | square] = js.undefined
  var points: js.Array[AnonX]
  var `type`: polyline
}

object CanvasPolyline {
  @scala.inline
  def apply(
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
  ): CanvasPolyline = {
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
    __obj.asInstanceOf[CanvasPolyline]
  }
}

