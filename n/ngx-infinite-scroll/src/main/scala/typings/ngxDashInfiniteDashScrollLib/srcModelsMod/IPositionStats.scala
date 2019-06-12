package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionStats extends js.Object {
  var height: scala.Double
  var isWindow: js.UndefOr[scala.Boolean] = js.undefined
  var scrolled: scala.Double
  var totalToScroll: scala.Double
}

object IPositionStats {
  @scala.inline
  def apply(
    height: scala.Double,
    scrolled: scala.Double,
    totalToScroll: scala.Double,
    isWindow: js.UndefOr[scala.Boolean] = js.undefined
  ): IPositionStats = {
    val __obj = js.Dynamic.literal(height = height, scrolled = scrolled, totalToScroll = totalToScroll)
    if (!js.isUndefined(isWindow)) __obj.updateDynamic("isWindow")(isWindow)
    __obj.asInstanceOf[IPositionStats]
  }
}

