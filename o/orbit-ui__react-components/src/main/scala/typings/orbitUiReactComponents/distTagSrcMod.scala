package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distTagSrcTagListMod.InnerTagListProps
import typings.orbitUiReactComponents.distTagSrcTagMod.InnerTagProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTagSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/tag/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTag(param0: InnerTagProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTag")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTagList(param0: InnerTagListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTagList")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tag/src", "Tag")
  @js.native
  val Tag: OrbitComponent[HTMLElement, InnerTagProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tag/src", "TagList")
  @js.native
  val TagList: OrbitComponent[HTMLElement, InnerTagListProps] = js.native
}
