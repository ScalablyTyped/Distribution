package typings.playable

import typings.playable.liveIndicatorTypesMod.ILiveIndicatorViewConfig
import typings.playable.liveIndicatorTypesMod.ILiveIndicatorViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveIndicatorViewMod {
  
  @JSImport("playable/dist/src/modules/ui/live-indicator/live-indicator.view", JSImport.Default)
  @js.native
  class default protected () extends LiveIndicatorView {
    def this(config: ILiveIndicatorViewConfig) = this()
  }
  
  @js.native
  trait LiveIndicatorView
    extends typings.playable.viewMod.default[ILiveIndicatorViewStyles] {
    
    @JSName("_$button")
    var _$button: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _tooltipService: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def toggle(shouldShow: Boolean): Unit = js.native
    
    def toggleActive(shouldActivate: Boolean): Unit = js.native
    
    def toggleEnded(isEnded: Boolean): Unit = js.native
  }
}
