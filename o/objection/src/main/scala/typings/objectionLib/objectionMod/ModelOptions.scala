package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelOptions extends js.Object {
  var old: js.UndefOr[js.Object] = js.undefined
  var patch: js.UndefOr[scala.Boolean] = js.undefined
  var skipValidation: js.UndefOr[scala.Boolean] = js.undefined
}

object ModelOptions {
  @scala.inline
  def apply(
    old: js.Object = null,
    patch: js.UndefOr[scala.Boolean] = js.undefined,
    skipValidation: js.UndefOr[scala.Boolean] = js.undefined
  ): ModelOptions = {
    val __obj = js.Dynamic.literal()
    if (old != null) __obj.updateDynamic("old")(old)
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch)
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation)
    __obj.asInstanceOf[ModelOptions]
  }
}

