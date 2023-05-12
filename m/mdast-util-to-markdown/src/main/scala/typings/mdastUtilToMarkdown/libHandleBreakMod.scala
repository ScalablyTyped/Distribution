package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleBreakMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/break", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hardBreak(_underscore: Break, _1: Unit, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hardBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hardBreak(_underscore: Break, _1: Parent, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hardBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Break = typings.mdast.mod.Break
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
