package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelOptions extends js.Object {
  var patch: js.UndefOr[scala.Boolean] = js.undefined
  var skipValidation: js.UndefOr[scala.Boolean] = js.undefined
}

object ModelOptions {
  @scala.inline
  def apply(
    patch: js.UndefOr[scala.Boolean] = js.undefined,
    skipValidation: js.UndefOr[scala.Boolean] = js.undefined
  ): ModelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch)
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation)
    __obj.asInstanceOf[ModelOptions]
  }
}

