package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcTooltipMod.InnerTooltipProps
import typings.orbitUiReactComponents.tooltipTriggerMod.InnerTooltipTriggerProps
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/tooltip/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTooltip(hasAsChildrenForwardedRefRest: InnerTooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTooltip")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTooltipTrigger(
    hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest: InnerTooltipTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTooltipTrigger")(hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tooltip/src", "Tooltip")
  @js.native
  val Tooltip: OrbitComponent[HTMLElement, InnerTooltipProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tooltip/src", "TooltipTrigger")
  @js.native
  val TooltipTrigger: OrbitComponent[HTMLElement, InnerTooltipTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tooltip/src", "TooltipTriggerContext")
  @js.native
  val TooltipTriggerContext: Context[js.Object] = js.native
  
  inline def parseTooltipTrigger(children: ReactNode): js.Tuple2[ReactElement, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTooltipTrigger")(children.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ReactElement, ReactElement]]
  
  inline def useTooltipTriggerContext(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipTriggerContext")().asInstanceOf[js.Object]
}
