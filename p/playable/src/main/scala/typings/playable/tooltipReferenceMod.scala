package typings.playable

import typings.playable.tooltipTypesMod.ITooltipReference
import typings.playable.tooltipTypesMod.ITooltipReferenceOptions
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipReferenceMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-reference", JSImport.Default)
  @js.native
  class default protected () extends TooltipReference {
    def this(reference: HTMLElement, tooltipService: ITooltipService, options: ITooltipReferenceOptions) = this()
  }
  
  @js.native
  trait TooltipReference extends ITooltipReference {
    
    @JSName("_$reference")
    var _$reference: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _eventListeners: js.Any = js.native
    
    var _isDisabled: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _tooltipService: js.Any = js.native
    
    @JSName("isDisabled")
    def isDisabled_MTooltipReference: Boolean = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltipReference: Boolean = js.native
  }
}
