package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicApiMod {
  
  @JSImport("ngx-infinite-scroll/public-api", "InfiniteScrollDirective")
  @js.native
  class InfiniteScrollDirective protected ()
    extends typings.ngxInfiniteScroll.ngxInfiniteScrollMod.InfiniteScrollDirective {
    def this(element: ElementRef[js.Any], zone: NgZone) = this()
  }
  
  @JSImport("ngx-infinite-scroll/public-api", "InfiniteScrollModule")
  @js.native
  class InfiniteScrollModule ()
    extends typings.ngxInfiniteScroll.ngxInfiniteScrollMod.InfiniteScrollModule
}
