package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.popoverTriggerContextMod.PopoverTriggerContextType
import typings.orbitUiReactComponents.popoverTriggerMod.InnerPopoverTriggerProps
import typings.orbitUiReactComponents.srcPopoverMod.InnerPopoverProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/popover/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerPopover(hasIdFocusAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerPopoverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopover")(hasIdFocusAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerPopoverTrigger(
    hasIdOpenDefaultOpenPositionPropOnOpenChangeDismissableAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest: InnerPopoverTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopoverTrigger")(hasIdOpenDefaultOpenPositionPropOnOpenChangeDismissableAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/popover/src", "Popover")
  @js.native
  val Popover: OrbitComponent[HTMLElement, InnerPopoverProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/popover/src", "PopoverTrigger")
  @js.native
  val PopoverTrigger: OrbitComponent[HTMLElement, InnerPopoverTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/popover/src", "PopoverTriggerContext")
  @js.native
  val PopoverTriggerContext: Context[PopoverTriggerContextType] = js.native
  
  inline def usePopoverTriggerContext(): PopoverTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopoverTriggerContext")().asInstanceOf[PopoverTriggerContextType]
}
