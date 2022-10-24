package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distIllustrationSrcIllustrationMod.InnerIllustrationProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIllustrationSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/illustration/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/illustration/src", "Illustration")
  @js.native
  val Illustration: OrbitComponent[HTMLElement, InnerIllustrationProps] = js.native
  
  inline def InnerIllustration(param0: InnerIllustrationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIllustration")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
