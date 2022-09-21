package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcDotMod.InnerDotProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/dot/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dot/src", "Dot")
  @js.native
  val Dot: OrbitComponent[HTMLElement, InnerDotProps] = js.native
  
  inline def InnerDot(props: InnerDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
