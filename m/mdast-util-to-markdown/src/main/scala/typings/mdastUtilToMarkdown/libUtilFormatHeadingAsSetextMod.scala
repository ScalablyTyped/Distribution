package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilFormatHeadingAsSetextMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/format-heading-as-setext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatHeadingAsSetext(node: Heading, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("formatHeadingAsSetext")(node.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Heading = typings.mdast.mod.Heading
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
