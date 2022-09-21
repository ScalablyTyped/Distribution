package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcCounterMod.InnerCounterProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counterMod {
  
  @JSImport("@orbit-ui/react-components/dist/counter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/counter", "Counter")
  @js.native
  val Counter: OrbitComponent[HTMLElement, InnerCounterProps] = js.native
  
  inline def InnerCounter(props: InnerCounterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCounter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
