package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.anon.Fire
import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import typings.ngxInfiniteScroll.modelsMod.IScrollState
import typings.ngxInfiniteScroll.modelsMod.IScrollerDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollResolverMod {
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getScrollStats(lastScrollPosition: Double, container: IPositionStats, distance: IScrollerDistance): Fire = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollStats")(lastScrollPosition.asInstanceOf[js.Any], container.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Fire]
  
  @scala.inline
  def isSameTotalToScroll(scrollState: IScrollState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameTotalToScroll")(scrollState.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isScrollingDownwards(lastScrollPosition: Double, container: IPositionStats): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isScrollingDownwards")(lastScrollPosition.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isTriggeredScroll(totalToScroll: js.Any, scrollState: IScrollState, isScrollingDown: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTriggeredScroll")(totalToScroll.asInstanceOf[js.Any], scrollState.asInstanceOf[js.Any], isScrollingDown.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldFireScrollEvent(container: IPositionStats, distance: IScrollerDistance, scrollingDown: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldFireScrollEvent")(container.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], scrollingDown.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def updateScrollPosition(position: Double, scrollState: IScrollState): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("updateScrollPosition")(position.asInstanceOf[js.Any], scrollState.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def updateScrollState(scrollState: IScrollState, scrolledUntilNow: Double, totalToScroll: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateScrollState")(scrollState.asInstanceOf[js.Any], scrolledUntilNow.asInstanceOf[js.Any], totalToScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateTotalToScroll(totalToScroll: Double, scrollState: IScrollState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTotalToScroll")(totalToScroll.asInstanceOf[js.Any], scrollState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateTriggeredFlag(scroll: js.Any, scrollState: IScrollState, triggered: Boolean, isScrollingDown: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTriggeredFlag")(scroll.asInstanceOf[js.Any], scrollState.asInstanceOf[js.Any], triggered.asInstanceOf[js.Any], isScrollingDown.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
