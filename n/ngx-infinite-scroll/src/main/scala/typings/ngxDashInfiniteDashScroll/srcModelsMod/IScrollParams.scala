package typings.ngxDashInfiniteDashScroll.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollParams extends js.Object {
  var fire: Boolean
  var scrollDown: Boolean
  var stats: IPositionStats
}

object IScrollParams {
  @scala.inline
  def apply(fire: Boolean, scrollDown: Boolean, stats: IPositionStats): IScrollParams = {
    val __obj = js.Dynamic.literal(fire = fire, scrollDown = scrollDown, stats = stats)
  
    __obj.asInstanceOf[IScrollParams]
  }
}

