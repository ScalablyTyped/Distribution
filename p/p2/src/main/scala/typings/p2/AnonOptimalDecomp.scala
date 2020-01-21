package typings.p2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptimalDecomp extends js.Object {
  var optimalDecomp: js.UndefOr[Boolean] = js.undefined
  var removeCollinearPoints: js.UndefOr[Boolean | Double] = js.undefined
  var skipSimpleCheck: js.UndefOr[Boolean] = js.undefined
}

object AnonOptimalDecomp {
  @scala.inline
  def apply(
    optimalDecomp: js.UndefOr[Boolean] = js.undefined,
    removeCollinearPoints: Boolean | Double = null,
    skipSimpleCheck: js.UndefOr[Boolean] = js.undefined
  ): AnonOptimalDecomp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(optimalDecomp)) __obj.updateDynamic("optimalDecomp")(optimalDecomp.asInstanceOf[js.Any])
    if (removeCollinearPoints != null) __obj.updateDynamic("removeCollinearPoints")(removeCollinearPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSimpleCheck)) __obj.updateDynamic("skipSimpleCheck")(skipSimpleCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptimalDecomp]
  }
}

