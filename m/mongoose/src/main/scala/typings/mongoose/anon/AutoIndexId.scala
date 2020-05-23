package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoIndexId extends js.Object {
  var autoIndexId: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object AutoIndexId {
  @scala.inline
  def apply(
    autoIndexId: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): AutoIndexId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndexId)) __obj.updateDynamic("autoIndexId")(autoIndexId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoIndexId]
  }
}

