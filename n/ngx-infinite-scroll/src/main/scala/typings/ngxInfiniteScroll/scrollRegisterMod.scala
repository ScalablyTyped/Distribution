package typings.ngxInfiniteScroll

import typings.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import typings.ngxInfiniteScroll.modelsMod.IScrollParams
import typings.ngxInfiniteScroll.modelsMod.IScrollRegisterConfig
import typings.ngxInfiniteScroll.modelsMod.IScroller
import typings.ngxInfiniteScroll.modelsMod.IScrollerDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollRegisterMod {
  
  @JSImport("ngx-infinite-scroll/lib/services/scroll-register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object InfiniteScrollActions {
    
    @JSImport("ngx-infinite-scroll/lib/services/scroll-register", "InfiniteScrollActions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ngx-infinite-scroll/lib/services/scroll-register", "InfiniteScrollActions.DOWN")
    @js.native
    def DOWN: String = js.native
    inline def DOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("ngx-infinite-scroll/lib/services/scroll-register", "InfiniteScrollActions.UP")
    @js.native
    def UP: String = js.native
    inline def UP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
  }
  
  inline def attachScrollEvent(options: IScrollRegisterConfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("attachScrollEvent")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createScroller(config: IScroller): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createScroller")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toInfiniteScrollAction(response: IScrollParams): IInfiniteScrollAction = ^.asInstanceOf[js.Dynamic].applyDynamic("toInfiniteScrollAction")(response.asInstanceOf[js.Any]).asInstanceOf[IInfiniteScrollAction]
  
  inline def toInfiniteScrollParams(lastScrollPosition: Double, stats: IPositionStats, distance: IScrollerDistance): IScrollParams = (^.asInstanceOf[js.Dynamic].applyDynamic("toInfiniteScrollParams")(lastScrollPosition.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IScrollParams]
}
