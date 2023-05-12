package typings.postcssCustomProperties

import typings.postcss.mod.Rule_
import typings.postcssCustomProperties.postcssCustomPropertiesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIsProcessableRuleMod {
  
  @JSImport("postcss-custom-properties/dist/is-processable-rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isHtmlRule(rule: Rule_): Double | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("isHtmlRule")(rule.asInstanceOf[js.Any]).asInstanceOf[Double | `false`]
  
  inline def isProcessableRule(rule: Rule_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProcessableRule")(rule.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRootRule(rule: Rule_): Double | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("isRootRule")(rule.asInstanceOf[js.Any]).asInstanceOf[Double | `false`]
}
