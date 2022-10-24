package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distListSrcListItemMod.InnerListItemProps
import typings.orbitUiReactComponents.distListSrcListMod.InnerListProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListMod {
  
  @JSImport("@orbit-ui/react-components/dist/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerListItem(param0: InnerListItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerOrderedList(param0: InnerListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOrderedList")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/list", "ListItem")
  @js.native
  val ListItem: OrbitComponent[HTMLElement, InnerListItemProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/list", "OrderedList")
  @js.native
  val OrderedList: OrbitComponent[HTMLElement, InnerListProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/list", "UnorderedList")
  @js.native
  val UnorderedList: OrbitComponent[HTMLElement, InnerListProps] = js.native
}
