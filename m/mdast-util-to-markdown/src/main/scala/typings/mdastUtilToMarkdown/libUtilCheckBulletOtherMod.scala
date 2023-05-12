package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Plussign
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.`-_`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckBulletOtherMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-bullet-other", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkBulletOther(state: State): Exclude[js.UndefOr[`-_` | Asterisk | Plussign | Null], js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkBulletOther")(state.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[`-_` | Asterisk | Plussign | Null], js.UndefOr[Null]]]
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
