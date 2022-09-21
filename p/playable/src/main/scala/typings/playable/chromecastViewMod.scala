package typings.playable

import typings.playable.controlsChromecastTypesMod.IChromecastStyles
import typings.playable.controlsChromecastTypesMod.IChromecastViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromecastViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast.view", JSImport.Default)
  @js.native
  open class default protected () extends ChromecastView {
    def this(config: IChromecastViewConfig) = this()
  }
  
  @js.native
  trait ChromecastView
    extends typings.playable.viewMod.default[IChromecastStyles] {
    
    /* private */ @JSName("_$downloadButton")
    var _$downloadButton: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _getLabelText: Any = js.native
    
    /* private */ var _onButtonClick: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _tooltipReference: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setCastingState(isCasting: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
