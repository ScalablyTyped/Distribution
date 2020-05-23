package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasFilledElement extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var linearGradient: js.UndefOr[js.Array[String]] = js.undefined
}

object CanvasFilledElement {
  @scala.inline
  def apply(
    color: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    linearGradient: js.Array[String] = null
  ): CanvasFilledElement = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasFilledElement]
  }
}

