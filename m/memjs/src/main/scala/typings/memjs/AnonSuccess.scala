package typings.memjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuccess extends js.Object {
  var success: Boolean
  var value: js.UndefOr[Double | Null] = js.undefined
}

object AnonSuccess {
  @scala.inline
  def apply(success: Boolean, value: Int | Double = null): AnonSuccess = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuccess]
  }
}

