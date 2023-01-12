package typings.owaspPasswordStrengthTest

import typings.owaspPasswordStrengthTest.anon.PartialTestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("owasp-password-strength-test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(configuration: PartialTestConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(configuration.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Inlined std.Readonly<owasp-password-strength-test.owasp-password-strength-test.TestConfig> */
  object configs {
    
    @JSImport("owasp-password-strength-test", "configs.allowPassphrases")
    @js.native
    val allowPassphrases: Boolean = js.native
    
    @JSImport("owasp-password-strength-test", "configs.maxLength")
    @js.native
    val maxLength: Double = js.native
    
    @JSImport("owasp-password-strength-test", "configs.minLength")
    @js.native
    val minLength: Double = js.native
    
    @JSImport("owasp-password-strength-test", "configs.minOptionalTestsToPass")
    @js.native
    val minOptionalTestsToPass: Double = js.native
    
    @JSImport("owasp-password-strength-test", "configs.minPhraseLength")
    @js.native
    val minPhraseLength: Double = js.native
  }
  
  inline def test(password: String): TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(password.asInstanceOf[js.Any]).asInstanceOf[TestResult]
  
  object tests {
    
    @JSImport("owasp-password-strength-test", "tests")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("owasp-password-strength-test", "tests.optional")
    @js.native
    def optional: js.Array[PasswordTest] = js.native
    inline def optional_=(x: js.Array[PasswordTest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optional")(x.asInstanceOf[js.Any])
    
    @JSImport("owasp-password-strength-test", "tests.required")
    @js.native
    def required: js.Array[PasswordTest] = js.native
    inline def required_=(x: js.Array[PasswordTest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
  }
  
  type PasswordTest = js.Function1[/* password */ String, js.UndefOr[String]]
  
  trait TestConfig extends StObject {
    
    /**
      * toggles the "passphrase" mechanism on and off;
      * If set to false, the strength-checker will abandon the notion of "passphrases",
      * and will subject all passwords to the same complexity requirements.
      */
    var allowPassphrases: Boolean
    
    /** constraint on a password's maximum length */
    var maxLength: Double
    
    /** constraint on a password's minimum length */
    var minLength: Double
    
    /**
      * minimum number of optional tests that a password must pass in order to be considered "strong";
      * By default (per the OWASP guidelines), four optional complexity tests are made,
      * and a password must pass at least three of them in order to be considered "strong"
      */
    var minOptionalTestsToPass: Double
    
    /**
      * minimum length a password needs to achieve in order to be considered a "passphrase"
      * (and thus exempted from the optional complexity tests by default)
      */
    var minPhraseLength: Double
  }
  object TestConfig {
    
    inline def apply(
      allowPassphrases: Boolean,
      maxLength: Double,
      minLength: Double,
      minOptionalTestsToPass: Double,
      minPhraseLength: Double
    ): TestConfig = {
      val __obj = js.Dynamic.literal(allowPassphrases = allowPassphrases.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minOptionalTestsToPass = minOptionalTestsToPass.asInstanceOf[js.Any], minPhraseLength = minPhraseLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestConfig] (val x: Self) extends AnyVal {
      
      inline def setAllowPassphrases(value: Boolean): Self = StObject.set(x, "allowPassphrases", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinOptionalTestsToPass(value: Double): Self = StObject.set(x, "minOptionalTestsToPass", value.asInstanceOf[js.Any])
      
      inline def setMinPhraseLength(value: Double): Self = StObject.set(x, "minPhraseLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestResult extends StObject {
    
    /** error messages associated with the failed tests */
    var errors: js.Array[String]
    
    /** enumerates which tests have failed, beginning from 0 with the first required test */
    var failedTests: js.Array[Double]
    
    /** indicates whether or not the password was considered to be a passphrase */
    var isPassphrase: Boolean
    
    /** error messages of optional tests that have failed */
    var optionalTestErrors: js.Array[String]
    
    /**
      * indicates how many of the optional tests were passed;
      * In order for the password to be considered "strong", it (by default) must either be a passphrase,
      * or must pass a number of optional tests that is equal to or greater than configs.minOptionalTestsToPass
      */
    var optionalTestsPassed: Double
    
    /** enumerates which tests have succeeded, beginning from 0 with the first required test */
    var passedTests: js.Array[Double]
    
    /** error messages of required tests that have failed */
    var requiredTestErrors: js.Array[String]
    
    /** indicates whether or not the user's password satisfied the strength requirements */
    var strong: Boolean
  }
  object TestResult {
    
    inline def apply(
      errors: js.Array[String],
      failedTests: js.Array[Double],
      isPassphrase: Boolean,
      optionalTestErrors: js.Array[String],
      optionalTestsPassed: Double,
      passedTests: js.Array[Double],
      requiredTestErrors: js.Array[String],
      strong: Boolean
    ): TestResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failedTests = failedTests.asInstanceOf[js.Any], isPassphrase = isPassphrase.asInstanceOf[js.Any], optionalTestErrors = optionalTestErrors.asInstanceOf[js.Any], optionalTestsPassed = optionalTestsPassed.asInstanceOf[js.Any], passedTests = passedTests.asInstanceOf[js.Any], requiredTestErrors = requiredTestErrors.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFailedTests(value: js.Array[Double]): Self = StObject.set(x, "failedTests", value.asInstanceOf[js.Any])
      
      inline def setFailedTestsVarargs(value: Double*): Self = StObject.set(x, "failedTests", js.Array(value*))
      
      inline def setIsPassphrase(value: Boolean): Self = StObject.set(x, "isPassphrase", value.asInstanceOf[js.Any])
      
      inline def setOptionalTestErrors(value: js.Array[String]): Self = StObject.set(x, "optionalTestErrors", value.asInstanceOf[js.Any])
      
      inline def setOptionalTestErrorsVarargs(value: String*): Self = StObject.set(x, "optionalTestErrors", js.Array(value*))
      
      inline def setOptionalTestsPassed(value: Double): Self = StObject.set(x, "optionalTestsPassed", value.asInstanceOf[js.Any])
      
      inline def setPassedTests(value: js.Array[Double]): Self = StObject.set(x, "passedTests", value.asInstanceOf[js.Any])
      
      inline def setPassedTestsVarargs(value: Double*): Self = StObject.set(x, "passedTests", js.Array(value*))
      
      inline def setRequiredTestErrors(value: js.Array[String]): Self = StObject.set(x, "requiredTestErrors", value.asInstanceOf[js.Any])
      
      inline def setRequiredTestErrorsVarargs(value: String*): Self = StObject.set(x, "requiredTestErrors", js.Array(value*))
      
      inline def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    }
  }
}
