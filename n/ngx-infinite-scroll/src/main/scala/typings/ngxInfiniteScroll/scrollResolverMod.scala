package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.anon.Fire
import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import typings.ngxInfiniteScroll.modelsMod.IScrollState
import typings.ngxInfiniteScroll.modelsMod.IScrollerDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollResolverMod {
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "getScrollStats")
  @js.native
  def getScrollStats(lastScrollPosition: Double, container: IPositionStats, distance: IScrollerDistance): Fire = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "isSameTotalToScroll")
  @js.native
  def isSameTotalToScroll(scrollState: IScrollState): Boolean = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "isScrollingDownwards")
  @js.native
  def isScrollingDownwards(lastScrollPosition: Double, container: IPositionStats): Boolean = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "isTriggeredScroll")
  @js.native
  def isTriggeredScroll(totalToScroll: js.Any, scrollState: IScrollState, isScrollingDown: Boolean): Boolean = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "shouldFireScrollEvent")
  @js.native
  def shouldFireScrollEvent(container: IPositionStats, distance: IScrollerDistance, scrollingDown: Boolean): Boolean = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "updateScrollPosition")
  @js.native
  def updateScrollPosition(position: Double, scrollState: IScrollState): Double = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "updateScrollState")
  @js.native
  def updateScrollState(scrollState: IScrollState, scrolledUntilNow: Double, totalToScroll: Double): Unit = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "updateTotalToScroll")
  @js.native
  def updateTotalToScroll(totalToScroll: Double, scrollState: IScrollState): Unit = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", "updateTriggeredFlag")
  @js.native
  def updateTriggeredFlag(scroll: js.Any, scrollState: IScrollState, triggered: Boolean, isScrollingDown: Boolean): Unit = js.native
}
