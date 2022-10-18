package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distDialogSrcDialogTriggerMod.InnerDialogTriggerProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAlertSrcAlertTriggerMod {
  
  @JSImport("@orbit-ui/react-components/dist/alert/src/AlertTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/alert/src/AlertTrigger", "AlertTrigger")
  @js.native
  val AlertTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  inline def InnerAlertTrigger(hasForwardedRefRest: InnerAlertTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAlertTrigger")(hasForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type AlertTriggerProps = ComponentProps[OrbitComponent[HTMLElement, InnerDialogTriggerProps]]
  
  type InnerAlertTriggerProps = InnerDialogTriggerProps
}
