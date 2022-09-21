package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.dialogTriggerContextMod.DialogTriggerContextType
import typings.orbitUiReactComponents.dialogTriggerMod.InnerDialogTriggerProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.modalTriggerMod.InnerModalTriggerProps
import typings.orbitUiReactComponents.srcModalMod.InnerModalProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/modal/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerModal(hasFullscreenDismissableZIndexChildrenForwardedRefRest: InnerModalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerModal")(hasFullscreenDismissableZIndexChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerModalTrigger(hasDismissableForwardedRefRest: InnerModalTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerModalTrigger")(hasDismissableForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/modal/src", "Modal")
  @js.native
  val Modal: OrbitComponent[HTMLElement, InnerModalProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/modal/src", "ModalTrigger")
  @js.native
  val ModalTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  inline def useModalTriggerContext(): DialogTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useModalTriggerContext")().asInstanceOf[DialogTriggerContextType]
}
