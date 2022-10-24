package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distGroupSrcGroupMod.InnerGroupProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGroupSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/group/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/group/src", "Group")
  @js.native
  val Group: OrbitComponent[HTMLElement, InnerGroupProps] = js.native
  
  inline def InnerGroup(param0: InnerGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
