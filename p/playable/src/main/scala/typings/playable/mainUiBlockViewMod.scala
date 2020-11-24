package typings.playable

import typings.playable.mainUiBlockTypesMod.IMainUIBlockViewConfig
import typings.playable.mainUiBlockTypesMod.IMainUIBlockViewStyles
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/main-ui-block/main-ui-block.view", JSImport.Namespace)
@js.native
object mainUiBlockViewMod extends js.Object {
  
  @js.native
  trait MainUIBlockView
    extends typings.playable.stylableMod.default[IMainUIBlockViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
  }
  
  @js.native
  class default protected () extends MainUIBlockView {
    def this(config: IMainUIBlockViewConfig) = this()
  }
}
