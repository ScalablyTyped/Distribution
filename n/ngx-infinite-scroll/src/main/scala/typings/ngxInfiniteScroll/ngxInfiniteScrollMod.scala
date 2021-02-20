package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngxInfiniteScrollMod {
  
  @JSImport("ngx-infinite-scroll/src/ngx-infinite-scroll", "InfiniteScrollDirective")
  @js.native
  class InfiniteScrollDirective protected ()
    extends typings.ngxInfiniteScroll.infiniteScrollDirectiveMod.InfiniteScrollDirective {
    def this(element: ElementRef[_], zone: NgZone) = this()
  }
  
  @JSImport("ngx-infinite-scroll/src/ngx-infinite-scroll", "InfiniteScrollModule")
  @js.native
  class InfiniteScrollModule ()
    extends typings.ngxInfiniteScroll.ngxInfiniteScrollModuleMod.InfiniteScrollModule
}
