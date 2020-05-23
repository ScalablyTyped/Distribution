package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.Length
import typings.pdfmake.pdfmakeStrings.line
import typings.pdfmake.pdfmakeStrings.round
import typings.pdfmake.pdfmakeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasLine
  extends CanvasLineElement
     with CanvasElement {
  var lineCap: js.UndefOr[round | square] = js.undefined
  var `type`: line
  var x1: Double
  var x2: Double
  var y1: Double
  var y2: Double
}

object CanvasLine {
  @scala.inline
  def apply(
    `type`: line,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double,
    dash: Length = null,
    lineCap: round | square = null,
    lineColor: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined
  ): CanvasLine = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasLine]
  }
}

