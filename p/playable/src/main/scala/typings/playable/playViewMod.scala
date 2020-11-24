package typings.playable

import typings.playable.playTypesMod.IPlayViewConfig
import typings.playable.playTypesMod.IPlayViewStyles
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/play/play.view", JSImport.Namespace)
@js.native
object playViewMod extends js.Object {
  
  @js.native
  trait PlayView
    extends typings.playable.stylableMod.default[IPlayViewStyles] {
    
    @JSName("_$playbackControl")
    var _$playbackControl: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPlayingState(isPlaying: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  class default protected () extends PlayView {
    def this(config: IPlayViewConfig) = this()
  }
}
