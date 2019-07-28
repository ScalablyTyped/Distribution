package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GSSolverOptions extends js.Object {
  var iterations: js.UndefOr[Double] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object GSSolverOptions {
  @scala.inline
  def apply(iterations: Int | Double = null, tolerance: Int | Double = null): GSSolverOptions = {
    val __obj = js.Dynamic.literal()
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GSSolverOptions]
  }
}

