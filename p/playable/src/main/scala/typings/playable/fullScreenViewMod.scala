package typings.playable

import typings.playable.fullScreenTypesMod.IFullScreenViewConfig
import typings.playable.fullScreenTypesMod.IFullScreenViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen.view", JSImport.Default)
  @js.native
  class default protected () extends FullScreenView {
    def this(config: IFullScreenViewConfig) = this()
  }
  
  @js.native
  trait FullScreenView
    extends typings.playable.viewMod.default[IFullScreenViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$toggleFullScreenControl")
    var _$toggleFullScreenControl: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setFullScreenState(isInFullScreen: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
