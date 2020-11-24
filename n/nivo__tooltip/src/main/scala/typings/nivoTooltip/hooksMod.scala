package typings.nivoTooltip

import typings.nivoTooltip.anon.Actions
import typings.nivoTooltip.contextMod.TooltipActionsContextData
import typings.nivoTooltip.contextMod.TooltipStateContextData
import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nivo/tooltip/dist/types/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  
  def useTooltip(): TooltipActionsContextData = js.native
  
  def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = js.native
  
  def useTooltipState(): TooltipStateContextData = js.native
}
