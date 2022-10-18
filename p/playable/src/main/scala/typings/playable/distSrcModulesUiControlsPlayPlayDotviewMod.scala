package typings.playable

import typings.playable.distSrcModulesUiControlsPlayTypesMod.IPlayViewConfig
import typings.playable.distSrcModulesUiControlsPlayTypesMod.IPlayViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsPlayPlayDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/play/play.view", JSImport.Default)
  @js.native
  open class default protected () extends PlayView {
    def this(config: IPlayViewConfig) = this()
  }
  
  @js.native
  trait PlayView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[IPlayViewStyles] {
    
    /* private */ @JSName("_$playbackControl")
    var _$playbackControl: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _onButtonClick: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPlayingState(isPlaying: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
