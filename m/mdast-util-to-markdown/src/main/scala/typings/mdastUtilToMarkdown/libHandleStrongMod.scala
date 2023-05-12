package typings.mdastUtilToMarkdown

import typings.mdast.mod.Strong
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleStrongMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/strong", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def strong(node: Strong_, _underscore: Unit, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strong")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def strong(node: Strong_, _underscore: Parent, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strong")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
  
  type Strong_ = Strong
}
