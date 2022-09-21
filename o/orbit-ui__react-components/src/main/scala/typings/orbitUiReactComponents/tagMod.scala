package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcTagMod.InnerTagProps
import typings.orbitUiReactComponents.tagListMod.InnerTagListProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("@orbit-ui/react-components/dist/tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTag(hasVariantOnRemoveDisabledFluidSizeActiveFocusHoverAsChildrenForwardedRefRest: InnerTagProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTag")(hasVariantOnRemoveDisabledFluidSizeActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTagList(hasSizeOnRemoveOnClearReadOnlyAsForwardedRefChildrenRest: InnerTagListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTagList")(hasSizeOnRemoveOnClearReadOnlyAsForwardedRefChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tag", "Tag")
  @js.native
  val Tag: OrbitComponent[HTMLElement, InnerTagProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tag", "TagList")
  @js.native
  val TagList: OrbitComponent[HTMLElement, InnerTagListProps] = js.native
}
