package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngleLockEquationOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
}

object AngleLockEquationOptions {
  @scala.inline
  def apply(angle: Int | Double = null, ratio: Int | Double = null): AngleLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleLockEquationOptions]
  }
}

