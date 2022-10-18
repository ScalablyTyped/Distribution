package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityPasswordRulesUtilitiesMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/PasswordRulesUtilities", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PasswordRulesUtilities
  @JSImport("@nginstack/engine/lib/security/PasswordRulesUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePassword(len: Double, useCapitals: Any, useNumbers: Any, useSpecial: Any, noRepeat: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePassword")(len.asInstanceOf[js.Any], useCapitals.asInstanceOf[js.Any], useNumbers.asInstanceOf[js.Any], useSpecial.asInstanceOf[js.Any], noRepeat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generatePasswordRuleBased(passwordRuleKey: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePasswordRuleBased")(passwordRuleKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPasswordStrength(password: String, maxLen: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPasswordStrength")(password.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def validatePassword(password: String, passwordRuleKey: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePassword")(password.asInstanceOf[js.Any], passwordRuleKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait PasswordRulesUtilities extends StObject
}
