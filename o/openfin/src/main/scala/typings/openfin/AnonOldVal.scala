package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOldVal extends js.Object {
  var newVal: js.UndefOr[Double] = js.undefined
  var oldVal: js.UndefOr[Double] = js.undefined
}

object AnonOldVal {
  @scala.inline
  def apply(newVal: Int | Double = null, oldVal: Int | Double = null): AnonOldVal = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldVal]
  }
}

