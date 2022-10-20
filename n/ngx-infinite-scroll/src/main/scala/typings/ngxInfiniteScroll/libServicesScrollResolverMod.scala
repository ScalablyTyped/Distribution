package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.anon.Fire
import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import typings.ngxInfiniteScroll.modelsMod.IScrollState
import typings.ngxInfiniteScroll.modelsMod.IScrollerDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesScrollResolverMod {
  
  @JSImport("ngx-infinite-scroll/lib/services/scroll-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScrollStats(lastScrollPosition: Double, container: IPositionStats, distance: IScrollerDistance): Fire = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollStats")(lastScrollPosition.asInstanceOf[js.Any], container.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Fire]
  
  inline def isSameTotalToScroll(scrollState: IScrollState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameTotalToScroll")(scrollState.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isScrollingDownwards(lastScrollPosition: Double, container: IPositionStats): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isScrollingDownwards")(lastScrollPosition.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTriggeredScroll(totalToScroll: Double, scrollState: IScrollState, isScrollingDown: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTriggeredScroll")(totalToScroll.asInstanceOf[js.Any], scrollState.asInstanceOf[js.Any], isScrollingDown.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldFireScrollEvent(container: IPositionStats, distance: Unit, scrollingDown: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldFireScrollEvent")(container.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], scrollingDown.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldFireScrollEvent(container: IPositionStats, distance: IScrollerDistance, scrollingDown: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldFireScrollEvent")(container.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], scrollingDown.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def updateScrollPosition(position: Double, scrollState: IScrollState): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("updateScrollPosition")(position.asInstanceOf[js.Any], scrollState.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def updateScrollState(scrollState: IScrollState, scrolledUntilNow: Double, totalToScroll: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateScrollState")(scrollState.asInstanceOf[js.Any], scrolledUntilNow.asInstanceOf[js.Any], totalToScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateTotalToScroll(totalToScroll: Double, scrollState: IScrollState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTotalToScroll")(totalToScroll.asInstanceOf[js.Any], scrollState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateTriggeredFlag(scroll: Double, scrollState: IScrollState, triggered: Boolean, isScrollingDown: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTriggeredFlag")(scroll.asInstanceOf[js.Any], scrollState.asInstanceOf[js.Any], triggered.asInstanceOf[js.Any], isScrollingDown.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
