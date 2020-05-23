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
  def apply(renderedValue: js.UndefOr[Double] = js.undefined, value: js.UndefOr[Double] = js.undefined): ISliderState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(renderedValue)) __obj.updateDynamic("renderedValue")(renderedValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderState]
  }
}

