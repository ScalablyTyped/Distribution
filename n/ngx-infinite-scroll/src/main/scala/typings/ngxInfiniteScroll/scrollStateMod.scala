package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.anon.TotalToScroll
import typings.ngxInfiniteScroll.modelsMod.IScrollState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollStateMod {
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-state", "ScrollState")
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
