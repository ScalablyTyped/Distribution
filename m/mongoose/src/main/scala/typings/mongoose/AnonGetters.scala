package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetters extends js.Object {
  var getters: js.UndefOr[Boolean] = js.undefined
  var virtuals: js.UndefOr[Boolean] = js.undefined
}

object AnonGetters {
  @scala.inline
  def apply(getters: js.UndefOr[Boolean] = js.undefined, virtuals: js.UndefOr[Boolean] = js.undefined): AnonGetters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(getters)) __obj.updateDynamic("getters")(getters.asInstanceOf[js.Any])
    if (!js.isUndefined(virtuals)) __obj.updateDynamic("virtuals")(virtuals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetters]
  }
}

