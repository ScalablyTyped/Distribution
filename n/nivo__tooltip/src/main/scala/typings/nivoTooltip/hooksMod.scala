package typings.nivoTooltip

import typings.nivoTooltip.anon.Actions
import typings.nivoTooltip.contextMod.TooltipActionsContextData
import typings.nivoTooltip.contextMod.TooltipStateContextData
import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/tooltip/dist/types/hooks", "useTooltip")
  @js.native
  def useTooltip(): TooltipActionsContextData = js.native
  
  @JSImport("@nivo/tooltip/dist/types/hooks", "useTooltipHandlers")
  @js.native
  def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = js.native
  
  @JSImport("@nivo/tooltip/dist/types/hooks", "useTooltipState")
  @js.native
  def useTooltipState(): TooltipStateContextData = js.native
}
