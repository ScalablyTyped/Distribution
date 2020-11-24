package typings.playable

import typings.playable.tooltipTypesMod.ITooltipPosition
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/tooltip/utils/getTooltipPositionByReferenceElement", JSImport.Namespace)
@js.native
object getTooltipPositionByReferenceElementMod extends js.Object {
  
  def default(tooltipReferenceElement: HTMLElement, tooltipContainerElement: HTMLElement): ITooltipPosition = js.native
  def default(
    tooltipReferenceElement: HTMLElement,
    tooltipContainerElement: HTMLElement,
    tooltipCenterXfn: ITooltipCenterXfn
  ): ITooltipPosition = js.native
  
  type ITooltipCenterXfn = js.Function2[/* tooltipReferenceOffsetX */ Double, /* tooltipReferenceWidth */ Double, Double]
}
