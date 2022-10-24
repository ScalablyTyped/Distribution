package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distBadgeSrcBadgeMod.InnerBadgeProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBadgeMod {
  
  @JSImport("@orbit-ui/react-components/dist/badge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/badge", "Badge")
  @js.native
  val Badge: OrbitComponent[HTMLElement, InnerBadgeProps] = js.native
  
  inline def InnerBadge(param0: InnerBadgeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerBadge")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
