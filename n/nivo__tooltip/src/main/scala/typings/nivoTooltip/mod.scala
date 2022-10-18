package typings.nivoTooltip

import typings.nivoTooltip.anon.Actions
import typings.nivoTooltip.distTypesBasicTooltipMod.BasicTooltipProps
import typings.nivoTooltip.distTypesChipMod.ChipProps
import typings.nivoTooltip.distTypesContextMod.TooltipActionsContextData
import typings.nivoTooltip.distTypesContextMod.TooltipStateContextData
import typings.nivoTooltip.distTypesContextMod.TooltipStateContextDataHidden
import typings.nivoTooltip.distTypesCrosshairMod.CrosshairProps
import typings.nivoTooltip.distTypesTableTooltipMod.TableTooltipProps
import typings.nivoTooltip.distTypesTooltipProviderMod.TooltipProviderProps
import typings.nivoTooltip.distTypesTooltipWrapperMod.TooltipWrapperProps
import typings.react.mod.Context
import typings.react.mod.MemoExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def Tooltip(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltip")().asInstanceOf[Element | Null]
  
  @JSImport("@nivo/tooltip", "TooltipActionsContext")
  @js.native
  val TooltipActionsContext: Context[TooltipActionsContextData] = js.native
  
  inline def TooltipProvider(hasContainerChildren: PropsWithChildren[TooltipProviderProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TooltipProvider")(hasContainerChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/tooltip", "TooltipStateContext")
  @js.native
  val TooltipStateContext: Context[TooltipStateContextData] = js.native
  
  @JSImport("@nivo/tooltip", "TooltipWrapper")
  @js.native
  val TooltipWrapper: NamedExoticComponent[PropsWithChildren[TooltipWrapperProps]] = js.native
  
  @JSImport("@nivo/tooltip", "hiddenTooltipState")
  @js.native
  val hiddenTooltipState: TooltipStateContextDataHidden = js.native
  
  inline def isVisibleTooltipState(state: TooltipStateContextData): /* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisibleTooltipState")(state.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean]
  
  inline def useTooltip(): TooltipActionsContextData = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")().asInstanceOf[TooltipActionsContextData]
  
  inline def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipHandlers")(container.asInstanceOf[js.Any]).asInstanceOf[Actions]
  
  inline def useTooltipState(): TooltipStateContextData = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipState")().asInstanceOf[TooltipStateContextData]
}
