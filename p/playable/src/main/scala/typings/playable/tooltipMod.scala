package typings.playable

import typings.playable.anon.EventEmitterIEventEmitter
import typings.playable.getTooltipPositionByReferenceElementMod.ITooltipCenterXfn
import typings.playable.tooltipTooltipMod.default
import typings.playable.tooltipTypesMod.ITooltipPosition
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/tooltip", JSImport.Namespace)
@js.native
object tooltipMod extends js.Object {
  
  def getTooltipPositionByReferenceElement(tooltipReferenceElement: HTMLElement, tooltipContainerElement: HTMLElement): ITooltipPosition = js.native
  def getTooltipPositionByReferenceElement(
    tooltipReferenceElement: HTMLElement,
    tooltipContainerElement: HTMLElement,
    tooltipCenterXfn: ITooltipCenterXfn
  ): ITooltipPosition = js.native
  
  @js.native
  class Tooltip () extends default
  
  @js.native
  class TooltipService protected ()
    extends typings.playable.tooltipServiceMod.default {
    def this(hasEventEmitter: EventEmitterIEventEmitter) = this()
  }
  /* static members */
  @js.native
  object TooltipService extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
