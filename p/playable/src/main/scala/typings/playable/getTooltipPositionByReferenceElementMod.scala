package typings.playable

import typings.playable.tooltipTypesMod.ITooltipPosition
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTooltipPositionByReferenceElementMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/utils/getTooltipPositionByReferenceElement", JSImport.Default)
  @js.native
  def default(tooltipReferenceElement: HTMLElement, tooltipContainerElement: HTMLElement): ITooltipPosition = js.native
  @JSImport("playable/dist/src/modules/ui/core/tooltip/utils/getTooltipPositionByReferenceElement", JSImport.Default)
  @js.native
  def default(
    tooltipReferenceElement: HTMLElement,
    tooltipContainerElement: HTMLElement,
    tooltipCenterXfn: ITooltipCenterXfn
  ): ITooltipPosition = js.native
  
  type ITooltipCenterXfn = js.Function2[/* tooltipReferenceOffsetX */ Double, /* tooltipReferenceWidth */ Double, Double]
}
