package typings.mdastUtilToMarkdown

import typings.mdast.mod.Link
import typings.mdastUtilToMarkdown.typesMod.Context
import typings.mdastUtilToMarkdown.typesMod.Parent
import typings.mdastUtilToMarkdown.typesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def link(node: Link_, _underscore: Null, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def link(node: Link_, _underscore: Unit, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def link(node: Link_, _underscore: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Exit = typings.mdastUtilToMarkdown.typesMod.Exit
  
  type Handle = typings.mdastUtilToMarkdown.typesMod.Handle
  
  type Link_ = Link
}
