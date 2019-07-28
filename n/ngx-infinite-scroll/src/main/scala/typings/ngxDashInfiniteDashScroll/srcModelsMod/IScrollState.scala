package typings.ngxDashInfiniteDashScroll.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollState extends js.Object {
  var lastScrollPosition: Double
  var lastTotalToScroll: Double
  var totalToScroll: Double
  var triggered: IScrollerDistance
}

object IScrollState {
  @scala.inline
  def apply(
    lastScrollPosition: Double,
    lastTotalToScroll: Double,
    totalToScroll: Double,
    triggered: IScrollerDistance
  ): IScrollState = {
    val __obj = js.Dynamic.literal(lastScrollPosition = lastScrollPosition, lastTotalToScroll = lastTotalToScroll, totalToScroll = totalToScroll, triggered = triggered)
  
    __obj.asInstanceOf[IScrollState]
  }
}

