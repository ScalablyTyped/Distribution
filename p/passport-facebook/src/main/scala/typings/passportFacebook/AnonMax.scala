package typings.passportFacebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: Double
}

object AnonMax {
  @scala.inline
  def apply(min: Double, max: Int | Double = null): AnonMax = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

