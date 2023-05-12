package typings.postcssCustomSelectors

import typings.postcss.mod.Result
import typings.postcss.mod.Rule_
import typings.postcssSelectorParser.mod.Root_
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformRuleMod {
  
  @JSImport("postcss-custom-selectors/dist/transform-rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformRule(rule: Rule_, result: Result, customSelectors: Map[String, Root_]): Null | String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRule")(rule.asInstanceOf[js.Any], result.asInstanceOf[js.Any], customSelectors.asInstanceOf[js.Any])).asInstanceOf[Null | String]
}
