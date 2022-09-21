package typings.mdastUtilToMarkdown

import typings.mdast.mod.List
import typings.mdastUtilToMarkdown.typesMod.Context
import typings.mdastUtilToMarkdown.typesMod.Parent
import typings.mdastUtilToMarkdown.typesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def list(node: List_, parent: Null, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def list(node: List_, parent: Unit, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def list(node: List_, parent: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typings.mdastUtilToMarkdown.typesMod.Handle
  
  type List_ = List
}
