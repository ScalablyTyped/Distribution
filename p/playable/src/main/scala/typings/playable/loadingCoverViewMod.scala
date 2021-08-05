package typings.playable

import typings.playable.loadingCoverTypesMod.ILoadingCoverViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingCoverViewMod {
  
  @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover.view", JSImport.Default)
  @js.native
  class default () extends LoadingCoverView
  
  @js.native
  trait LoadingCoverView
    extends typings.playable.viewMod.default[ILoadingCoverViewStyles] {
    
    /* private */ @JSName("_$image")
    var _$image: js.Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    /* private */ var _initDOM: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setCover(url: String): Unit = js.native
    def setCover(url: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
