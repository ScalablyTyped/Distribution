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
    val __obj = js.Dynamic.literal(lastScrollPosition = lastScrollPosition.asInstanceOf[js.Any], lastTotalToScroll = lastTotalToScroll.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScrollState]
  }
}

