package typings.playable

import typings.playable.distSrcModulesUiControlsLogoTypesMod.ILogoViewConfig
import typings.playable.distSrcModulesUiControlsLogoTypesMod.ILogoViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsLogoLogoDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/logo/logo.view", JSImport.Default)
  @js.native
  open class default protected () extends LogoView {
    def this(config: ILogoViewConfig) = this()
  }
  
  @js.native
  trait LogoView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[ILogoViewStyles] {
    
    /* private */ @JSName("_$logoButton")
    var _$logoButton: Any = js.native
    
    /* private */ @JSName("_$logoImage")
    var _$logoImage: Any = js.native
    
    /* private */ @JSName("_$logoInput")
    var _$logoInput: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _setChild: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _tooltipReference: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
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
