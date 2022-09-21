package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcTransitionMod.InnerTransitionProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/transition/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTransition(hasShowAnimateFirstRenderEnterLeaveAsChildrenForwardedRefRest: InnerTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTransition")(hasShowAnimateFirstRenderEnterLeaveAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/transition/src", "Transition")
  @js.native
  val Transition: OrbitComponent[HTMLElement, InnerTransitionProps] = js.native
}
