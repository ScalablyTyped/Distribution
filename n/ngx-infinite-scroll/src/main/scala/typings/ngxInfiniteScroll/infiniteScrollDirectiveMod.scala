package typings.ngxInfiniteScroll

import typings.angularCore.mod.AfterViewInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typings.ngxInfiniteScroll.modelsMod.IInfiniteScrollEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/src/modules/infinite-scroll.directive", JSImport.Namespace)
@js.native
object infiniteScrollDirectiveMod extends js.Object {
  @js.native
  class InfiniteScrollDirective protected ()
    extends OnDestroy
       with OnChanges
       with AfterViewInit {
    def this(element: ElementRef[_], zone: NgZone) = this()
    var alwaysCallback: Boolean = js.native
    var disposeScroller: js.Any = js.native
    var element: js.Any = js.native
    var fromRoot: Boolean = js.native
    var horizontal: Boolean = js.native
    var immediateCheck: Boolean = js.native
    var infiniteScrollContainer: js.Any = js.native
    var infiniteScrollDisabled: Boolean = js.native
    var infiniteScrollDistance: Double = js.native
    var infiniteScrollThrottle: Double = js.native
    var infiniteScrollUpDistance: Double = js.native
    var scrollWindow: Boolean = js.native
    var scrolled: EventEmitter[IInfiniteScrollEvent] = js.native
    var scrolledUp: EventEmitter[IInfiniteScrollEvent] = js.native
    var zone: js.Any = js.native
    def destroyScroller(): Unit = js.native
    def handleOnScroll(hasTypePayload: IInfiniteScrollAction): Unit = js.native
    def setup(): Unit = js.native
  }
  
}

