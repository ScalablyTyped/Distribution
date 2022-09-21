package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcBadgeMod.InnerBadgeProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("@orbit-ui/react-components/dist/badge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/badge", "Badge")
  @js.native
  val Badge: OrbitComponent[HTMLElement, InnerBadgeProps] = js.native
  
  inline def InnerBadge(hasVariantOverlapAsChildrenForwardedRefRest: InnerBadgeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerBadge")(hasVariantOverlapAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
