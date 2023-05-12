package typings.mdastUtilToMarkdown

import typings.mdast.mod.Blockquote
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleBlockquoteMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/blockquote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blockquote(node: Blockquote_, _underscore: Unit, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blockquote(node: Blockquote_, _underscore: Parent, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Blockquote_ = Blockquote
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  type Map = typings.mdastUtilToMarkdown.libTypesMod.Map
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
