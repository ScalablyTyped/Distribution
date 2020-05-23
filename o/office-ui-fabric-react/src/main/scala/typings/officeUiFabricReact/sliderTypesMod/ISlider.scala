package typings.officeUiFabricReact.sliderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
  def focus(): Unit
}

object ISlider {
  @scala.inline
  def apply(focus: () => Unit, value: js.UndefOr[Double] = js.undefined): ISlider = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlider]
  }
}

