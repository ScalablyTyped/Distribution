package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilFormatCodeAsIndentedMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/format-code-as-indented", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatCodeAsIndented(node: Code, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCodeAsIndented")(node.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Code = typings.mdast.mod.Code
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
