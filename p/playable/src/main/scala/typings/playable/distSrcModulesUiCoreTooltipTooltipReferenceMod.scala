package typings.playable

import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipReference
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipReferenceOptions
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreTooltipTooltipReferenceMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-reference", JSImport.Default)
  @js.native
  open class default protected ()
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
    
    /* private */ @JSName("_$reference")
    var _$reference: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _eventListeners: Any = js.native
    
    /* private */ var _isDisabled: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _tooltipService: Any = js.native
    
    @JSName("isDisabled")
    def isDisabled_MTooltipReference: Boolean = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltipReference: Boolean = js.native
  }
}
