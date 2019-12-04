package typings.ngxDashInfiniteDashScroll

import typings.ngxDashInfiniteDashScroll.srcModelsMod.IInfiniteScrollAction
import typings.ngxDashInfiniteDashScroll.srcModelsMod.IPositionStats
import typings.ngxDashInfiniteDashScroll.srcModelsMod.IScrollParams
import typings.ngxDashInfiniteDashScroll.srcModelsMod.IScrollRegisterConfig
import typings.ngxDashInfiniteDashScroll.srcModelsMod.IScroller
import typings.ngxDashInfiniteDashScroll.srcModelsMod.IScrollerDistance
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/src/services/scroll-register", JSImport.Namespace)
@js.native
object srcServicesScrollDashRegisterMod extends js.Object {
  def attachScrollEvent(options: IScrollRegisterConfig): Observable[js.Object] = js.native
  def createScroller(config: IScroller): Observable[IInfiniteScrollAction] = js.native
  def toInfiniteScrollAction(response: IScrollParams): IInfiniteScrollAction = js.native
  def toInfiniteScrollParams(lastScrollPosition: Double, stats: IPositionStats, distance: IScrollerDistance): IScrollParams = js.native
  @js.native
  object InfiniteScrollActions extends js.Object {
    var DOWN: String = js.native
    var UP: String = js.native
  }
  
}

