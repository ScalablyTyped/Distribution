package typings.nivoTooltip

import typings.nivoTooltip.anon.Actions
import typings.nivoTooltip.contextMod.TooltipActionsContextData
import typings.nivoTooltip.contextMod.TooltipStateContextData
import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/tooltip/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTooltip(): TooltipActionsContextData = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")().asInstanceOf[TooltipActionsContextData]
  
  inline def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipHandlers")(container.asInstanceOf[js.Any]).asInstanceOf[Actions]
  
  inline def useTooltipState(): TooltipStateContextData = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipState")().asInstanceOf[TooltipStateContextData]
}
