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
  
  inline def checkFence(context: Context): Exclude[js.UndefOr[Tilde | Graveaccent], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFence")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Tilde | Graveaccent], Unit]]
  
  type Context = typings.mdastUtilToMarkdown.libTypesMod.Context
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
}
