package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings._underscore
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.`-_`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckRuleMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkRule(state: State): Exclude[js.UndefOr[`-_` | _underscore | Asterisk | Null], js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkRule")(state.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[`-_` | _underscore | Asterisk | Null], js.UndefOr[Null]]]
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
