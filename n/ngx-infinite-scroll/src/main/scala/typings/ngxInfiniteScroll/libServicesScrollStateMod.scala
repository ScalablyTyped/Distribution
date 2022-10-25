package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.anon.TotalToScroll
import typings.ngxInfiniteScroll.modelsMod.IScrollState
import typings.ngxInfiniteScroll.modelsMod.IScrollerDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesScrollStateMod {
  
  @JSImport("ngx-infinite-scroll/lib/services/scroll-state", "ScrollState")
  @js.native
  open class ScrollState protected ()
    extends StObject
       with IScrollState {
    def this(param0: TotalToScroll) = this()
    
    def isTriggeredScroll(totalToScroll: Any, isScrollingDown: Boolean): Boolean = js.native
    
    /* CompleteClass */
    var lastScrollPosition: Double = js.native
    
    /* CompleteClass */
    var lastTotalToScroll: Double = js.native
    
    /* CompleteClass */
    var totalToScroll: Double = js.native
    
    /* CompleteClass */
    var triggered: IScrollerDistance = js.native
    
    def updateScroll(scrolledUntilNow: Double, totalToScroll: Double): Unit = js.native
    
    def updateScrollPosition(position: Double): Double = js.native
    
    def updateTotalToScroll(totalToScroll: Double): Unit = js.native
    
    def updateTriggeredFlag(scroll: Any, isScrollingDown: Boolean): Unit = js.native
  }
}
