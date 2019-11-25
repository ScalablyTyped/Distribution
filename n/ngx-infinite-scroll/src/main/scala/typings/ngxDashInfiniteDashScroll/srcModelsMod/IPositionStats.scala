package typings.ngxDashInfiniteDashScroll.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionStats extends js.Object {
  var height: Double
  var isWindow: js.UndefOr[Boolean] = js.undefined
  var scrolled: Double
  var totalToScroll: Double
}

object IPositionStats {
  @scala.inline
  def apply(
    height: Double,
    scrolled: Double,
    totalToScroll: Double,
    isWindow: js.UndefOr[Boolean] = js.undefined
  ): IPositionStats = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(isWindow)) __obj.updateDynamic("isWindow")(isWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionStats]
  }
}

