package typings.ngxDashInfiniteDashScroll.srcServicesEventDashTriggerMod

import typings.ngxDashInfiniteDashScroll.srcModelsMod.IPositionStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollerProps extends IDistanceRange {
  var alwaysCallback: Boolean
  var container: IPositionStats
  var disabled: Boolean
}

object IScrollerProps {
  @scala.inline
  def apply(alwaysCallback: Boolean, container: IPositionStats, disabled: Boolean, down: Double, up: Double): IScrollerProps = {
    val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScrollerProps]
  }
}

