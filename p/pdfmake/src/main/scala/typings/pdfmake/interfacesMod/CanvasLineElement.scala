package typings.pdfmake.interfacesMod

import typings.pdfmake.AnonLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasLineElement extends js.Object {
  var dash: js.UndefOr[AnonLength] = js.undefined
  var lineColor: js.UndefOr[String] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object CanvasLineElement {
  @scala.inline
  def apply(dash: AnonLength = null, lineColor: String = null, lineWidth: Int | Double = null): CanvasLineElement = {
    val __obj = js.Dynamic.literal()
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasLineElement]
  }
}

