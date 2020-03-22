package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyOrderSensitive extends js.Object {
  var keyOrderSensitive: js.UndefOr[Boolean] = js.undefined
}

object AnonKeyOrderSensitive {
  @scala.inline
  def apply(keyOrderSensitive: js.UndefOr[Boolean] = js.undefined): AnonKeyOrderSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keyOrderSensitive)) __obj.updateDynamic("keyOrderSensitive")(keyOrderSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyOrderSensitive]
  }
}

