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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nivo/tooltip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val BasicTooltip: NamedExoticComponent[BasicTooltipProps] = js.native
  
  val Chip: NamedExoticComponent[ChipProps] = js.native
  
  val Crosshair: MemoExoticComponent[js.Function1[/* hasWidthHeightTypeXY */ CrosshairProps, Element]] = js.native
  
  val TableTooltip: MemoExoticComponent[js.Function1[/* hasTitleRowsRenderContent */ TableTooltipProps, Element | Null]] = js.native
  
  def Tooltip(): Element | Null = js.native
  
  val TooltipActionsContext: Context[TooltipActionsContextData] = js.native
  
  def TooltipProvider(hasContainerChildren: PropsWithChildren[TooltipProviderProps]): Element = js.native
  
  val TooltipStateContext: Context[TooltipStateContextData] = js.native
  
  val TooltipWrapper: NamedExoticComponent[PropsWithChildren[TooltipWrapperProps]] = js.native
  
  val hiddenTooltipState: TooltipStateContextDataHidden = js.native
  
  def isVisibleTooltipState(state: TooltipStateContextData): /* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean = js.native
  
  def useTooltip(): TooltipActionsContextData = js.native
  
  def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = js.native
  
  def useTooltipState(): TooltipStateContextData = js.native
}
