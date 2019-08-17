package typings.officeDashUiDashFabricDashReact.libComponentsSliderSliderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
  def focus(): Unit
}

object ISlider {
  @scala.inline
  def apply(focus: () => Unit, value: Int | Double = null): ISlider = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlider]
  }
}

