package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.anon.TotalToScroll
import typings.ngxInfiniteScroll.modelsMod.IScrollState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/src/services/scroll-state", JSImport.Namespace)
@js.native
object scrollStateMod extends js.Object {
  @js.native
  class ScrollState protected () extends IScrollState {
    def this(hasTotalToScroll: TotalToScroll) = this()
    def isTriggeredScroll(totalToScroll: js.Any, isScrollingDown: Boolean): Boolean = js.native
    def updateScroll(scrolledUntilNow: Double, totalToScroll: Double): Unit = js.native
    def updateScrollPosition(position: Double): Double = js.native
    def updateTotalToScroll(totalToScroll: Double): Unit = js.native
    def updateTriggeredFlag(scroll: js.Any, isScrollingDown: Boolean): Unit = js.native
  }
  
}

