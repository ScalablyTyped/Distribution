package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.modelsMod.IScrollState
import typings.ngxInfiniteScroll.modelsMod.IScrollerDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/src/services/scroll-state", JSImport.Namespace)
@js.native
object scrollStateMod extends js.Object {
  @js.native
  class ScrollState protected () extends IScrollState {
    def this(hasTotalToScroll: AnonTotalToScroll) = this()
    /* CompleteClass */
    override var lastScrollPosition: Double = js.native
    /* CompleteClass */
    override var lastTotalToScroll: Double = js.native
    /* CompleteClass */
    override var totalToScroll: Double = js.native
    /* CompleteClass */
    override var triggered: IScrollerDistance = js.native
    def isTriggeredScroll(totalToScroll: js.Any, isScrollingDown: Boolean): Boolean = js.native
    def updateScroll(scrolledUntilNow: Double, totalToScroll: Double): Unit = js.native
    def updateScrollPosition(position: Double): Double = js.native
    def updateTotalToScroll(totalToScroll: Double): Unit = js.native
    def updateTriggeredFlag(scroll: js.Any, isScrollingDown: Boolean): Unit = js.native
  }
  
}

