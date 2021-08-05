package typings.nivoTooltip

import typings.nivoTooltip.contextMod.TooltipStateContextData
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@nivo/tooltip/dist/types/Tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Tooltip(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltip")().asInstanceOf[Element | Null]
  
  inline def isVisibleTooltipState(state: TooltipStateContextData): /* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisibleTooltipState")(state.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean]
}
