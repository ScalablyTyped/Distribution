package typings.ngxDashInfiniteDashScroll.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfiniteScrollEvent extends js.Object {
  var currentScrollPosition: Double
}

object IInfiniteScrollEvent {
  @scala.inline
  def apply(currentScrollPosition: Double): IInfiniteScrollEvent = {
    val __obj = js.Dynamic.literal(currentScrollPosition = currentScrollPosition)
  
    __obj.asInstanceOf[IInfiniteScrollEvent]
  }
}

