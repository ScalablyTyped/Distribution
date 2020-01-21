package typings.officeUiFabricReact.sliderBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderState extends js.Object {
  var renderedValue: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ISliderState {
  @scala.inline
  def apply(renderedValue: Int | Double = null, value: Int | Double = null): ISliderState = {
    val __obj = js.Dynamic.literal()
    if (renderedValue != null) __obj.updateDynamic("renderedValue")(renderedValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderState]
  }
}

