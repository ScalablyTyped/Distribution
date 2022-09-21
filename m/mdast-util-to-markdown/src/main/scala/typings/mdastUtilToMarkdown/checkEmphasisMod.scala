package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings._underscore
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkEmphasisMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-emphasis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkEmphasis(context: Context): Exclude[js.UndefOr[Asterisk | _underscore], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkEmphasis")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Asterisk | _underscore], Unit]]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Options = typings.mdastUtilToMarkdown.typesMod.Options
}
