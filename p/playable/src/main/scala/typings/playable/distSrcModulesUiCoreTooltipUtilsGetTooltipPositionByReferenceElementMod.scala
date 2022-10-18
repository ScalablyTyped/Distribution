package typings.playable

import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipPosition
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreTooltipUtilsGetTooltipPositionByReferenceElementMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/utils/getTooltipPositionByReferenceElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tooltipReferenceElement: HTMLElement, tooltipContainerElement: HTMLElement): ITooltipPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tooltipReferenceElement.asInstanceOf[js.Any], tooltipContainerElement.asInstanceOf[js.Any])).asInstanceOf[ITooltipPosition]
  inline def default(
    tooltipReferenceElement: HTMLElement,
    tooltipContainerElement: HTMLElement,
    tooltipCenterXfn: ITooltipCenterXfn
  ): ITooltipPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tooltipReferenceElement.asInstanceOf[js.Any], tooltipContainerElement.asInstanceOf[js.Any], tooltipCenterXfn.asInstanceOf[js.Any])).asInstanceOf[ITooltipPosition]
  
  type ITooltipCenterXfn = js.Function2[/* tooltipReferenceOffsetX */ Double, /* tooltipReferenceWidth */ Double, Double]
}
