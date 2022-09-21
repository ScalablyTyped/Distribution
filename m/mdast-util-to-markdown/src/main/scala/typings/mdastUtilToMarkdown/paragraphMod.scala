package typings.mdastUtilToMarkdown

import typings.mdast.mod.Paragraph
import typings.mdastUtilToMarkdown.typesMod.Context
import typings.mdastUtilToMarkdown.typesMod.Parent
import typings.mdastUtilToMarkdown.typesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paragraphMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/paragraph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paragraph(node: Paragraph_, _underscore: Null, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def paragraph(node: Paragraph_, _underscore: Unit, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def paragraph(node: Paragraph_, _underscore: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typings.mdastUtilToMarkdown.typesMod.Handle
  
  type Paragraph_ = Paragraph
}
