package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngleLockEquationOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
}

object AngleLockEquationOptions {
  @scala.inline
  def apply(angle: js.UndefOr[Double] = js.undefined, ratio: js.UndefOr[Double] = js.undefined): AngleLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleLockEquationOptions]
  }
}

