package typings.mdastUtilToMarkdown

import typings.mdast.mod.ThematicBreak
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleThematicBreakMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/thematic-break", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def thematicBreak(_underscore: ThematicBreak_, _1: Unit, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("thematicBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def thematicBreak(_underscore: ThematicBreak_, _1: Parent, state: State): String = (^.asInstanceOf[js.Dynamic].applyDynamic("thematicBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
  
  type ThematicBreak_ = ThematicBreak
}
