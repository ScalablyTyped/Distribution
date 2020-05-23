package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasLineElement extends js.Object {
  var dash: js.UndefOr[Length] = js.undefined
  var lineColor: js.UndefOr[String] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object CanvasLineElement {
  @scala.inline
  def apply(dash: Length = null, lineColor: String = null, lineWidth: js.UndefOr[Double] = js.undefined): CanvasLineElement = {
    val __obj = js.Dynamic.literal()
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasLineElement]
  }
}

