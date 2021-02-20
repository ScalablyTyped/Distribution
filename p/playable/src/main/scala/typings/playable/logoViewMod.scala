package typings.playable

import typings.playable.logoTypesMod.ILogoViewConfig
import typings.playable.logoTypesMod.ILogoViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logoViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/logo/logo.view", JSImport.Default)
  @js.native
  class default protected () extends LogoView {
    def this(config: ILogoViewConfig) = this()
  }
  
  @js.native
  trait LogoView
    extends typings.playable.viewMod.default[ILogoViewStyles] {
    
    @JSName("_$logoButton")
    var _$logoButton: js.Any = js.native
    
    @JSName("_$logoImage")
    var _$logoImage: js.Any = js.native
    
    @JSName("_$logoInput")
    var _$logoInput: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _onClick: js.Any = js.native
    
    var _setChild: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setLogo(url: String): Unit = js.native
    
    def show(): Unit = js.native
    
    def showAsButton(): Unit = js.native
    
    def showAsImage(): Unit = js.native
    
    def showAsInput(): Unit = js.native
  }
}
