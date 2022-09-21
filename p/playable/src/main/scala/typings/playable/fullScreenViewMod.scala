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
  open class default protected () extends FullScreenView {
    def this(config: IFullScreenViewConfig) = this()
  }
  
  @js.native
  trait FullScreenView
    extends typings.playable.viewMod.default[IFullScreenViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ @JSName("_$toggleFullScreenControl")
    var _$toggleFullScreenControl: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _onButtonClick: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _tooltipReference: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setFullScreenState(isInFullScreen: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
