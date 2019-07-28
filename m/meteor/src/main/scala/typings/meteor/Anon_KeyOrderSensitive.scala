package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyOrderSensitive extends js.Object {
  var keyOrderSensitive: js.UndefOr[Boolean] = js.undefined
}

object Anon_KeyOrderSensitive {
  @scala.inline
  def apply(keyOrderSensitive: js.UndefOr[Boolean] = js.undefined): Anon_KeyOrderSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keyOrderSensitive)) __obj.updateDynamic("keyOrderSensitive")(keyOrderSensitive)
    __obj.asInstanceOf[Anon_KeyOrderSensitive]
  }
}

