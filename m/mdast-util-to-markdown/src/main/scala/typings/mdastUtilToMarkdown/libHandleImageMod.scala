package typings.mdastUtilToMarkdown

import typings.mdast.mod.Image
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleImageMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def image(node: Image_, _underscore: Unit, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def image(node: Image_, _underscore: Parent, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Image_ = Image
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
