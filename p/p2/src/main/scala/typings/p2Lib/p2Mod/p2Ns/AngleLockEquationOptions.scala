package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngleLockEquationOptions extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
}

object AngleLockEquationOptions {
  @scala.inline
  def apply(angle: scala.Int | scala.Double = null, ratio: scala.Int | scala.Double = null): AngleLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleLockEquationOptions]
  }
}

