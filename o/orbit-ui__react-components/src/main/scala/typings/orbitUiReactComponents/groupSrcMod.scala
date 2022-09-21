package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcGroupMod.InnerGroupProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/group/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/group/src", "Group")
  @js.native
  val Group: OrbitComponent[HTMLElement, InnerGroupProps] = js.native
  
  inline def InnerGroup(hasOrientationAlignVerticalAlignWrapChildrenForwardedRefRest: InnerGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerGroup")(hasOrientationAlignVerticalAlignWrapChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
