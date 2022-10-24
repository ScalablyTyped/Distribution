package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distPopoverSrcPopoverMod.InnerPopoverProps
import typings.orbitUiReactComponents.distPopoverSrcPopoverTriggerContextMod.PopoverTriggerContextType
import typings.orbitUiReactComponents.distPopoverSrcPopoverTriggerMod.InnerPopoverTriggerProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopoverSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/popover/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerPopover(param0: InnerPopoverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopover")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerPopoverTrigger(param0: InnerPopoverTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopoverTrigger")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
