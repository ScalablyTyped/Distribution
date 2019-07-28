package typings.ngxDashInfiniteDashScroll.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollEvent extends js.Object {
  var currentScrollPosition: Double
}

object InfiniteScrollEvent {
  @scala.inline
  def apply(currentScrollPosition: Double): InfiniteScrollEvent = {
    val __obj = js.Dynamic.literal(currentScrollPosition = currentScrollPosition)
  
    __obj.asInstanceOf[InfiniteScrollEvent]
  }
}

