package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcLozengeMod.InnerLozengeProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lozengeSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/lozenge/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerLozenge(hasColorSizeAsChildrenForwardedRefRest: InnerLozengeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLozenge")(hasColorSizeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/lozenge/src", "Lozenge")
  @js.native
  val Lozenge: OrbitComponent[HTMLElement, InnerLozengeProps] = js.native
}
