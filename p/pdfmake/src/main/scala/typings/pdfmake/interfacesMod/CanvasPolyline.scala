package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.Length
import typings.pdfmake.anon.X
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
  var points: js.Array[X]
  var `type`: polyline
}

object CanvasPolyline {
  @scala.inline
  def apply(
    points: js.Array[X],
    `type`: polyline,
    closePath: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dash: Length = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    lineCap: round | square = null,
    lineColor: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    linearGradient: js.Array[String] = null
  ): CanvasPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(closePath)) __obj.updateDynamic("closePath")(closePath.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPolyline]
  }
}

