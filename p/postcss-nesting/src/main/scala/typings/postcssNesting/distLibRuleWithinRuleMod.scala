package typings.postcssNesting

import typings.postcss.mod.Result
import typings.postcss.mod.Rule_
import typings.postcssNesting.distLibOptionsMod.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRuleWithinRuleMod {
  
  @JSImport("postcss-nesting/dist/lib/rule-within-rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Rule_, parent: Rule_, result: Result, opts: options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], result.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isValidRuleWithinRule(node: Rule_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidRuleWithinRule")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
