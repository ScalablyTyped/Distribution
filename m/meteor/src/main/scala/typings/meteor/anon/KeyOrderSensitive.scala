package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOrderSensitive extends js.Object {
  var keyOrderSensitive: js.UndefOr[Boolean] = js.undefined
}

object KeyOrderSensitive {
  @scala.inline
  def apply(keyOrderSensitive: js.UndefOr[Boolean] = js.undefined): KeyOrderSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keyOrderSensitive)) __obj.updateDynamic("keyOrderSensitive")(keyOrderSensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOrderSensitive]
  }
}

