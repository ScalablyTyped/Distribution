package typings.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimalDecomp extends js.Object {
  var optimalDecomp: js.UndefOr[Boolean] = js.undefined
  var removeCollinearPoints: js.UndefOr[Boolean | Double] = js.undefined
  var skipSimpleCheck: js.UndefOr[Boolean] = js.undefined
}

object OptimalDecomp {
  @scala.inline
  def apply(
    optimalDecomp: js.UndefOr[Boolean] = js.undefined,
    removeCollinearPoints: Boolean | Double = null,
    skipSimpleCheck: js.UndefOr[Boolean] = js.undefined
  ): OptimalDecomp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(optimalDecomp)) __obj.updateDynamic("optimalDecomp")(optimalDecomp.get.asInstanceOf[js.Any])
    if (removeCollinearPoints != null) __obj.updateDynamic("removeCollinearPoints")(removeCollinearPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSimpleCheck)) __obj.updateDynamic("skipSimpleCheck")(skipSimpleCheck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimalDecomp]
  }
}

