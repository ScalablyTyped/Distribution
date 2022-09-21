package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.dialogTriggerMod.InnerDialogTriggerProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalTriggerMod {
  
  @JSImport("@orbit-ui/react-components/dist/modal/src/ModalTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerModalTrigger(hasDismissableForwardedRefRest: InnerModalTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerModalTrigger")(hasDismissableForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/modal/src/ModalTrigger", "ModalTrigger")
  @js.native
  val ModalTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  type InnerModalTriggerProps = InnerDialogTriggerProps
  
  type ModalTriggerProps = ComponentProps[OrbitComponent[HTMLElement, InnerDialogTriggerProps]]
}
