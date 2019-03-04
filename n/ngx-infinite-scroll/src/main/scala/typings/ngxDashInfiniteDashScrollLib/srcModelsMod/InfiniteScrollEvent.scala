package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollEvent extends js.Object {
  var currentScrollPosition: scala.Double
}

object InfiniteScrollEvent {
  @scala.inline
  def apply(currentScrollPosition: scala.Double): InfiniteScrollEvent = {
    val __obj = js.Dynamic.literal(currentScrollPosition = currentScrollPosition)
  
    __obj.asInstanceOf[InfiniteScrollEvent]
  }
}

