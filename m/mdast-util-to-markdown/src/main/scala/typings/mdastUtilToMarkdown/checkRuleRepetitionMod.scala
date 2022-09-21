package typings.mdastUtilToMarkdown

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkRuleRepetitionMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-rule-repetition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkRuleRepetition(context: Context): Exclude[js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkRuleRepetition")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Double], Unit]]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Options = typings.mdastUtilToMarkdown.typesMod.Options
}
