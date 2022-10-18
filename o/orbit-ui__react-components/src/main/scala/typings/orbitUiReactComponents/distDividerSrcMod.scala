package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distDividerSrcDividerMod.InnerDividerProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDividerSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/divider/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/divider/src", "Divider")
  @js.native
  val Divider: OrbitComponent[HTMLElement, InnerDividerProps] = js.native
  
  inline def InnerDivider(hasOrientationAsChildrenForwardedRefRest: InnerDividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDivider")(hasOrientationAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
