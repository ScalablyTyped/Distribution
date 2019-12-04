package typings.ngxDashInfiniteDashScroll.srcServicesEventDashTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollConfig extends js.Object {
  var alwaysCallback: Boolean
  var shouldFireScrollEvent: Boolean
}

object IScrollConfig {
  @scala.inline
  def apply(alwaysCallback: Boolean, shouldFireScrollEvent: Boolean): IScrollConfig = {
    val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], shouldFireScrollEvent = shouldFireScrollEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScrollConfig]
  }
}

