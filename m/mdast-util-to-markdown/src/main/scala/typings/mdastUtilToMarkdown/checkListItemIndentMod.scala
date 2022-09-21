package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.mixed
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.one
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.tab
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkListItemIndentMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-list-item-indent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkListItemIndent(context: Context): Exclude[js.UndefOr[tab | one | mixed], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkListItemIndent")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[tab | one | mixed], Unit]]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Options = typings.mdastUtilToMarkdown.typesMod.Options
}
