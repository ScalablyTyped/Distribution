package typings.owaspPasswordStrengthTest

import typings.owaspPasswordStrengthTest.anon.PartialTestConfig
import typings.owaspPasswordStrengthTest.mod.PasswordTest
import typings.owaspPasswordStrengthTest.mod.TestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object owaspPasswordStrengthTest {
    
    @JSGlobal("owaspPasswordStrengthTest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def config(configuration: PartialTestConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(configuration.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* Inlined std.Readonly<owasp-password-strength-test.owasp-password-strength-test.TestConfig> */
    object configs {
      
      @JSGlobal("owaspPasswordStrengthTest.configs.allowPassphrases")
      @js.native
      val allowPassphrases: Boolean = js.native
      
      @JSGlobal("owaspPasswordStrengthTest.configs.maxLength")
      @js.native
      val maxLength: Double = js.native
      
      @JSGlobal("owaspPasswordStrengthTest.configs.minLength")
      @js.native
      val minLength: Double = js.native
      
      @JSGlobal("owaspPasswordStrengthTest.configs.minOptionalTestsToPass")
      @js.native
      val minOptionalTestsToPass: Double = js.native
      
      @JSGlobal("owaspPasswordStrengthTest.configs.minPhraseLength")
      @js.native
      val minPhraseLength: Double = js.native
    }
    
    inline def test(password: String): TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(password.asInstanceOf[js.Any]).asInstanceOf[TestResult]
    
    object tests {
      
      @JSGlobal("owaspPasswordStrengthTest.tests")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("owaspPasswordStrengthTest.tests.optional")
      @js.native
      def optional: js.Array[PasswordTest] = js.native
      inline def optional_=(x: js.Array[PasswordTest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optional")(x.asInstanceOf[js.Any])
      
      @JSGlobal("owaspPasswordStrengthTest.tests.required")
      @js.native
      def required: js.Array[PasswordTest] = js.native
      inline def required_=(x: js.Array[PasswordTest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
    }
  }
}
