package typings.owaspPasswordStrengthTest

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
    maxLength: Int | Double = null,
    minLength: Int | Double = null,
    minOptionalTestsToPass: Int | Double = null,
    minPhraseLength: Int | Double = null
  ): PartialTestConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPassphrases)) __obj.updateDynamic("allowPassphrases")(allowPassphrases.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minOptionalTestsToPass != null) __obj.updateDynamic("minOptionalTestsToPass")(minOptionalTestsToPass.asInstanceOf[js.Any])
    if (minPhraseLength != null) __obj.updateDynamic("minPhraseLength")(minPhraseLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTestConfig]
  }
}

