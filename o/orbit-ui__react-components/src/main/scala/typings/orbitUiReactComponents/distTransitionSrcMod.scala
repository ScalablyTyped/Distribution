package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distTransitionSrcTransitionMod.InnerTransitionProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransitionSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/transition/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTransition(param0: InnerTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTransition")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/transition/src", "Transition")
  @js.native
  val Transition: OrbitComponent[HTMLElement, InnerTransitionProps] = js.native
}
