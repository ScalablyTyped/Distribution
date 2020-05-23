package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewVal extends js.Object {
  var newVal: js.UndefOr[Boolean] = js.undefined
  var oldVal: js.UndefOr[Boolean] = js.undefined
}

object NewVal {
  @scala.inline
  def apply(newVal: js.UndefOr[Boolean] = js.undefined, oldVal: js.UndefOr[Boolean] = js.undefined): NewVal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newVal)) __obj.updateDynamic("newVal")(newVal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldVal)) __obj.updateDynamic("oldVal")(oldVal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewVal]
  }
}

