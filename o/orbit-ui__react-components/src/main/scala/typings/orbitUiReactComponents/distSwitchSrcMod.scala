package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSwitchSrcSwitchMod.InnerSwitchProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSwitchSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/switch/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerSwitch(props: InnerSwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSwitch")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/switch/src", "Switch")
  @js.native
  val Switch: OrbitComponent[HTMLElement, InnerSwitchProps] = js.native
}
