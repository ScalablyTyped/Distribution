package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
}

object AnonBottom {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    right: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined
  ): AnonBottom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

