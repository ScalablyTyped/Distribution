package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GSSolverOptions extends js.Object {
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

object GSSolverOptions {
  @scala.inline
  def apply(iterations: scala.Int | scala.Double = null, tolerance: scala.Int | scala.Double = null): GSSolverOptions = {
    val __obj = js.Dynamic.literal()
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GSSolverOptions]
  }
}

