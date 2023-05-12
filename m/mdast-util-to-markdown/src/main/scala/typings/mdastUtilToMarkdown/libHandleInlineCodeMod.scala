package typings.mdastUtilToMarkdown

import typings.mdast.mod.InlineCode
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleInlineCodeMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/inline-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inlineCode(node: InlineCode_, _underscore: Unit, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineCode")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inlineCode(node: InlineCode_, _underscore: Parent, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineCode")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type InlineCode_ = InlineCode
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
