package typings.playable

import typings.playable.loadingCoverTypesMod.ILoadingCoverViewStyles
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover.view", JSImport.Namespace)
@js.native
object loadingCoverViewMod extends js.Object {
  
  @js.native
  trait LoadingCoverView
    extends typings.playable.stylableMod.default[ILoadingCoverViewStyles] {
    
    @JSName("_$image")
    var _$image: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setCover(url: String): Unit = js.native
    def setCover(url: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  class default () extends LoadingCoverView
}
