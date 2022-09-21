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
  open class default protected () extends LiveIndicatorView {
    def this(config: ILiveIndicatorViewConfig) = this()
  }
  
  @js.native
  trait LiveIndicatorView
    extends typings.playable.viewMod.default[ILiveIndicatorViewStyles] {
    
    /* private */ @JSName("_$button")
    var _$button: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _tooltipReference: Any = js.native
    
    /* private */ var _tooltipService: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def toggle(shouldShow: Boolean): Unit = js.native
    
    def toggleActive(shouldActivate: Boolean): Unit = js.native
    
    def toggleEnded(isEnded: Boolean): Unit = js.native
  }
}
