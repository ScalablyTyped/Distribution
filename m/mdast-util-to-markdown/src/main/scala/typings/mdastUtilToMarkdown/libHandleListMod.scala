package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleListMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def list(node: List_, parent: Unit, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def list(node: List_, parent: Parent, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  type List_ = typings.mdast.mod.List
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
