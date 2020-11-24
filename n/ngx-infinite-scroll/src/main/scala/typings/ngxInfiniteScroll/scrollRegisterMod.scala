package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import typings.ngxInfiniteScroll.modelsMod.IScrollParams
import typings.ngxInfiniteScroll.modelsMod.IScrollRegisterConfig
import typings.ngxInfiniteScroll.modelsMod.IScroller
import typings.ngxInfiniteScroll.modelsMod.IScrollerDistance
import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ngx-infinite-scroll/src/services/scroll-register", JSImport.Namespace)
@js.native
object scrollRegisterMod extends js.Object {
  
  def attachScrollEvent(options: IScrollRegisterConfig): Observable_[js.Object] = js.native
  
  def createScroller(config: IScroller): Observable_[IInfiniteScrollAction] = js.native
  
  def toInfiniteScrollAction(response: IScrollParams): IInfiniteScrollAction = js.native
  
  def toInfiniteScrollParams(lastScrollPosition: Double, stats: IPositionStats, distance: IScrollerDistance): IScrollParams = js.native
  
  @js.native
  object InfiniteScrollActions extends js.Object {
    
    var DOWN: String = js.native
    
    var UP: String = js.native
  }
}
