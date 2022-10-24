package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distDialogSrcDialogTriggerMod.InnerDialogTriggerProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModalSrcModalTriggerMod {
  
  @JSImport("@orbit-ui/react-components/dist/modal/src/ModalTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerModalTrigger(param0: InnerModalTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerModalTrigger")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/modal/src/ModalTrigger", "ModalTrigger")
  @js.native
  val ModalTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  type InnerModalTriggerProps = InnerDialogTriggerProps
  
  type ModalTriggerProps = ComponentProps[OrbitComponent[HTMLElement, InnerDialogTriggerProps]]
}
