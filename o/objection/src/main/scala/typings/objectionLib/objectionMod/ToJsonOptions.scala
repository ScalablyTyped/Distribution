package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToJsonOptions extends CloneOptions {
  var virtuals: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
}

object ToJsonOptions {
  @scala.inline
  def apply(
    shallow: js.UndefOr[scala.Boolean] = js.undefined,
    virtuals: scala.Boolean | js.Array[java.lang.String] = null
  ): ToJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    if (virtuals != null) __obj.updateDynamic("virtuals")(virtuals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToJsonOptions]
  }
}

