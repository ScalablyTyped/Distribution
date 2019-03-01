package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptimalDecomp extends js.Object {
  var optimalDecomp: js.UndefOr[scala.Boolean] = js.undefined
  var removeCollinearPoints: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var skipSimpleCheck: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_OptimalDecomp {
  @scala.inline
  def apply(
    optimalDecomp: js.UndefOr[scala.Boolean] = js.undefined,
    removeCollinearPoints: scala.Boolean | scala.Double = null,
    skipSimpleCheck: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_OptimalDecomp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(optimalDecomp)) __obj.updateDynamic("optimalDecomp")(optimalDecomp)
    if (removeCollinearPoints != null) __obj.updateDynamic("removeCollinearPoints")(removeCollinearPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSimpleCheck)) __obj.updateDynamic("skipSimpleCheck")(skipSimpleCheck)
    __obj.asInstanceOf[Anon_OptimalDecomp]
  }
}

