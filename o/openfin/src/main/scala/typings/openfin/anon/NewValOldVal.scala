package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValOldVal extends js.Object {
  var newVal: js.UndefOr[Double] = js.undefined
  var oldVal: js.UndefOr[Double] = js.undefined
}

object NewValOldVal {
  @scala.inline
  def apply(newVal: js.UndefOr[Double] = js.undefined, oldVal: js.UndefOr[Double] = js.undefined): NewValOldVal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newVal)) __obj.updateDynamic("newVal")(newVal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldVal)) __obj.updateDynamic("oldVal")(oldVal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValOldVal]
  }
}

