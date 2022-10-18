package typings.playable

import typings.playable.distSrcModulesUiMainUiBlockTypesMod.IMainUIBlockViewConfig
import typings.playable.distSrcModulesUiMainUiBlockTypesMod.IMainUIBlockViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiMainUiBlockMainUiBlockDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block.view", JSImport.Default)
  @js.native
  open class default protected () extends MainUIBlockView {
    def this(config: IMainUIBlockViewConfig) = this()
  }
  
  @js.native
  trait MainUIBlockView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[IMainUIBlockViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
  }
}
