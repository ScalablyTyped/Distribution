package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distAlertSrcAlertMod.InnerAlertProps
import typings.orbitUiReactComponents.distAlertSrcAlertTriggerMod.InnerAlertTriggerProps
import typings.orbitUiReactComponents.distDialogSrcDialogTriggerMod.InnerDialogTriggerProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAlertMod {
  
  @JSImport("@orbit-ui/react-components/dist/alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/alert", "Alert")
  @js.native
  val Alert: OrbitComponent[HTMLElement, InnerAlertProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/alert", "AlertTrigger")
  @js.native
  val AlertTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  inline def InnerAlert(param0: InnerAlertProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAlert")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAlertTrigger(param0: InnerAlertTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAlertTrigger")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
