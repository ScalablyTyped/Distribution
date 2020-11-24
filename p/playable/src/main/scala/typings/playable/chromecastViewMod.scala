package typings.playable

import typings.playable.controlsChromecastTypesMod.IChromecastStyles
import typings.playable.controlsChromecastTypesMod.IChromecastViewConfig
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast.view", JSImport.Namespace)
@js.native
object chromecastViewMod extends js.Object {
  
  @js.native
  trait ChromecastView
    extends typings.playable.stylableMod.default[IChromecastStyles] {
    
    @JSName("_$downloadButton")
    var _$downloadButton: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _getLabelText: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setCastingState(isCasting: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  class default protected () extends ChromecastView {
    def this(config: IChromecastViewConfig) = this()
  }
}
