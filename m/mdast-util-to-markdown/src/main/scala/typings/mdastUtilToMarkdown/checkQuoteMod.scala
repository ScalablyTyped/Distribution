package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Quotationmark
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkQuoteMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-quote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkQuote(context: Context): Exclude[js.UndefOr[Quotationmark | String], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkQuote")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Quotationmark | String], Unit]]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Options = typings.mdastUtilToMarkdown.typesMod.Options
}
