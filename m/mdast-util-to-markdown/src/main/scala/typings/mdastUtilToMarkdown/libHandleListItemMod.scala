package typings.mdastUtilToMarkdown

import typings.mdast.mod.ListItem
import typings.mdastUtilToMarkdown.libTypesMod.Context
import typings.mdastUtilToMarkdown.libTypesMod.Parent
import typings.mdastUtilToMarkdown.libTypesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleListItemMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/list-item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listItem(node: ListItem_, parent: Null, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def listItem(node: ListItem_, parent: Unit, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def listItem(node: ListItem_, parent: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typings.mdastUtilToMarkdown.libTypesMod.Handle
  
  type List = typings.mdast.mod.List
  
  type ListItem_ = ListItem
  
  type Map = typings.mdastUtilToMarkdown.libUtilIndentLinesMod.Map
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
}
