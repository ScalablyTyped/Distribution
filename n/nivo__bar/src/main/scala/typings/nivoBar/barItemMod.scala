package typings.nivoBar

import typings.nivoBar.typesMod.BarDatum
import typings.nivoBar.typesMod.BarItemProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barItemMod {
  
  @JSImport("@nivo/bar/dist/types/BarItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BarItem[RawDatum /* <: BarDatum */](
    hasHasDataBarHasBorderColorColorHeightLabelColorLabelOpacityLabelXLabelYTransformWidthBorderRadiusBorderWidthLabelShouldRenderLabelIsInteractiveOnClickOnMouseEnterOnMouseLeaveTooltipIsFocusableAriaLabelAriaLabelledByAriaDescribedBy: BarItemProps[RawDatum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BarItem")(hasHasDataBarHasBorderColorColorHeightLabelColorLabelOpacityLabelXLabelYTransformWidthBorderRadiusBorderWidthLabelShouldRenderLabelIsInteractiveOnClickOnMouseEnterOnMouseLeaveTooltipIsFocusableAriaLabelAriaLabelledByAriaDescribedBy.asInstanceOf[js.Any]).asInstanceOf[Element]
}
