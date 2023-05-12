package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings._underscore
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckStrongMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-strong", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkStrong(state: State): Exclude[js.UndefOr[_underscore | Asterisk | Null], js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkStrong")(state.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[_underscore | Asterisk | Null], js.UndefOr[Null]]]
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
