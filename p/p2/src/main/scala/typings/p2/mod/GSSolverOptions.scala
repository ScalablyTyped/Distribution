package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GSSolverOptions extends js.Object {
  var iterations: js.UndefOr[Double] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object GSSolverOptions {
  @scala.inline
  def apply(iterations: js.UndefOr[Double] = js.undefined, tolerance: js.UndefOr[Double] = js.undefined): GSSolverOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GSSolverOptions]
  }
}

