package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewVal extends js.Object {
  var newVal: js.UndefOr[Boolean] = js.undefined
  var oldVal: js.UndefOr[Boolean] = js.undefined
}

object AnonNewVal {
  @scala.inline
  def apply(newVal: js.UndefOr[Boolean] = js.undefined, oldVal: js.UndefOr[Boolean] = js.undefined): AnonNewVal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newVal)) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (!js.isUndefined(oldVal)) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewVal]
  }
}

