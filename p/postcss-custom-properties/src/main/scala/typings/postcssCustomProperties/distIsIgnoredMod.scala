package typings.postcssCustomProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIsIgnoredMod {
  
  @JSImport("postcss-custom-properties/dist/is-ignored", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBlockIgnored(ruleOrDeclaration: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockIgnored")(ruleOrDeclaration.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRuleIgnored(rule: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRuleIgnored")(rule.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
