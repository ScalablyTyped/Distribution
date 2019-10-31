package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Getters extends js.Object {
  var getters: js.UndefOr[Boolean] = js.undefined
  var virtuals: js.UndefOr[Boolean] = js.undefined
}

object Anon_Getters {
  @scala.inline
  def apply(getters: js.UndefOr[Boolean] = js.undefined, virtuals: js.UndefOr[Boolean] = js.undefined): Anon_Getters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(getters)) __obj.updateDynamic("getters")(getters)
    if (!js.isUndefined(virtuals)) __obj.updateDynamic("virtuals")(virtuals)
    __obj.asInstanceOf[Anon_Getters]
  }
}

