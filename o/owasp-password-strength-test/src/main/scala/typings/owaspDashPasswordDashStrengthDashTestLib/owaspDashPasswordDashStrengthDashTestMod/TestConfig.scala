package typings
package owaspDashPasswordDashStrengthDashTestLib.owaspDashPasswordDashStrengthDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestConfig extends js.Object {
  /**
    * toggles the "passphrase" mechanism on and off;
    * If set to false, the strength-checker will abandon the notion of "passphrases",
    * and will subject all passwords to the same complexity requirements.
    */
  var allowPassphrases: scala.Boolean
  /** constraint on a password's maximum length */
  var maxLength: scala.Double
  /** constraint on a password's minimum length */
  var minLength: scala.Double
  /**
    * minimum number of optional tests that a password must pass in order to be considered "strong";
    * By default (per the OWASP guidelines), four optional complexity tests are made,
    * and a password must pass at least three of them in order to be considered "strong"
    */
  var minOptionalTestsToPass: scala.Double
  /**
    * minimum length a password needs to achieve in order to be considered a "passphrase"
    * (and thus exempted from the optional complexity tests by default)
    */
  var minPhraseLength: scala.Double
}

object TestConfig {
  @scala.inline
  def apply(
    allowPassphrases: scala.Boolean,
    maxLength: scala.Double,
    minLength: scala.Double,
    minOptionalTestsToPass: scala.Double,
    minPhraseLength: scala.Double
  ): TestConfig = {
    val __obj = js.Dynamic.literal(allowPassphrases = allowPassphrases, maxLength = maxLength, minLength = minLength, minOptionalTestsToPass = minOptionalTestsToPass, minPhraseLength = minPhraseLength)
  
    __obj.asInstanceOf[TestConfig]
  }
}

