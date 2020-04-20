package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfiniteScrollEvent extends js.Object {
  var currentScrollPosition: Double
}

object IInfiniteScrollEvent {
  @scala.inline
  def apply(currentScrollPosition: Double): IInfiniteScrollEvent = {
    val __obj = js.Dynamic.literal(currentScrollPosition = currentScrollPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfiniteScrollEvent]
  }
}

