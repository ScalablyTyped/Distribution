package typings.playable

import typings.playable.tooltipTypesMod.ITooltip
import typings.playable.tooltipTypesMod.ITooltipStyles
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip", JSImport.Namespace)
@js.native
object tooltipTooltipMod extends js.Object {
  
  @js.native
  trait Tooltip
    extends typings.playable.stylableMod.default[ITooltipStyles]
       with ITooltip {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$tooltipInner")
    var _$tooltipInner: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _isHidden: js.Any = js.native
    
    var _showAsElement: js.Any = js.native
    
    var _showAsText: js.Any = js.native
    
    def clearElement(): Unit = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltip: Boolean = js.native
    
    def setElement(element: HTMLElement): Unit = js.native
    
    def setStyle(style: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Tooltip
}
