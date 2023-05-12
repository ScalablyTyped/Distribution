package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.mixed
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.one
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.tab
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckListItemIndentMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-list-item-indent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkListItemIndent(state: State): Exclude[js.UndefOr[tab | one | mixed | Null], js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkListItemIndent")(state.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[tab | one | mixed | Null], js.UndefOr[Null]]]
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
