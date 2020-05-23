package typings.owaspPasswordStrengthTest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<owasp-password-strength-test.owasp-password-strength-test.TestConfig> */
trait PartialTestConfig extends js.Object {
  var allowPassphrases: js.UndefOr[Boolean] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minOptionalTestsToPass: js.UndefOr[Double] = js.undefined
  var minPhraseLength: js.UndefOr[Double] = js.undefined
}

object PartialTestConfig {
  @scala.inline
  def apply(
    allowPassphrases: js.UndefOr[Boolean] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    minOptionalTestsToPass: js.UndefOr[Double] = js.undefined,
    minPhraseLength: js.UndefOr[Double] = js.undefined
  ): PartialTestConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPassphrases)) __obj.updateDynamic("allowPassphrases")(allowPassphrases.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOptionalTestsToPass)) __obj.updateDynamic("minOptionalTestsToPass")(minOptionalTestsToPass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPhraseLength)) __obj.updateDynamic("minPhraseLength")(minPhraseLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTestConfig]
  }
}

