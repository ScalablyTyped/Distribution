package typings.mdastUtilToMarkdown

import typings.mdast.mod.ListItem
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleListItemMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/list-item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listItem(node: ListItem_, parent: Unit, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def listItem(node: ListItem_, parent: Parent, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  type ListItem_ = ListItem
  
  type Map = typings.mdastUtilToMarkdown.libTypesMod.Map
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
