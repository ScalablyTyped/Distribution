package typings.playable

import typings.playable.tooltipTypesMod.ITooltipReference
import typings.playable.tooltipTypesMod.ITooltipReferenceOptions
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipReferenceMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-reference", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with TooltipReference {
    def this(reference: HTMLElement, tooltipService: ITooltipService, options: ITooltipReferenceOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disable(): Unit = js.native
    
    /* CompleteClass */
    override def enable(): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isDisabled: Boolean = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def setText(text: String): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  trait TooltipReference
    extends StObject
       with ITooltipReference {
    
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
