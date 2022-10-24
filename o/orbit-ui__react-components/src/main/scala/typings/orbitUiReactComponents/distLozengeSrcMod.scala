package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distLozengeSrcLozengeMod.InnerLozengeProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLozengeSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/lozenge/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerLozenge(param0: InnerLozengeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLozenge")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/lozenge/src", "Lozenge")
  @js.native
  val Lozenge: OrbitComponent[HTMLElement, InnerLozengeProps] = js.native
}
