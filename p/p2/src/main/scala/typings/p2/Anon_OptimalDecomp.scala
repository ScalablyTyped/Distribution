package typings.p2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptimalDecomp extends js.Object {
  var optimalDecomp: js.UndefOr[Boolean] = js.undefined
  var removeCollinearPoints: js.UndefOr[Boolean | Double] = js.undefined
  var skipSimpleCheck: js.UndefOr[Boolean] = js.undefined
}

object Anon_OptimalDecomp {
  @scala.inline
  def apply(
    optimalDecomp: js.UndefOr[Boolean] = js.undefined,
    removeCollinearPoints: Boolean | Double = null,
    skipSimpleCheck: js.UndefOr[Boolean] = js.undefined
  ): Anon_OptimalDecomp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(optimalDecomp)) __obj.updateDynamic("optimalDecomp")(optimalDecomp.asInstanceOf[js.Any])
    if (removeCollinearPoints != null) __obj.updateDynamic("removeCollinearPoints")(removeCollinearPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSimpleCheck)) __obj.updateDynamic("skipSimpleCheck")(skipSimpleCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OptimalDecomp]
  }
}

