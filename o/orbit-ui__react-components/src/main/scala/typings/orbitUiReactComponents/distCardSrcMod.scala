package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distCardSrcCardMod.InnerCardProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCardSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/card/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/card/src", "Card")
  @js.native
  val Card: OrbitComponent[HTMLElement, InnerCardProps] = js.native
  
  inline def InnerCard(hasOrientationSizeFluidAsChildrenForwardedRefRest: InnerCardProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCard")(hasOrientationSizeFluidAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
