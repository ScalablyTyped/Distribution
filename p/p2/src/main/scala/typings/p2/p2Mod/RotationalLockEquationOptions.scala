package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationalLockEquationOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
}

object RotationalLockEquationOptions {
  @scala.inline
  def apply(angle: Int | Double = null): RotationalLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationalLockEquationOptions]
  }
}

