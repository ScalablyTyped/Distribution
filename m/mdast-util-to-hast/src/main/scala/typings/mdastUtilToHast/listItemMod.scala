package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.ListItem
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/list-item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listItem(h: H, node: ListItem_, parent: List): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Content = typings.mdastUtilToHast.libMod.Content
  
  type Element = typings.hast.mod.Element
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type List = typings.mdast.mod.List
  
  type ListItem_ = ListItem
  
  type Properties = typings.hast.mod.Properties
}
