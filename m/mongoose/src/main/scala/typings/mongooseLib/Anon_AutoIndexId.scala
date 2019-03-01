package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoIndexId extends js.Object {
  var autoIndexId: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AutoIndexId {
  @scala.inline
  def apply(
    autoIndexId: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
  ): Anon_AutoIndexId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndexId)) __obj.updateDynamic("autoIndexId")(autoIndexId)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoIndexId]
  }
}

