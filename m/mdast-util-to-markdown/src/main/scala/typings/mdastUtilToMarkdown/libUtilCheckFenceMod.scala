package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Graveaccent
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Tilde
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckFenceMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-fence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkFence(state: State): Exclude[js.UndefOr[Tilde | Graveaccent | Null], js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFence")(state.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Tilde | Graveaccent | Null], js.UndefOr[Null]]]
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
