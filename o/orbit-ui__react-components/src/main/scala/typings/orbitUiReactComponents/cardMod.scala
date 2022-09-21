package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcCardMod.InnerCardProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@orbit-ui/react-components/dist/card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/card", "Card")
  @js.native
  val Card: OrbitComponent[HTMLElement, InnerCardProps] = js.native
  
  inline def InnerCard(hasOrientationSizeFluidAsChildrenForwardedRefRest: InnerCardProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCard")(hasOrientationSizeFluidAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
