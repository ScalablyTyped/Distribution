package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distDialogSrcDialogMod.InnerDialogProps
import typings.orbitUiReactComponents.distDialogSrcDialogTriggerContextMod.DialogTriggerContextType
import typings.orbitUiReactComponents.distDialogSrcDialogTriggerMod.InnerDialogTriggerProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDialogSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src", "Dialog")
  @js.native
  val Dialog: OrbitComponent[HTMLElement, InnerDialogProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src", "DialogTrigger")
  @js.native
  val DialogTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src", "DialogTriggerContext")
  @js.native
  val DialogTriggerContext: Context[DialogTriggerContextType] = js.native
  
  inline def InnerDialog(param0: InnerDialogProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDialog")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDialogTrigger(param0: InnerDialogTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDialogTrigger")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useDialogTriggerContext(): DialogTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useDialogTriggerContext")().asInstanceOf[DialogTriggerContextType]
}
