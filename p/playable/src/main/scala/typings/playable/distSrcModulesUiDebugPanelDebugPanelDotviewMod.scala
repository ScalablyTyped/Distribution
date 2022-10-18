package typings.playable

import typings.playable.distSrcModulesUiDebugPanelTypesMod.IDebugPanelViewConfig
import typings.playable.distSrcModulesUiDebugPanelTypesMod.IDebugPanelViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiDebugPanelDebugPanelDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel.view", JSImport.Default)
  @js.native
  open class default protected () extends DebugPanelView {
    def this(config: IDebugPanelViewConfig) = this()
  }
  
  @js.native
  trait DebugPanelView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[IDebugPanelViewStyles] {
    
    /* private */ @JSName("_$closeButton")
    var _$closeButton: Any = js.native
    
    /* private */ @JSName("_$infoContainer")
    var _$infoContainer: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setInfo(info: Any): Unit = js.native
    
    def show(): Unit = js.native
  }
}
