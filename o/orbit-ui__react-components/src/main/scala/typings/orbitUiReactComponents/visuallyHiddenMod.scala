package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcVisuallyHiddenMod.InnerVisuallyHiddenProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visuallyHiddenMod {
  
  @JSImport("@orbit-ui/react-components/dist/visually-hidden", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerVisuallyHidden(hasAsChildrenForwardedRefRest: InnerVisuallyHiddenProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerVisuallyHidden")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/visually-hidden", "VisuallyHidden")
  @js.native
  val VisuallyHidden: OrbitComponent[HTMLElement, InnerVisuallyHiddenProps] = js.native
}
