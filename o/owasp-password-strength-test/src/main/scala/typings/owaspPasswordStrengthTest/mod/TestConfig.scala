package typings.owaspPasswordStrengthTest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestConfig extends js.Object {
  /**
    * toggles the "passphrase" mechanism on and off;
    * If set to false, the strength-checker will abandon the notion of "passphrases",
    * and will subject all passwords to the same complexity requirements.
    */
  var allowPassphrases: Boolean = js.native
  /** constraint on a password's maximum length */
  var maxLength: Double = js.native
  /** constraint on a password's minimum length */
  var minLength: Double = js.native
  /**
    * minimum number of optional tests that a password must pass in order to be considered "strong";
    * By default (per the OWASP guidelines), four optional complexity tests are made,
    * and a password must pass at least three of them in order to be considered "strong"
    */
  var minOptionalTestsToPass: Double = js.native
  /**
    * minimum length a password needs to achieve in order to be considered a "passphrase"
    * (and thus exempted from the optional complexity tests by default)
    */
  var minPhraseLength: Double = js.native
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
  @scala.inline
  implicit class TestConfigOps[Self <: TestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowPassphrases(value: Boolean): Self = this.set("allowPassphrases", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinOptionalTestsToPass(value: Double): Self = this.set("minOptionalTestsToPass", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPhraseLength(value: Double): Self = this.set("minPhraseLength", value.asInstanceOf[js.Any])
  }
  
}

