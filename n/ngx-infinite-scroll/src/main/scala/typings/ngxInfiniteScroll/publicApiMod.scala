package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/public-api", JSImport.Namespace)
@js.native
object publicApiMod extends js.Object {
  @js.native
  class InfiniteScrollDirective protected ()
    extends typings.ngxInfiniteScroll.ngxInfiniteScrollMod.InfiniteScrollDirective {
    def this(element: ElementRef[_], zone: NgZone) = this()
  }
  
  @js.native
  class InfiniteScrollModule ()
    extends typings.ngxInfiniteScroll.ngxInfiniteScrollModuleMod.InfiniteScrollModule
  
}

