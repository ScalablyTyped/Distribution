package typings.mdastUtilToMarkdown

import typings.mdast.mod.Heading
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleHeadingMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/heading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def heading(node: Heading_, _underscore: Unit, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("heading")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def heading(node: Heading_, _underscore: Parent, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("heading")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Heading_ = Heading
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
