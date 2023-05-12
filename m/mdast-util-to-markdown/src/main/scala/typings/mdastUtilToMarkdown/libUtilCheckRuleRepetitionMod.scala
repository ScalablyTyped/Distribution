package typings.mdastUtilToMarkdown

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckRuleRepetitionMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-rule-repetition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkRuleRepetition(state: State): Exclude[js.UndefOr[Double | Null], js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkRuleRepetition")(state.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Double | Null], js.UndefOr[Null]]]
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
