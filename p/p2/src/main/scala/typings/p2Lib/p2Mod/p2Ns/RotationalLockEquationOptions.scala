package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationalLockEquationOptions extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
}

object RotationalLockEquationOptions {
  @scala.inline
  def apply(angle: scala.Int | scala.Double = null): RotationalLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationalLockEquationOptions]
  }
}

