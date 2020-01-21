package typings.owaspPasswordStrengthTest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestConfig extends js.Object {
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
  @scala.inline
  def apply(
    allowPassphrases: Boolean,
    maxLength: Double,
    minLength: Double,
    minOptionalTestsToPass: Double,
    minPhraseLength: Double
  ): TestConfig = {
    val __obj = js.Dynamic.literal(allowPassphrases = allowPassphrases.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minOptionalTestsToPass = minOptionalTestsToPass.asInstanceOf[js.Any], minPhraseLength = minPhraseLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestConfig]
  }
}

