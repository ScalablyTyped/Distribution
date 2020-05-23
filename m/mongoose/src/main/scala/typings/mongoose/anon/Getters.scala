package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Getters extends js.Object {
  var getters: js.UndefOr[Boolean] = js.undefined
  var virtuals: js.UndefOr[Boolean] = js.undefined
}

object Getters {
  @scala.inline
  def apply(getters: js.UndefOr[Boolean] = js.undefined, virtuals: js.UndefOr[Boolean] = js.undefined): Getters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(getters)) __obj.updateDynamic("getters")(getters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtuals)) __obj.updateDynamic("virtuals")(virtuals.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Getters]
  }
}

