package typings.nivoTooltip

import typings.nivoTooltip.anon.Actions
import typings.nivoTooltip.basicTooltipMod.BasicTooltipProps
import typings.nivoTooltip.chipMod.ChipProps
import typings.nivoTooltip.contextMod.TooltipActionsContextData
import typings.nivoTooltip.contextMod.TooltipStateContextData
import typings.nivoTooltip.contextMod.TooltipStateContextDataHidden
import typings.nivoTooltip.crosshairMod.CrosshairProps
import typings.nivoTooltip.tableTooltipMod.TableTooltipProps
import typings.nivoTooltip.tooltipProviderMod.TooltipProviderProps
import typings.nivoTooltip.tooltipWrapperMod.TooltipWrapperProps
import typings.react.mod.Context
import typings.react.mod.MemoExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  val BasicTooltip: NamedExoticComponent[BasicTooltipProps] = js.native
  
  @JSImport("@nivo/tooltip", "Chip")
  @js.native
  val Chip: NamedExoticComponent[ChipProps] = js.native
  
  @JSImport("@nivo/tooltip", "Crosshair")
  @js.native
  val Crosshair: MemoExoticComponent[js.Function1[/* hasWidthHeightTypeXY */ CrosshairProps, Element]] = js.native
  
  @JSImport("@nivo/tooltip", "TableTooltip")
  @js.native
  val TableTooltip: MemoExoticComponent[js.Function1[/* hasTitleRowsRenderContent */ TableTooltipProps, Element | Null]] = js.native
  
  @JSImport("@nivo/tooltip", "Tooltip")
  @js.native
  def Tooltip(): Element | Null = js.native
  
  @JSImport("@nivo/tooltip", "TooltipActionsContext")
  @js.native
  val TooltipActionsContext: Context[TooltipActionsContextData] = js.native
  
  @JSImport("@nivo/tooltip", "TooltipProvider")
  @js.native
  def TooltipProvider(hasContainerChildren: PropsWithChildren[TooltipProviderProps]): Element = js.native
  
  @JSImport("@nivo/tooltip", "TooltipStateContext")
  @js.native
  val TooltipStateContext: Context[TooltipStateContextData] = js.native
  
  @JSImport("@nivo/tooltip", "TooltipWrapper")
  @js.native
  val TooltipWrapper: NamedExoticComponent[PropsWithChildren[TooltipWrapperProps]] = js.native
  
  @JSImport("@nivo/tooltip", "hiddenTooltipState")
  @js.native
  val hiddenTooltipState: TooltipStateContextDataHidden = js.native
  
  @JSImport("@nivo/tooltip", "isVisibleTooltipState")
  @js.native
  def isVisibleTooltipState(state: TooltipStateContextData): /* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean = js.native
  
  @JSImport("@nivo/tooltip", "useTooltip")
  @js.native
  def useTooltip(): TooltipActionsContextData = js.native
  
  @JSImport("@nivo/tooltip", "useTooltipHandlers")
  @js.native
  def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = js.native
  
  @JSImport("@nivo/tooltip", "useTooltipState")
  @js.native
  def useTooltipState(): TooltipStateContextData = js.native
}
