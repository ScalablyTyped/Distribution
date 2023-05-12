package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Quotationmark
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckQuoteMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-quote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkQuote(state: State): Exclude[js.UndefOr[Quotationmark | (/* ' */ String) | Null], js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkQuote")(state.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Quotationmark | (/* ' */ String) | Null], js.UndefOr[Null]]]
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
