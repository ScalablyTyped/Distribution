package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distDialogSrcDialogTriggerContextMod.DialogTriggerContextType
import typings.orbitUiReactComponents.distDialogSrcDialogTriggerMod.InnerDialogTriggerProps
import typings.orbitUiReactComponents.distModalSrcModalMod.InnerModalProps
import typings.orbitUiReactComponents.distModalSrcModalTriggerMod.InnerModalTriggerProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModalMod {
  
  @JSImport("@orbit-ui/react-components/dist/modal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerModal(hasFullscreenDismissableZIndexChildrenForwardedRefRest: InnerModalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerModal")(hasFullscreenDismissableZIndexChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerModalTrigger(hasDismissableForwardedRefRest: InnerModalTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerModalTrigger")(hasDismissableForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/modal", "Modal")
  @js.native
  val Modal: OrbitComponent[HTMLElement, InnerModalProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/modal", "ModalTrigger")
  @js.native
  val ModalTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  inline def useModalTriggerContext(): DialogTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useModalTriggerContext")().asInstanceOf[DialogTriggerContextType]
}
