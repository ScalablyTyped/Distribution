package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoIndexId extends js.Object {
  var autoIndexId: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Anon_AutoIndexId {
  @scala.inline
  def apply(
    autoIndexId: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    size: Int | Double = null
  ): Anon_AutoIndexId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndexId)) __obj.updateDynamic("autoIndexId")(autoIndexId)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoIndexId]
  }
}

