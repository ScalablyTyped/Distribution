package typings.playable

import typings.playable.playTypesMod.IPlayViewConfig
import typings.playable.playTypesMod.IPlayViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/play/play.view", JSImport.Default)
  @js.native
  class default protected () extends PlayView {
    def this(config: IPlayViewConfig) = this()
  }
  
  @js.native
  trait PlayView
    extends typings.playable.viewMod.default[IPlayViewStyles] {
    
    /* private */ @JSName("_$playbackControl")
    var _$playbackControl: js.Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    /* private */ var _bindEvents: js.Any = js.native
    
    /* private */ var _callbacks: js.Any = js.native
    
    /* private */ var _onButtonClick: js.Any = js.native
    
    /* private */ var _textMap: js.Any = js.native
    
    /* private */ var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPlayingState(isPlaying: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
