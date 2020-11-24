package typings.playable

import typings.playable.anon.EventEmitterIEventEmitter
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-service", JSImport.Namespace)
@js.native
object tooltipServiceMod extends js.Object {
  
  @js.native
  trait TooltipService extends ITooltipService {
    
    var _bindEvents: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _tooltip: js.Any = js.native
    
    var _tooltipContainer: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def clearElement(): Unit = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltipService: Boolean = js.native
    
    @JSName("tooltipContainerElement")
    def tooltipContainerElement_MTooltipService: HTMLElement = js.native
  }
  
  @js.native
  class default protected () extends TooltipService {
    def this(hasEventEmitter: EventEmitterIEventEmitter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
