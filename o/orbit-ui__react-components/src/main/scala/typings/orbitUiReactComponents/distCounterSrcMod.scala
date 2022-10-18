package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distCounterSrcCounterMod.InnerCounterProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCounterSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/counter/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/counter/src", "Counter")
  @js.native
  val Counter: OrbitComponent[HTMLElement, InnerCounterProps] = js.native
  
  inline def InnerCounter(props: InnerCounterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCounter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
