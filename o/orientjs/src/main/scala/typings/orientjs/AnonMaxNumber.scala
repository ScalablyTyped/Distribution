package typings.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxNumber extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
}

object AnonMaxNumber {
  @scala.inline
  def apply(max: Int | Double = null): AnonMaxNumber = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxNumber]
  }
}

